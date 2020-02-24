import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	 Button N_mensaje = new Button("Nuevo Mensaje");
	 StackPane root = new StackPane(N_mensaje);
	 WindowSendMessage SecondWindow = new WindowSendMessage();
	 
	 
	 @Override
	    public void start(Stage primaryStage) {
		 	
		 	N_mensaje.setOnAction(new EventHandler<ActionEvent>() {
		 		public void handle(ActionEvent e) {
		 			SecondWindow.CreateSecondStage(SecondWindow.SecondStage);
		 			 
		 		}
		 	});
	               
	        Scene scene = new Scene(root, 300, 250);

	        primaryStage.setTitle("WhatsOpp");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	 }
	public static void main(String[] args) {
		launch(args);
	}

}
