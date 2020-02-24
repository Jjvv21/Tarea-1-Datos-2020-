import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	

	 Events events = new Events();
	 Button NewMessageButton = new Button("Nuevo Mensaje");
	 
	 
	 
	 @Override
	    public void start(Stage primaryStage) {
		 	
		 	events.NewMessage(NewMessageButton);
		 	StackPane root = new StackPane(NewMessageButton);
	        Scene scene = new Scene(root, 300, 250);

	        primaryStage.setTitle("WhatsOpp");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	 }
	public static void main(String[] args) {
		launch(args);
	}

}
