<?php

if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	header('Location: index.php');
	exit(-1);
	
} else {
	require_once(PATH_VIEWS.'billeterie.php'); 

}