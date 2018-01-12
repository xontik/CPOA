<?php

require_once(PATH_MODELS.'EmplacementDAO.php');


$emplacementDAO = new EmplacementDAO(DEBUG);

$emplacements = $emplacementDAO->getEmplacement();
var_dump($emplacements);

require_once(PATH_VIEWS.'placement.php'); 

