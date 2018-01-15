<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Début de la page -->
<form action="#" method="post" class="col s12" style="margin-top:30px;">
	 <div class="row">
			<div class="col s6">
				<div class="input-field" >
					<select name="bloc" required>
						<option value="" disabled selected>Choisissez un niveau :</option>
						<?php
						foreach($emplacements as $emplacement) {
							echo '<option value="'.$emplacement->getTypeEmplacement().'">'.$emplacement->getTypeEmplacement().'</option>';
						}
						?>
					</select>
					<label>Niveau :</label>
				</div>
	 
			  Prix du billet en euros:
			  <div class="input-field inline">
				<input id="prix" type="number" class="validate" min="1" >
				<label for="prix">Prix en €</label>
			  </div>
		
			<div>
			<button class="btn waves-effect waves-light" type="submit" name="action" >Valider
				<i class="material-icons right">send</i>
			</button>
			</div>
			
	  </div>
 </form>
 
 <form action="#" method="post" class="col s12" style="margin-top:30px;" >
	<div class="row">
		<div class="col s6">
			<div class="input-field" >
				<select name="bloc" required>
					<option value="" disabled selected>Choisissez un code promo:</option>
					<?php
					foreach($emplacements as $emplacement) {
						echo '<option value="'.$emplacement->getBloc().'">'.$emplacement->getBloc().'</option>';
					}
					?>
				</select>
				<label>Code Promo :</label>
			</div>
			
			<div class="input-field">
				  <input id="nb_billet" name="nbBillet" type="number" min="1" max="500" class="validate" required>
				  <label for="nb_billet">Nombre de billet :</label>
			</div>
			
			<div class="input-field">
				  <input id="nb_billet" name="pourcentReduc" type="number" min="1" max="100" class="validate" required>
				  <label for="nb_billet">Pourcentage de réduction :</label>
			</div>
		
			<button class="btn waves-effect waves-light" type="submit" name="action" >Valider
				<i class="material-icons right">send</i>
			</button>
			
		</div>
	</div>
</form>
 
 
<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
