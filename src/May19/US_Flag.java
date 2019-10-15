package May19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class US_Flag extends Application {
	@Override 
	public void start(Stage primaryStage) {
		//--Set Properties
		Scene scene = new Scene(new USFlagPane());
		primaryStage.setTitle("Flag Project");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
class USFlagPane extends Pane {
	//--WINDOW SETTINGS
	private static final double Pane_W = 718;
	private static final double Pane_H = 370;
	private static final double BG_W = 310;
	private static final double BG_H = 208;
	//--FlagAssembly
	public USFlagPane() {
		this.setPrefSize(Pane_W, Pane_H);
		//--Red Stripes
		double y = 0;
		for (int i = 0; i < 7; i++) {
			Rectangle block = new Rectangle(0, y, 728, 208.0 / 7.0);
			block.setFill(Color.RED);
			y += 2 * 208.0 / 7;
			this.getChildren().add(block);
		}
		//--BackGround
		Rectangle StarBox = new Rectangle(0, 0, BG_W, BG_H);
		StarBox.setFill(Color.BLUE);
		this.getChildren().add(StarBox);
		//--Stars
		//--Import From Net
		final String StarPath = "";
		Image image = new Image(StarPath);
		//--Controls 6x5
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				ImageView star = new ImageView(image);
				star.setX((double) (i * 55 + 8));
				star.setY((double) (j * 40 + 12));
				star.setFitHeight(20.0);
				star.setFitWidth(20.0);
				this.getChildren().add(star);
			}
		}
		//--Controls 5x4
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 5; i++) {
				ImageView star = new ImageView(image);
				star.setX((double) (i * 55 + 35));
				star.setY((double) (j * 40 + 32));
				star.setFitHeight(20.0);
				star.setFitWidth(20.0);
				this.getChildren().add(star);
				}
		}
	}
	
}