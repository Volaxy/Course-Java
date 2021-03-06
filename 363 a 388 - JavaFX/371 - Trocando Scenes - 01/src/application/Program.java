package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Program extends Application {

	private Stage window;
	private Scene scene1;
	private Scene scene2;
	private Scene scene3;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		createScene1();
		createScene2();
		createScene3();
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Wizard");
		primaryStage.show();
	}
	
	private void createScene1() {
		Button button = new Button("Next");
		button.setOnAction(e -> {
			window.setScene(scene2);
		});
		
		HBox hbox = new HBox(10);
		
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(button);
		
		scene1 = new Scene(hbox, 400, 400);
	}
	
	private void createScene2() {
		Button buttonB = new Button("Back");
		buttonB.setOnAction(e -> {
			window.setScene(scene1);
		});
		Button buttonN = new Button("Next");
		buttonN.setOnAction(e -> {
			window.setScene(scene3);
		});
		
		HBox hbox = new HBox(10);
		
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(buttonB);
		hbox.getChildren().add(buttonN);
		
		scene2 = new Scene(hbox, 400, 400);
	}
	
	private void createScene3() {
		Button buttonB = new Button("Back");
		buttonB.setOnAction(e -> {
			window.setScene(scene2);
		});
		
		Button buttonF = new Button("Finish");
		buttonF.setOnAction(e -> {
			System.exit(0);
		});
		
		HBox hbox = new HBox(10);
		
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().add(buttonB);
		hbox.getChildren().add(buttonF);
		
		scene3 = new Scene(hbox, 400, 400);
	}
	
}
