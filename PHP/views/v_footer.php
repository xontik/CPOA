<?php
/*
 * DS PHP
 * Vue Pied de page - footer
 *
 * Copyright 2017, Eric Dufour
 * http://techfacile.fr
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 *
 */
?>


			<!-- fin de page -->
			</div>
			</main>
		<!-- Pied de page -->
		<div class="footer">
				<footer class="page-footer">
				  <div class="container">
					<div class="row">
					  <div class="col l6 s12">
						<p class="grey-text text-lighten-4">Site web réalisé par Benjamin Borlet, Jean-Baptiste Loutfalla et Emma Glasson pour un projet du module CPOA</p>
					  </div>
					  <div class="col l4 offset-l2 s12">
						  <a class="grey-text text-lighten-3" href="https://www.facebook.com/openparcauvergnerhonealpes/"><img class="responsive-img" src="<?= PATH_IMAGES ?>icon_fb.png" width="50px"></a>
						  <a class="grey-text text-lighten-3" href="https://twitter.com/OpenParcARA"><img class="responsive-img" src="<?= PATH_IMAGES ?>icon_tw.png" width="45px"></a><br>
						  <a href="mailto:contact@openparc.fr?subject=Contact%20Open%20Parc">Nous contacter</a>
					  </div>
					</div>
				  </div>
				  <div class="footer-copyright">
					<div class="container">
					© 2018 Copyright Text
					</div>
				  </div>
				</footer>

		</div>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="<?= PATH_SCRIPTS ?>materialize.min.js"></script>
	<script type="text/javascript" src="<?= PATH_SCRIPTS ?>partenaires.js"></script>
	<?php
	if(isset($_SESSION["toast"])){ ?>
	<script type="text/javascript">
		$(document).ready(function(){
			Materialize.toast("<?= $_SESSION["toast"] ?>", 4000);
			console.log("test");
		});

	</script>
<?php

$_SESSION['toast'] = NULL;

} ?>
	</body>
</html>
