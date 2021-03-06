package application;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		URL fxml = getClass().getResource("/Login.fxml");
		GridPane gp = FXMLLoader.load(fxml);
		
		Scene main = new Scene(gp, 350, 400);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login");
		primaryStage.setScene(main);
		primaryStage.show();
	}

}
