<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Début de la page -->
<form action="#" method="post" class="col s12" style="margin-top:60px;">
	<div class="row">
		<div class="col s6 offset-s3">
			<div class="input-field" >
				<select name="bloc" required>
					<option value="" disabled selected>Choisissez un code promo:</option>
				</select>
				<label>Code Promo :</label>
			</div>
			
			<div class="input-field">
			  <input id="code_nam" type="text" class="validate">
			  <label for="code_name">Entrer le nouveau code:</label>
			</div>
			<div class="col s6 offset-s3">
			<div class="col s6 offset-s3">
				<button class="btn waves-effect waves-light" type="submit" name="achat">Modifier
					<i class="material-icons right">send</i>
				</button>
			</div>
		
		</div>
	</div>
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');