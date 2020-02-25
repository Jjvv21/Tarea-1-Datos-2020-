import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Events {

	 WindowSendMessage SecondWindow = new WindowSendMessage();
	 TextArea text = new TextArea();
	 Button Send = new Button("ENVIAR");
	 TextField Number = new TextField();
	 HBox hbox = new HBox();

	public void NewMessage (Button NewMessage,Stage stage) throws FileNotFoundException {
		FileInputStream input = new FileInputStream("C:\\Users\\Julio Varela\\Documents\\GitHub\\Tarea-1-Datos-2020-\\Send.jpg"); 
		Image i = new Image(input);
		ImageView skip = new ImageView(i); 
		NewMessage.setGraphic(skip);
		NewMessage.setOnAction(new EventHandler<ActionEvent>() {
	 		public void handle(ActionEvent e) {
	 			stage.close();
	 			SecondWindow.CreateSecondStage(SecondWindow.SecondStage,text,Send,Number,hbox);
	 		
	 		}
	 	});

	}
		
}
