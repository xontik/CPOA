<?php

class Promotion {
	private $_idPromotion;
	private $_code;
	private $_typePromotion;
	private $_nbBilletRestant;
	private $_pourcentage;

	public function __construct($idPromotion,$code,$typePromotion,$nbBilletRestant,$pourcentage) {
        $this->_idPromotion = $idPromotion;
        $this->_code = $code;
		$this->_typePromotion = $typePromotion;
        $this->_nbBilletRestant = $nbBilletRestant;
		$this->_pourcentage = $pourcentage;
    }

	public function setIdPromotion($idPromotion){
        $this->_idPromotion = $idPromotion;
    }

	public function setCode($code){
        $this->_code = $code;
    }

	public function setNbBilletRestant($nbBilletRestant){
        $this->_nbBilletRestant = $nbBilletRestant;
    }

	public function setPourcentage($pourcentage){
        $this->_pourcentage = $pourcentage;
    }

	public function getIdPromotion(){
        return $this->_idPromotion;
    }

	public function getCode(){
        return $this->_code;
    }

	public function getTypePromotion(){
        return $this->_typePromotion;
    }

	public function getNbilletRestant(){
        return $this->_nbBilletRestant;
    }

	public function getPourcentage(){
        return $this->_pourcentage;
    }
}
