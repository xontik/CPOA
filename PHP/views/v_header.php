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
		<meta name="viewport" content="width=device-width; initial-scale=1; maximum-scale=1; user-scalable=0"/>

		<link href="<?= PATH_CSS ?>materialize.min.css" rel="stylesheet">
		
		
		
	</head>
	<body>
		<!-- En-tête -->
		<header class="header " >
			<nav class="nav-extended">
				<div class="nav-wrapper">
				  <a href="index.php?page=accueil" class="brand-logo"> <img class="responsive-img" src="<?= PATH_IMAGES ?>logo.jpg" width="250px"></a>
				  <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
				  <ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="#">Billeterie</a></li>
					<li><a href="#">Contact</a></li>
				  </ul>
				  <ul class="side-nav" id="mobile-demo">
					<li><a href="#">Billeterie</a></li>
					<li><a href="#">Contact</a></li>
				  </ul>
				</div>
				<div class="nav-content">
				  <ul class="tabs tabs-transparent">
					<li class="tab"><a href="#test1">Actu</a></li>
					<li class="tab"><a href="#test2">Tournois</a></li>
					<li class="tab"><a href="#test3">Joueurs</a></li>
					<li class="tab"><a href="index.php?page=partenaires">Partenaires</a></li>
				  </ul>
				</div>
			</nav>
			
		</header>
		<!-- Menu -->
		
		<!-- Vue -->
		<div class="container">
