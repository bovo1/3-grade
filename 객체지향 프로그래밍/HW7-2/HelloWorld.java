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
			ClockPane clk = new ClockPane();	
			EventHandler<ActionEvent> eventHandler = e ->
			{
				clk.setCurrentTime();
				clk.paintClock();
			};
			Timeline t1 = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
			t1.setCycleCount(Timeline.INDEFINITE);
			t1.play();
			
			Scene scene = new Scene(clk, 250, 250);
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
class ClockPane extends Pane
{
	private int hour;
	private int minute;
	private int second;
	
	ClockPane()
	{
		hour = 10;
		minute = 10;
		second = 0;
	}
	
	void setCurrentTime()
	{
		Calendar cal = new GregorianCalendar();
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
	
	void paintClock()
	{
		double radius = 200/2 * 0.8;
		double centerX = 200 / 2;
		double centerY = 200 / 2;
		Circle c = new Circle(centerX, centerY, radius);
		c.setFill(Color.WHITE);
		c.setStroke(Color.BLACK);
		
		getChildren().add(c);
		
		Text t1 = new Text(centerX -5, centerY-radius + 12, "12");
		Text t2 = new Text(centerX - radius +3, centerY + 5, "9");
		Text t3 = new Text(centerX +radius-10, centerY+3, "3");
		Text t4 = new Text(centerX -3, centerY+radius - 3, "6");
		
		getChildren().addAll(t1,t2,t3,t4);
		
		double sLength = radius * 0.8;
		double secondX = centerX + sLength * Math.sin(second * (2*Math.PI/60));
		double secondY = centerY - sLength * Math.cos(second * (2*Math.PI/60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);
		getChildren().add(sLine);
		
		double mLength = radius * 0.6;
		double minuteX = centerX + mLength * Math.sin(minute * (2*Math.PI/60));
		double minuteY = centerY - mLength * Math.cos(minute * (2*Math.PI/60));
		Line mLine = new Line(centerX, centerY, minuteX, minuteY);
		mLine.setStroke(Color.BLUE);
		getChildren().add(mLine);
		
		double hLength = radius * 0.4;
		double hourX = centerX + hLength * Math.sin((hour + minute/60.0) * (2*Math.PI/12));
		double hourY = centerY - hLength * Math.cos((hour + minute/60.0) * (2*Math.PI/12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);
		getChildren().add(hLine);
		
	}
}