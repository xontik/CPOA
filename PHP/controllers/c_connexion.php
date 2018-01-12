<?php

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	if(ini_get("session.use_cookies")) {
		$params = session_get_cookie_params();
		setcookie(session_name(), '', -1, $params["path"], $params["domain"], $params["secure"], $params["httponly"]);
	}

	$_SESSION = array();
	session_destroy();
	
	echo "Vous avez été déconnecté";	
	
} elseif(isset($_POST['connexion'])) {
	$login = $_POST['login'];
	$password = $_POST['password'];
	
	if($login == LOGIN && hash("sha256", $password) == PASSWORD) {
		$_SESSION['logged'] = true;
	} else {
		echo "Mauvais login ou mot de passe";
	}
	
}

require_once(PATH_VIEWS."connexion.php"); 