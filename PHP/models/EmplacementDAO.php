<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Emplacement.php');

class EmplacementDAO extends DAO {

	 public function getEmplacement() {
        $emplacements = array();

            $res = $this->queryAll('SELECT * FROM Emplacement');

        if($res) {
            foreach($res as $emplacement)
                $emplacements[] = new Emplacement($emplacement['idEmplacement'], $emplacement['bloc'], $emplacement['idNiveau']);
        } else
            return false;

        return $emplacements;
    }

	public function getEmplacementByBloc($bloc) {
		$res = $this->queryRow('SELECT * FROM Emplacement WHERE bloc = ?', array($bloc));

		if($res) {
			return new Emplacement($res['idEmplacement'], $res['bloc'], $res['idNiveau']);
		} else {
			return $res;
		}
	}
}
