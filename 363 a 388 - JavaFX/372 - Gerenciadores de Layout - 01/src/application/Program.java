package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		
		VBox temp = new VBox();
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		temp.getChildren().add(new Square());
		
		Scene main = new Scene(temp, 800, 600);
		primaryStage.setScene(main);
	}
	
}
