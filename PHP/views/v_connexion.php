<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<?php
if(isset($_SESSION['logged']) && $_SESSION['logged']) {
	echo "Connexion réussi";
}
?>
<?php if(!isset($_SESSION['logged']) || !$_SESSION['logged']): ?>
<form action="index.php?page=connexion" method="post">
	<div class="row">
		<div class="col s6">
			<div class="input-field">
				<input id="id" type="text" name="login" required><label for="id">Identifiant :</label>
			</div>
			<div class="input-field">
				<input id="pwd" type="password" name="password" required><label for="pwd">Mot de passe :</label>
			</div>
		</div>
	</div>
	<input class="btn" type="submit" value="Se connecter" name="connexion">
</form>
<?php endif; ?>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
