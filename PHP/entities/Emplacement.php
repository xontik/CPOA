<?php

class Emplacement {
	private $_idEmplacement;
	private $_bloc;
	private $_idNiveau;

	public function __construct($idEmplacement, $bloc, $idNiveau) {
        $this->_idEmplacement = $idEmplacement;
		$this->_bloc = $bloc;
        $this->_idNiveau = $idNiveau;
    }

	public function setIdEmplacement($idEmplacement){
        $this->_idEmplacement = $idEmplacement;
    }

	public function setBloc($bloc){
        $this->_bloc = $bloc;
    }

    public function getBloc(){
        return $this->_bloc;
    }

	public function getIdEmplacement(){
		return $this->_idEmplacement;
	}

	public function getIdNiveau() {
		return $this->_idNiveau;
	}
}
