<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Billet.php');

class BilletDAO extends DAO {

	public function insertBillet($prixBillet) {
		$res = $this->queryBdd('INSERT INTO Billet (prixBillet) VALUES (?)', array($prixBillet));
		return $res;
	}
}
