<?php

class Licence {
	private $_idLicence;
	private $_numLicence;

	public function __construct($idLicence, $numLicence) {
		$this->_idLicence = $idLicence;
		$this->_numLicence = $numLicence;
	}

	public function getIdLicence() {
		return $this->_idLicence;
	}

	public function getNumLicence() {
		return $this->_numLicence;
	}
}
