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

	public function getPromotionByCode($code) {
		$res = $this->queryRow('SELECT * FROM Promotion WHERE code = ?', array($code));

		if($res) {
			return new Promotion($res['idPromotion'], $res['code'], $res['typePromotion'], $res['nbBilletRestant'], $res['pourcentage']);
		} else {
			return $res;
		}
	}

	public function getPromotionLicence() {
		$res = $this->queryRow('SELECT * FROM Promotion WHERE typePromotion = "Promo licencié"');

		if($res) {
			return new Promotion($res['idPromotion'], $res['code'], $res['typePromotion'], $res['nbBilletRestant'], $res['pourcentage']);
		} else {
			return $res;
		}
	}

	public function changePromotion($idPromotion, $nbBilletRestant, $pourcentage) {
		$res = $this->queryBdd('UPDATE Promotion SET nbBilletRestant = ?, pourcentage = ? WHERE idPromotion = ?', array($nbBilletRestant, $pourcentage, $idPromotion));

		return $res;
	}

	public function changeCodePromo($idPromotion, $code) {
		$res = $this->queryBdd('UPDATE Promotion SET code = ? WHERE idPromotion = ?', array($code, $idPromotion));

		return $res;
	}
}
