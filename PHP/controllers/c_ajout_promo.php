<?php
require_once(PATH_MODELS.'EmplacementDAO.php');

$emplacementDAO = new EmplacementDAO(DEBUG);
$emplacements = $emplacementDAO->getEmplacement();

require_once(PATH_VIEWS.'ajout_promo.php'); 
