import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class Events {

	 WindowSendMessage SecondWindow = new WindowSendMessage();
	 TextArea text = new TextArea();
	 Button Send = new Button("Enviar");
	 TextField Number = new TextField();
	 HBox hbox = new HBox();

	 
	public void NewMessage (Button NewMessage) {
		NewMessage.setOnAction(new EventHandler<ActionEvent>() {
	 		public void handle(ActionEvent e) {
	 			SecondWindow.CreateSecondStage(SecondWindow.SecondStage,text,Send,Number,hbox);
	 		
	 		}
	 	});

	}
		
}
