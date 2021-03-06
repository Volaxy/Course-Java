package application;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class AnchorPanee extends AnchorPane {
	
	public AnchorPanee() {
		Square s1 = new Square();
		Square s2 = new Square();
		setTopAnchor(s2, 10.0);
		setRightAnchor(s2, 10.0);
		Square s3 = new Square();
		setBottomAnchor(s3, 10.0);
		setRightAnchor(s3, 10.0);
		Square s4 = new Square();
		setBottomAnchor(s4, 10.0);
		setLeftAnchor(s4, 10.0);
		
		Square s5 = new Square();
		setTopAnchor(s5, 10.0);
		setLeftAnchor(s5, 10.0);

		HBox center = new HBox();
		center.setAlignment(Pos.CENTER);
		setTopAnchor(center, 110.0);
		setBottomAnchor(center, 110.0);
		setLeftAnchor(center, 110.0);
		setRightAnchor(center, 110.0);
		
		center.getChildren().add(s5);
		
		getChildren().addAll(s1, s2, s3, s4, center);
	}
	
}
