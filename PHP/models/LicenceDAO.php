<?php

require_once(PATH_MODELS.'DAO.php');
require_once(PATH_ENTITY.'Licence.php');

class LicenceDAO extends DAO {

	public function getLicenceByNum($numLicence) {
		$res = $this->queryRow('SELECT * FROM Licence WHERE numLicence = ?', array($numLicence));

		if($res) {
			return new Licence($res['idLicence'], $res['numLicence']);
		} else {
			return $res;
		}
	}
}
