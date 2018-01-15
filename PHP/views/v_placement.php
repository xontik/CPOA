
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<img class="responsive-img" src="<?= PATH_IMAGES ?>placement.png" width="800px" style="display:block;margin:auto;">

<form action="index.php?page=achat" method="post" class="col s12" style="margin-top:30px;">
	<div class="row">
		<div class="col s6 offset-s3">
			<div class="input-field" >
				<select name="bloc" required>
					<option value="" disabled selected>Choisissez un bloc :</option>
					<?php
					foreach($emplacements as $emplacement) {
						echo '<option value="'.$emplacement->getBloc().'">'.$emplacement->getBloc().'</option>';
					}
					?>
				</select>
				<label>Bloc :</label>
			</div>
			
			<div class="input-field">
			  <input id="nb_billet" name="nbPlace" type="number" min="1" max="10" class="validate" required>
			  <label for="nb_billet">Nombre de place :</label>
			</div>
			
			<div class="input-field">
			  <input id="code_promo" name="codePromo" type="text" class="validate">
			  <label for="code_promo">Code promo :</label>
			</div>
			
			<div class="input-field">
			  <input id="num_licencie" name="licence" type="text" class="validate">
			  <label for="num_licencie">Numéro de licence :</label>
			</div>
			
			<button class="btn waves-effect waves-light" type="submit" name="achat"  style="margin-bottom:30px;">Finaliser l'achat
				<i class="material-icons right">send</i>
			</button>
		</div>
	</div>	
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
