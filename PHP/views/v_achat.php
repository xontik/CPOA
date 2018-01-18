<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<?php if(!isset($_POST['validerAchat']) && !isset($_POST['annuler'])): ?>
<form action="#" method="post" class="col s12">
	<div class="row">
		<div class="col s6 offset-s3">
		</div>
	</div>
	<label>Prix d'un billet : <?= $prix ?>€</label>
	<label>Prix total : <?= $prixTotal ?>€</label>

	<input type="submit" name="validerAchat" value="Confirmer l'achat">
	<input type="submit" name="annuler" value="Annuler l'achat">
</form>
<?php elseif(isset($_POST['validerAchat'])): ?>
	<p>Vous allez être redirigé vers la page de payment. Merci de votre achat</p>
<?php endif; ?>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
