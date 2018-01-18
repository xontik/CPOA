<?php

require_once(PATH_MODELS.'PromotionDAO.php');

$promotionDAO = new PromotionDAO(DEBUG);
$promotions = $promotionDAO->getPromotions();

if(isset($_POST['modifPromo'])) {
	$result = $promotionDAO->changeCodePromo(htmlspecialchars($_POST['promotion']), $_POST['codePromo']);
	if($result) {
		$_SESSION['toast'] = "Modification réussie";
	} else {
		$_SESSION['toast'] = "Erreur lors de la modification";
	}
}

require_once(PATH_VIEWS.'modif_promo.php');
