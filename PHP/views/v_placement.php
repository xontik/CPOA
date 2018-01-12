
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<img class="responsive-img" src="<?= PATH_IMAGES ?>placement.png" width="800px" style="display:block;margin:auto;">
<form action="#" method="get" class="col s12"style="margin-top:30px;">
	<div class="row">
	<div class="col s6">
		<div class="input-field" >
			<select>
			  <option value="" disabled selected>Choisissez un niveau:</option>
			  <?php
				foreach($emplacements as $emplacement) {
					echo '<option value="'.$emplacement->getTypeEmplacement().'">'.$emplacement->getTypeEmplacement().'</option>';
				}
				?>
			</select>
			<label>Niveau:</label>
		</div>
		<br>
		<div class="input-field" >
			<select>
				<option value="" disabled selected>Choisissez un bloc:</option>
				<?php
				foreach($emplacements as $emplacement) {
					echo '<option value="'.$emplacement->getBloc().'">'.$emplacement->getBloc().'</option>';
				}
				?>
			</select>
			<label>Bloc:</label>
		</div>
		<br>
		<div class="input-field" >
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
	
	<div class=" col s6">
        <div class="input-field">
          <input id="nb_billet" type="number" min="1" max="10" class="validate">
          <label for="nb_billet">Nombre de place:</label>
        </div>
		<br>
        <div class="input-field">
          <input id="code_promo" type="text" class="validate">
          <label for="code_promo">Code promo:</label>
        </div>
		<br>
        <div class="input-field">
          <input id="num_licencie" type="text" class="validate">
          <label for="num_licencie">Numéro de licence:</label>
        </div>
    </div>
	
	<button class="btn waves-effect waves-light" type="button" name="action"  style="margin-bottom:30px;">Finaliser l'achat
		<i class="material-icons right">send</i>
	</button>
</div>
	
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
