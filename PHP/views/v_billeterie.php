
<?php require_once(PATH_VIEWS.'header.php');?>


<!--  Début de la page -->
<form action="#" method="get" class="col s12"style="margin-top:30px;">

	<div class="row">
        <div class="input-field col s5">
          <input id="nb_billet" type="number" min="1" max="10" class="validate">
          <label for="nb_billet">Nombre de place:</label>
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
	
	 <button class="btn waves-effect waves-light" type="button" name="action" onClick="document.location='index.php?page=placement'" style="margin-bottom:30px;">Suivant
    <i class="material-icons right">send</i>
  </button>
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');