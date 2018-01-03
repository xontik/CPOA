
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<img class="responsive-img" src="<?= PATH_IMAGES ?>placement.png" width="800px" style="display:block;margin:auto;">
<form action="#" method="get" class="col s12"style="margin-top:30px;">
	<div class="row">
		<div class="input-field col s5" >
			<select>
			  <option value="" disabled selected>Choisissez un niveau:</option>
			  <option value="1">niveau 1</option>
			  <option value="2">niveau 2</option>
			</select>
			<label>Niveau:</label>
		</div>
	</div>
	
	<div class="row">
		<div class="input-field col s5" >
			<select>
			  <option value="" disabled selected>Choisissez un block:</option>
			  <option value="1">A</option>
			  <option value="2">B</option>
			  <option value="2">C</option>
			  <option value="2">D</option>
			</select>
			<label>Block:</label>
		</div>
	</div>
	
	<div class="row">
		<div class="input-field col s5" >
			<select>
			  <option value="" disabled selected>Choisissez une place:</option>
			  <option value="1">51</option>
			  <option value="2">55</option>
			  <option value="2">56</option>
			  <option value="2">57</option>
			</select>
			<label>Place:</label>
		</div>
	</div>
	
	<button class="btn waves-effect waves-light" type="button" name="action"  style="margin-bottom:30px;">Finaliser l'achat
		<i class="material-icons right">send</i>
	</button>
	
	
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
