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
<h3>Les partenaires titre:</h3>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>rara.png"></a>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>vlyon.png" width="300px"></a>
<h3>Les partenaires premiers:</h3>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>bnp.png" width="300px"></a>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>byblos.png" width="300px" ></a>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>emirates.png" width="150px" ></a>
<a href="#one!"><img class="responsive-img" src="<?= PATH_IMAGES ?>eiffage.png" width="300px"></a>
<h3>Les partenaires officiel:</h3>
<div class="carousel">
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>dlsi.png"></a>
	<a class="carousel-item" href="#one!"><img src="<?= PATH_IMAGES ?>fft.png" width="50px"></a>
    <a class="carousel-item" href="#two!"><img src="<?= PATH_IMAGES ?>gravotech.png"></a>
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>imprimerie.png"></a>
    <a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>leprogres.png"></a>
    <a class="carousel-item" href="#five!"><img src="<?= PATH_IMAGES ?>lightair.png"></a>
	<a class="carousel-item" href="#one!"><img src="<?= PATH_IMAGES ?>lpa.jpg"></a>
    <a class="carousel-item" href="#two!"><img src="<?= PATH_IMAGES ?>lyonpeople.png"></a>
    <a class="carousel-item" href="#three!"><img src="<?= PATH_IMAGES ?>marriot.png"></a>
    <a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>peugeot.jpg"></a>
    <a class="carousel-item" href="#five!"><img src="<?= PATH_IMAGES ?>radioscoop.png"></a>
	<a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>appart.jpg"></a>
	<a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>babolat.jpg"></a>
	<a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>bein.png"></a>
	<a class="carousel-item" href="#four!"><img src="<?= PATH_IMAGES ?>clearchannel.jpg"></a>
</div>
      

<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
