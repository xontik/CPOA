<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Début de la page -->
<form action="#" method="post" >
<div class="row"> 
	<div class="col s6 offset-s3">
		<h1>Nous contacter</h1>
		
		<div class="input-field col s6">
          <input  id="first_name" type="text" class="validate">
          <label for="first_name">Nom</label>
        </div>
        <div class="input-field col s6">
          <input id="last_name" type="text" class="validate">
          <label for="last_name">Prénom</label>
        </div>
		<div class="input-field col s12">
          <input id="email" type="email" class="validate">
          <label for="email">Email</label>
        </div>
		<div class="input-field col s12">
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="textarea1">Quelle est votre question ? </label>
        </div>
		<div class=" col s6 offset-s3">
			<button class="btn waves-effect waves-light" type="submit" name="achat"  style="margin-bottom:30px;">Envoyer
				<i class="material-icons right">send</i>
			</button>
		</div>
	</div>
</div>
</form>
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
