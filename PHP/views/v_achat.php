<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<?php if(!isset($_POST['validerAchat']) && !isset($_POST['annuler'])): ?>
<form action="#" method="post" class="col s12">
	<div class="row">
			<input type="hidden" name="nbBillet" value="<?= $nbBillet ?>">
			<input type="hidden" name="prix" value="<?= $prix ?>">
			<?php if(isset($promotion)): ?>
			<input type="hidden" name="promotion" value="<?= $promotion->getIdPromotion() ?>">
			<?php endif; ?>
			<div class="row">
				<div class="col s6 offset-s3">
				</div>
			</div>
			<h2 style="text-align:center;">Prix d'un billet : <?= $prix ?>€</h2>
			<h2 style="text-align:center;">Prix total : <?= $prixTotal ?>€</h2>

		<div class="col s6 offset-s4">
						<button class="btn waves-effect waves-light" type="submit" name="validerAchat" style="margin-right:20px;">Confirmer l'achat
							<i class="material-icons right">send</i>
						</button>
			
			
			
						<button class="btn waves-effect waves-light" type="submit" name="annuler">Annuler l'achat
						</button>
		</div>
	</div>
</form>
<?php elseif(isset($_POST['validerAchat'])): ?>
	<h2 style="text-align:center;">Vous allez être redirigé vers une page de paiement... Merci de votre achat</h2>
	<img class="responsive-img" src="<?= PATH_IMAGES ?>paiement.png" >
<?php endif; ?>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
