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
}
