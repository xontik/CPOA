<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Niveau.php');

class NiveauDAO extends DAO {
	public function getNiveaux() {
		$niveaux = array();

		$res = $this->queryAll('SELECT * FROM Niveau');

		if($res) {
            foreach($res as $niveau) {
				$niveaux[] = new Niveau($niveau['idNiveau'], $niveau['prixNiveau']);
			}
        } else {
			return false;
		}

		return $niveaux;
	}

	public function getNiveauById($idNiveau) {
		$res = $this->queryRow('SELECT * FROM Niveau WHERE idNiveau = ?', array($idNiveau));

		if($res) {
			return new Niveau($res['idNiveau'], $res['prixNiveau']);
		} else {
			return false;
		}
	}

	public function changePrixNiveau($idNiveau, $prixNiveau) {
		$res = $this->queryBdd('UPDATE Niveau SET prixNiveau = ? WHERE idNiveau = ?', array($prixNiveau, $idNiveau));

		return $res;
	}
}
