<?php

require_once(PATH_MODELS.'EmplacementDAO.php');
require_once(PATH_MODELS.'NiveauDAO.php');
require_once(PATH_MODELS.'BilletDAO.php');

$jours = array(1, 2, 3, 4, 5, 6, 7, 8, 9);

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	header('Location: index.php');
	exit(-1);

} elseif(isset($_POST['achat']) && isset($_POST['bloc']) && isset($_POST['nbPlace']) && in_array($_POST['jour'], $jours)) {
	if(!empty($_POST['codePromo']) && !empty($_POST['licence'])) {
		echo "PROBLEME : On ne peut renseigner un code promo et un numéro de licence";

	} else {
		$reduction = 1;
		if(!empty($_POST['codePromo'])) {
			echo "TODO faire gestion si mauvais code promo";
			echo "TODO faire gestion code promo";

		} elseif(!empty($_POST['licence'])) {
			echo "TODO faire gestion si mauvais numéro de licence";
			echo "TODO faire gestion du numéro de licence";
		}

		//Gestion du billet
		//$prix = * $reduction;

		require_once(PATH_VIEWS.'achat.php');

	}

} else {
	header('Location: index.php?page=404');
	exit(-1);

}
