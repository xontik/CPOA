<?php
$jours = array(1, 2, 3, 4, 5, 6, 7, 8, 9);

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	header('Location: index.php');
	exit(-1);

} else {
	if(!isset($_GET['jour']) || !in_array($_GET['jour'], $jours)) {
		header('Location: index.php?page=404');
		exit(-1);
	} else {
		require_once(PATH_MODELS.'EmplacementDAO.php');

		$emplacementDAO = new EmplacementDAO(DEBUG);
		$emplacements = $emplacementDAO->getEmplacement();

		require_once(PATH_VIEWS.'placement.php');
	}
}
