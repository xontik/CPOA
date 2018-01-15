<?php

class Billet {
	private $_identifiant;
	private $_prixBillet;

	public function __construct($identifiant, $prixBillet) {
		$this->_identifiant = $identifiant;
		$this->_prixBillet = $prixBillet;
	}

	public function getIdentifiant() {
		return $this->_identifiant;
	}

	public function getPrixBillet() {
		return $this->_prixBillet;
	}

	public function setIdentifiant($identifiant) {
		$this->_identifiant = $identifiant;
	}

	public function setPrixBillet($prixBillet) {
		$this->_prixBillet = $prixBillet;
	}
}
