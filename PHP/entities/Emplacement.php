<?php

class Emplacement {
	private $_idEmplacement;
	private $_type;
	private $_bloc;
	private $_placeRestante;
	
	public function __construct($idEmplacement, $type, $bloc, $placeRestante) {
        $this->_idEmplacement = $idEmplacement;
        $this->_type = $type;
		$this->_bloc = $bloc;
        $this->_placeRestante = $placeRestante;
    }
	
	public function setIdEmplacement($idEmplacement){
        $this->_idEmplacement = $idEmplacement;
    }

    public function setTypeEmplacement($type){
        $this->_type = $type;
    }
	
	public function setBloc($bloc){
        $this->_bloc = $bloc;
    }
	
	public function setPlaceRestante($placeRestante){
        $this->_placeRestante = $placeRestante;
    }

    public function getBloc(){
        return $this->_bloc;
    }
	
	public function getIdEmplacement(){
		return $this->_idEmplacement;
	}

    public function getTypeEmplacement(){
        return $this->_type;
    }
	
	public function getPlaceRestante(){
        return $this->_placeRestante;
    }
}
