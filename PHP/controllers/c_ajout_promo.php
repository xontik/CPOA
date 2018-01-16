<?php

require_once(PATH_MODELS.'NiveauDAO.php');
require_once(PATH_MODELS.'PromotionDAO.php');

$niveauDAO = new NiveauDAO(DEBUG);
$promotionDAO = new PromotionDAO(DEBUG);

$niveaux = $niveauDAO->getNiveaux();
$promotions = $promotionDAO->getPromotions();

// Modification du prix du niveau sélectionné
if(isset($_POST['prixNiveau'])) {
	$result = $niveauDAO->changePrixNiveau(htmlspecialchars($_POST['niveau']), htmlspecialchars($_POST['prix']));
	if($result == true) {
		$_SESSION['toast'] = "Modifcation réussie";
	} else {
		$_SESSION['toast'] = "Erreur lors de la modification";
	}

} elseif(isset($_POST['modifPromo'])) {
	$result = $promotionDAO->changePromotion(htmlspecialchars($_POST['promotion']), htmlspecialchars($_POST['nbBillet']), htmlspecialchars($_POST['pourcentage']));
	if($result) {
		$_SESSION['toast'] = "Modification réussie";
	} else {
		$_SESSION['toast'] = "Erreur lors de la modification";
	}
}

require_once(PATH_VIEWS.'ajout_promo.php');
