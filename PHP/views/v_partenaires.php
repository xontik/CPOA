<?php
/*
 * DS PHP
 * Vue page index - page d'accueil
 *
 * Copyright 2016, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 */
//  En tête de page
?>
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<h1>Les partenaires</h1>
<div class="carousel">
    <a class="carousel-item" href="#one!"><img src="<?= PATH_IMAGES ?>bnp.png"></a>
    <a class="carousel-item" href="#two!"><img src="<?= PATH_IMAGES ?>byblos.png"></a>
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>dlsi.png"></a>
    <a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>eiffage.png"></a>
    <a class="carousel-item" href="#five!"><img src="<?= PATH_IMAGES ?>emirates.png"></a>
	<a class="carousel-item" href="#one!"><img src="<?= PATH_IMAGES ?>fft.png"></a>
    <a class="carousel-item" href="#two!"><img src="<?= PATH_IMAGES ?>gravotech.png"></a>
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>imprimerie.png"></a>
    <a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>leprogres.png"></a>
    <a class="carousel-item" href="#five!"><img src="<?= PATH_IMAGES ?>lightair.png"></a>
	<a class="carousel-item" href="#one!"><img src="<?= PATH_IMAGES ?>lpa.jpg"></a>
    <a class="carousel-item" href="#two!"><img src="<?= PATH_IMAGES ?>lyonpeople.png"></a>
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>marriot.png"></a>
    <a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>peugeot.jpg"></a>
    <a class="carousel-item" href="#five!"><img src="<?= PATH_IMAGES ?>radioscoop.png"></a>
</div>
      

<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
