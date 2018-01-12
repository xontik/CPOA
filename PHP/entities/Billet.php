<?php

class Billet {
	private $_identifiant;
	private$_nomClient;
	
	public function __construct__($identifiant, $nomClient) {
		this->_identifiant = $identifiant;
		this->_nomClient = $nomClient;
	}
	
	public function getIdentifiant() {
		return this->_identifiant;
	}
	
	public function getNomClient() {
		return this->_nomClient;
	}
	
	public function setIdentifiant($identifiant) {
		this->_identifiant = $identifiant;
	}
	
	public function setNomClient($nomClient) {
		this->_nomClient = $nomClient;
	}
}