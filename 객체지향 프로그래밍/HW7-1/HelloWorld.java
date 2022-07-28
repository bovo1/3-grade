import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.control.Label;


public class HelloWorld extends Application {
	Button Btstart;
	@Override
	public void start(Stage primaryStage) {
		try
		{
			//ClockPane clk = new ClockPane();
			//clk.setCurrentTime();
			//clk.paintClock();
			//Scene scene = new Scene(clk, 200, 200);
			HBox Hpane = new HBox();
			Hpane.setAlignment(Pos.CENTER);
			Btstart = new Button("Start");
			Hpane.getChildren().add(Btstart);
	
			Pane pane = new Pane();
			BorderPane borderPane = new BorderPane();
			Rectangle rec = new Rectangle(0, 0, 25, 50);
			rec.setFill(Color.ORANGE);
			
			Circle circle = new Circle(125, 100, 50);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			pane.getChildren().add(circle);
			pane.getChildren().add(rec);
			borderPane.setCenter(pane);
			borderPane.setBottom(Hpane);
			
			
			PathTransition pt = new PathTransition();
			pt.setDuration(Duration.millis(4000));
			pt.setPath(circle);
			pt.setNode(rec);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			
			
			Btstart.setOnAction(e->
			{
				if(Btstart.getText() == "Start")
				{
					pt.play();
					Btstart.setText("Stop");
				}
				else if(Btstart.getText() == "Stop")
				{
					pt.pause();
					Btstart.setText("Start");
				}
			});
			
			
			
			Scene scene = new Scene(borderPane, 200, 200);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("ShowCircle");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}