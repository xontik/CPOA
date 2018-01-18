<?php require_once(PATH_VIEWS.'header.php');?>

<!--  Début de la page -->
<form action="#" method="post" class="col s12" style="margin-top:30px;">
	<div class="row">
		<div class="col s6 offset-s3">
			<div class="input-field" >
				<select name="niveau" required>
					<option value="" disabled selected>Choisissez un niveau :</option>
					<?php
					foreach($niveaux as $niveau) {
						switch($niveau->getIdNiveau()) {
							case 3:
								echo '<option value="'.$niveau->getIdNiveau().'">Placement libre</option>';
								break;

							case 4:
								echo '<option value="'.$niveau->getIdNiveau().'">Rez-de-chaussée</option>';
								break;

							default:
								echo '<option value="'.$niveau->getIdNiveau().'">'.$niveau->getIdNiveau().'</option>';
								break;
						}
					}
					?>
				</select>
				<label>Niveau :</label>
			</div>

			Prix du billet en euros:
			<div class="input-field inline">
				<input id="prix" type="number" class="validate" min="1" name="prix" required>
				<label for="prix">Prix en €</label>
			</div>

			<div class="col s6 offset-s4">
				<button class="btn waves-effect waves-light" type="submit" name="prixNiveau" >Valider
					<i class="material-icons right">send</i>
				</button>
			</div>
		</div>
	</div>
</form>

 <form action="#" method="post" class="col s12" style="margin-top:30px;" >
	<div class="row">
		<div class="col s6 offset-s3">
			<div class="input-field">
				<select name="promotion" required>
					<option value="" disabled selected>Choisissez un promotion :</option>
					<?php
					foreach($promotions as $promotion) {
						echo '<option value="'.$promotion->getIdPromotion().'">'.$promotion->getTypePromotion().'</option>';
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
				  <input id="pourcentage" name="pourcentage" type="number" min="1" max="100" class="validate" required>
				  <label for="pourcentage">Pourcentage de réduction :</label>
			</div>
			<div class="col s6 offset-s3">
				<button class="btn waves-effect waves-light" type="submit" name="modifPromo" >Valider
					<i class="material-icons right">send</i>
				</button>
			</div>
		</div>
	</div>
</form>


<!--  Fin de la page -->

<!--  Pied de page -->
<?php require_once(PATH_VIEWS.'footer.php');
