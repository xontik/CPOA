package ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class GestionPlanning extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            final URL urlFXML = getClass().getResource("accueil.fxml");
            final FXMLLoader fxmlLoader = new FXMLLoader(urlFXML);

            final AnchorPane root = (AnchorPane) fxmlLoader.load();
            final Scene scene = new Scene(root);
            primaryStage.setScene(scene);

        } catch (Exception e) {
            System.err.println("Erreur lors du chargement : " + e);
        }

        primaryStage.setTitle("Gestion des planning");
        primaryStage.show();
    }
}
