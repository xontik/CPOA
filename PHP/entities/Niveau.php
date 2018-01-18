<?php

class Niveau {
	private $_idNiveau;
	private $_prixNiveau;

	public function __construct($idNiveau, $prixNiveau) {
		$this->_idNiveau = $idNiveau;
		$this->_prixNiveau = $prixNiveau;
	}

	public function getIdNiveau() {
		return $this->_idNiveau;
	}

	public function getPrixNiveau() {
		return $this->_prixNiveau;
	}

	public function setPrixNiveau($prixNiveau) {
		$this->_prixNiveau = $prixNiveau;
	}
}
