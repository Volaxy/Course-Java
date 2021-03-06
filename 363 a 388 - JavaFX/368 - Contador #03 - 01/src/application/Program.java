package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String srcCSS = getClass().getResource("/application/style.css").toExternalForm();
		
		VBox mainBox = new VBox(10);
		
		mainBox.getStyleClass().add("main");
		
		Label labelTitle = new Label("Count"); 
		Label labelNumber = new Label("0");
		
		Button buttonDec = new Button("-");
		buttonDec.setOnAction(e -> {
			labelNumber.setText(Double.toString(Double.parseDouble(labelNumber.getText()) - 1));
		});
		Button buttonInc = new Button("+");
		buttonInc.setOnAction(e -> {
			labelNumber.setText(Double.toString(Double.parseDouble(labelNumber.getText()) + 1));
		});
		
		mainBox.getChildren().add(labelTitle);
		labelTitle.getStyleClass().add("title");
		mainBox.getChildren().add(labelNumber);
		labelNumber.getStyleClass().add("number");
		mainBox.setAlignment(Pos.CENTER);
		
		HBox buttons = new HBox(10);
		
		buttons.getChildren().add(buttonDec);
		buttons.getChildren().add(buttonInc);
		buttons.setAlignment(Pos.BOTTOM_CENTER);
		
		mainBox.getChildren().add(buttons);
		
		Scene mainScene = new Scene(mainBox, 200, 200);
		mainScene.getStylesheets().add(srcCSS);
		mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
