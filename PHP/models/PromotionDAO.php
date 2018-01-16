<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Promotion.php');

class PromotionDAO extends DAO {

	public function getPromotions() {
        $promotions = array();

            $res = $this->queryAll('SELECT * FROM Promotion');

        if($res) {
            foreach($res as $promotion)
                $promotions[] = new Promotion($promotion['idPromotion'], $promotion['code'], $promotion['typePromotion'], $promotion['nbBilletRestant'], $promotion['pourcentage']);
        } else
            return false;

        return $promotions;
    }

	public function changePromotion($idPromotion, $nbBilletRestant, $pourcentage) {
		$res = $this->queryBdd('UPDATE Promotion SET nbBilletRestant = ?, pourcentage = ? WHERE idPromotion = ?', array($nbBilletRestant, $pourcentage, $idPromotion));

		return $res;
	}
}
