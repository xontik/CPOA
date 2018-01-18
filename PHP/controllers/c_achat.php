<?php

require_once(PATH_MODELS.'EmplacementDAO.php');
require_once(PATH_MODELS.'NiveauDAO.php');
require_once(PATH_MODELS.'PromotionDAO.php');
require_once(PATH_MODELS.'BilletDAO.php');
require_once(PATH_MODELS.'LicenceDAO.php');
require_once(PATH_LIB.'foncBase.php');

$jours = array(1, 2, 3, 4, 5, 6, 7, 8, 9);
$emplacementDAO = new EmplacementDAO(DEBUG);
$promotionDAO = new PromotionDAO(DEBUG);
$niveauDAO = new NiveauDAO(DEBUG);
$licenceDAO = new LicenceDAO(DEBUG);
$billetDAO = new BilletDAO(DEBUG);

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	header('Location: index.php');
	exit(-1);

} elseif(isset($_POST['achat']) && in_array($_POST['jour'], $jours)) {
	if(!empty($_POST['codePromo']) && !empty($_POST['licence'])) {
		$_SESSION['toast'] = "Erreur : vous ne pouvez renseigner un code promotionnel et un numéro de licence";
		header('Location: index.php?page=placement&jour='.$_POST['jour']);
		exit(-1);

	} else {
		$billets = array();
		$prix = 0;
		$nbBillet = htmlspecialchars($_POST['nbPlace']);

		$emplacement = $emplacementDAO->getEmplacementByBloc(htmlspecialchars($_POST['bloc']));
		$niveau = $niveauDAO->getNiveauById($emplacement->getIdNiveau());
		$prixNiveau = $niveau->getPrixNiveau();

		if(!empty($_POST['codePromo'])) {
			$promotion = $promotionDAO->getPromotionByCode(htmlspecialchars($_POST['codePromo']));

			if($promotion && $promotion->getNbilletRestant() >= $nbBillet) {
				$reduction = 1 - ($promotion->getPourcentage() / 100);
				$prix = calculPrixBillet($prixNiveau, $reduction);
				$prixTotal = $prix * $nbBillet;

			} elseif($promotion) {
				$_SESSION['toast'] = "Erreur : il n'y a plus assez place disponible pour cette promotion";
				header('Location: index.php?page=placement&jour='.$_POST['jour']);
				exit(-1);

			} else {
				$_SESSION['toast'] = "Erreur : le code promotionnel rentré est incorrect";
				header('Location: index.php?page=placement&jour='.$_POST['jour']);
				exit(-1);
			}

		} elseif(!empty($_POST['licence'])) {
			$licence = $licenceDAO->getLicenceByNum(htmlspecialchars($_POST['licence']));

			if($licence) {
				$promotion = $promotionDAO->getPromotionLicence();
				$reduction = 1 - ($promotion->getPourcentage() / 100);
				$prix = calculPrixBillet($prixNiveau, $reduction);
				$prixTotal = $prix * $nbBillet;

			} else {
				$_SESSION['toast'] = "Erreur : le numéro de licence est incorrect";
				header('Location: index.php?page=placement&jour='.$_POST['jour']);
				exit(-1);
			}
		} else {
			$prix = calculPrixBillet($prixNiveau);
			$prixTotal = $prix * $nbBillet;

		}

		require_once(PATH_VIEWS.'achat.php');

	}

} elseif(isset($_POST['validerAchat'])) {
	$nbBillet = (int) htmlspecialchars($_POST['nbBillet']);
	$prix = (float) htmlspecialchars($_POST['prix']);
	if(isset($_POST['promotion'])) {
		$promotion = $promotionDAO->getPromotionById(htmlspecialchars($_POST['promotion']));
	}

	for($i = 0; $i < $nbBillet; $i++) {
		$result = $billetDAO->insertBillet($prix);
		if(!$result) {
			break;
		}
	}

	if(!$result) {
		$_SESSION['toast'] = "Erreur lors de la création des billet en base de données";
	} elseif(isset($promotion) && $promotion->getNbilletRestant() != NULL) {
		$result = $promotionDAO->changePromotion($promotion->getIdPromotion(), $promotion->getNbilletRestant() - $nbBillet, $promotion->getPourcentage());
		if(!$result) {
			$_SESSION['toast'] = "Erreur lors de la modifiaction des billets restants";
		}
	}

	require_once(PATH_VIEWS.'achat.php');
} elseif(isset($_POST['annuler'])) {
	$_SESSION['toast'] = "Votre achat a bien été annulé";
	header('Location: index.php');
	exit(-1);
} else {
	header('Location: index.php?page=404');
	exit(-1);

}
