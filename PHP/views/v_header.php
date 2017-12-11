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

		<script type="text/javascript" src="<?= PATH_SCRIPTS ?>jquery.js"></script>
	</head>
	<body>
		<!-- En-tête -->
		<header class="header" >

		</header>
		<!-- Menu -->
		<?php include(PATH_VIEWS.'menu.php'); ?>
		<!-- Vue -->
		<div class="container">
