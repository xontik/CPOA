<?php

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	header('Location: index.php');
	exit(-1);
	
} elseif(isset($_POST['achat']) && isset($_POST['bloc']) && isset($_POST['place']) && isset($_POST['nbPlace'])) {
	if(!empty($_POST['codePromo']) && !empty($_POST['licence'])) {
		echo "PROBLEME : On ne peut renseigner un code promo et un numéro de licence";
		
	} else {
		if(!empty($_POST['codePromo'])) {
			echo "TODO faire gestion code promo";
			
		}
		
		if(!empty($_POST['licence'])) {
			echo "TODO faire gestion du numéro de licence";
		}
		
		require_once(PATH_VIEWS.'achat.php');
		
	}
	
} else {
	header('Location: index.php');
	exit(-1);
	
}