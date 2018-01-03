
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<form action="#" method="get" class="col s12">
<br>
	<div class="row">
		<div class="input-field col s5">
			<select>
			  <option value="" disabled selected>Choisissez votre type de billet</option>
			  <option value="1">Billet Grand Public</option>
			  <option value="2">Billet Promo</option>
			  <option value="3">Billet Licencié</option>
			  <option value="4">Billet Solidarité</option>
			  <option value="5">Billet Big Match</option>
			</select>
			<label>Type de billet:</label>
		</div>
	</div>
    <div class="row">
        <div class="input-field col s5">
          <input id="code_promo" type="text" class="validate">
          <label for="code_promo">Code promo:</label>
        </div>
	</div>
	<div class="row">
        <div class="input-field col s5">
          <input id="num_licencie" type="text" class="validate">
          <label for="num_licencie">Numéro de licence:</label>
        </div>
    </div>
	<div class="row">
        <div class="input-field col s5">
          <input id="nb_billet" type="number" min="1" class="validate">
          <label for="nb_billet">Nombre de place:</label>
        </div>
    </div>
	 <button class="btn waves-effect waves-light" type="button" name="action" onClick="document.location='index.php?page=billeterie_p2'">Suivant
    <i class="material-icons right">send</i>
  </button>
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
