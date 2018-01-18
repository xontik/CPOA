<?php

class Billet {
	private $_idBillet;
	private $_prixBillet;

	public function __construct($idBillet, $prixBillet) {
		$this->_idBillet = $idBillet;
		$this->_prixBillet = $prixBillet;
	}

	public function getIdBillet() {
		return $this->_identifiant;
	}

	public function getPrixBillet() {
		return $this->_prixBillet;
	}

	public function setPrixBillet($prixBillet) {
		$this->_prixBillet = $prixBillet;
	}
}
