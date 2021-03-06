package application;

import javafx.scene.layout.FlowPane;

public class FlowPanee extends FlowPane {
	
	public FlowPanee() {
		Square s1 = new Square();
		Square s2 = new Square();
		Square s3 = new Square();
		Square s4 = new Square();
		
		setHgap(10);
		setVgap(10);
		
		getChildren().addAll(s1, s2, s3, s4);
	}
	
}
