import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Events {

	 WindowSendMessage SecondWindow = new WindowSendMessage();
	 TextField text = new TextField();
	 Button Send = new Button("ENVIAR");
	 TextField Number = new TextField();
	 HBox hbox = new HBox();
	 WindowSendMessage BuzonEntrada = new WindowSendMessage();
	 
	 

	public void NewMessage (Button NewMessage,Stage stage) throws FileNotFoundException {
		Events.this.Enviar(Send, text);
		FileInputStream input = new FileInputStream("C:\\Users\\Julio Varela\\Documents\\GitHub\\Tarea-1-Datos-2020-\\Send.jpg"); 
		Image i = new Image(input);
		ImageView skip = new ImageView(i); 
		NewMessage.setGraphic(skip);
		NewMessage.setOnAction(new EventHandler<ActionEvent
				>() {
	 		public void handle(ActionEvent e) {
	 			stage.close();
	 			SecondWindow.CreateSecondStage(SecondWindow.SecondStage,text,Send,Number,hbox);
	 		
	 		}
	 	});

	}
	/**
	 * Este metodo se encarga de darle funcionalidad al boton "Enviar"
	 * @param Send
	 *@param texto
	 */
	 private void Enviar(Button Send,TextField texto ) {
		Send.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				
				String mensaje = text.getText();
				if( mensaje.contentEquals("")) {
					System.out.println("El mensaje no tiene cuerpo");
				}else {
					Label nuevo_mensaje = new Label(mensaje);
					nuevo_mensaje.setWrapText(true);
					Insets espacios = new Insets(10,10,2,2);
					nuevo_mensaje.setMinWidth(300);
					
					nuevo_mensaje.setStyle("-fx-background-color: #aae79f ;");
					BuzonEntrada.getVBox().setPadding(espacios);
					BuzonEntrada.getVBox().getChildren().addAll(nuevo_mensaje);				
					texto.clear();
					
				}
				
			}
		});
	}
	
		
}
