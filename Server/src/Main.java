import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

		Label label1 = new Label("Bandeja De Entrada");
		public static Label label2 = new Label();
		Insets insets = new Insets(5, 5, 5, 5);
		public static VBox BandejaEntrada = new VBox();
		Bandeja bandeja = new Bandeja();
		
		
	    public void start(Stage primaryStage)  {	 
	    	
	    	
			BorderPane root = new BorderPane();
			root.setStyle("-fx-background-color: #aae79f;");
			Insets insets = new Insets(5, 5, 5, 5);
			label2.setTranslateY(300);
	    	label2.setTranslateX(15);
	    	BandejaEntrada.setPadding(insets);
	    	BandejaEntrada.getChildren().addAll(label1);
		 	ScrollPane ScrollBandeja = new ScrollPane(BandejaEntrada);
		 	root.setLeft(ScrollBandeja);
		 	root.setRight(label2);
		 	
		 	Scene scene = new Scene(root,500,600);
	        primaryStage.setTitle("Bandeja De Entrada");
	        primaryStage.setScene(scene);	    	   
	        primaryStage.show();
	      
	    }
		public static void main(String[] args) {
			Socket socket = new Socket();
			socket.start();
			launch(args);
			
			
			
		

		}
}
