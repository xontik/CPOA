<?php
/*
 * DS PHP
 * Vue Entete HTML du site
 *
 * Copyright 2017, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 */
?>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0"/>

		<link href="<?= PATH_CSS ?>materialize.min.css" rel="stylesheet">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<link rel="stylesheet" href="<?=PATH_CSS ?>billeterie.css">
		<link rel="stylesheet" href="<?=PATH_CSS ?>footerColle.css">

	</head>
	<body>

		<!-- En-tête -->
		<header class="header" >
			<nav>
				<div class="nav-wrapper">
				  <a href="index.php?page=accueil" class="brand-logo"> <img class="responsive-img" src="<?= PATH_IMAGES ?>logo.jpg" width="250px"></a>
				  <ul id="nav-mobile" class="right hide-on-med-and-down">
					<?php
					if(isset($_SESSION['logged']) && $_SESSION['logged']) { ?>
						<li><a href="index.php?page=ajout_promo">Ajouter une promotion</a></li>
						<li><a href="index.php?page=connexion">Se déconnecter</a></li>
					<?php } else { ?>
						<li><a href="index.php?page=billeterie">Billeterie</a></li>
						<li><a href="index.php?page=contact">Contact</a></li>
						<li><a href="index.php?page=partenaires">Partenaires</a></li>
						<li><a href="index.php?page=connexion">Connexion</a></li>
					<?php } ?>
				  </ul>
				</div>
			</nav>

		</header>

		<!-- Menu -->

		<!-- Vue -->
		<main>
		<div class="container">
