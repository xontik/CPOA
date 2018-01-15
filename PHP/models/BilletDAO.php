<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Billet.php');

class BilletDAO extends DAO {

	public function insertBillet($billet) {
		$identifiant = $billet->getIdentifiant();
		$prixBillet = $billet->getPrixBillet();

		$res = $this->queryBdd('INSERT INTO Billet (identifiant, prixBillet) VALUES (?, ?)', array($identifiant, $prixBillet));
		return $res;
	}
}
