<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Niveau.php');

class NiveauDAO extends DAO {
	
	public function getNiveauById($idNiveau) {
		$res = $this->queryRow('SELECT * FROM Niveau WHERE idNiveau = ?', array($idNiveau));

		if($res) {
			return new Niveau($res['idNiveau'], $res['prixNiveau']);
		} else {
			return false;
		}
	}
}
