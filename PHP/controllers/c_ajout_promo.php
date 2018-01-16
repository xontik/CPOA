<?php
require_once(PATH_MODELS.'EmplacementDAO.php');
require_once(PATH_MODELS.'NiveauDAO.php');
require_once(PATH_ENTITY.'Niveau.php');

$niveauDAO = new NiveauDAO(DEBUG);
$niveaux = $niveauDAO->getNiveaux();

// Modification du prix du niveau sélectionné
if(isset($_POST['prixNiveau'])) {
	$niveauId = array();
	foreach($niveaux as $niveau) {
		$niveauId[] = $niveau->getIdNiveau();
	}
	if(in_array($_POST['niveau'], $niveauId)) {
		$result = $niveauDAO->changePrixNiveau(htmlspecialchars($_POST['niveau']), htmlspecialchars($_POST['prix']));
		if($result) {
			echo 'Modification réussi';
		} else {
			echo 'ERREUR';
		}
	}
}

require_once(PATH_VIEWS.'ajout_promo.php');
