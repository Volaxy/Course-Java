package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Program extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene main = new Scene(new BorderPanee(), 800, 600);
		
		primaryStage.setScene(main);
		
		primaryStage.show();
	}
	
}
