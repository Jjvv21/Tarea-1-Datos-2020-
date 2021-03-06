import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	

	 Events events = new Events();
	 Button NewMessageButton = new Button("MENSAJE");
	 Stage primaryStage = new Stage();
	 TextField Numero = new TextField();
	 
	 /**
	  *  Esta funcion ejecuta la interfaz grafica que va a tener la ventana que pide el numero al cual sera enviado el mensaje
	  */
	 @Override
	    public void start(Stage primaryStage) throws FileNotFoundException {
		 	
		 	events.NewMessage(Numero,NewMessageButton,this.primaryStage);
		 	StackPane root = new StackPane();
		 	Numero.setPromptText("Numero De Telefono");
		 	Numero.setMaxWidth(126);
		 	Numero.setTranslateY(-70);
		 	root.getChildren().addAll(NewMessageButton,Numero);
		 	root.setStyle("-fx-background-color: #aae79f;");
	        Scene scene = new Scene(root, 300, 250);

	        this.primaryStage.setTitle("Watzab");
	        this.primaryStage.setScene(scene);
	        this.primaryStage.show();
	 }
	public static void main(String[] args) {
		launch(args);
	}

}
