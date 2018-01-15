<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Promotion.php');

class PromotionDAO extends DAO {
	 
	 public function getPromotion() {
        $promotions = array();

            $res = $this->queryAll('SELECT * FROM Promotion');
        
        if($res) {
            foreach($res as $promotion)
                $promotions[] = new Promotion($promotion['idPromotion'], $promotion['code'], $promotion['typePromotion'], $promotion['nbPlaceRestante'], $promotion['pourcentage']);
        } else
            return false;

        return $promotions;
    }
}