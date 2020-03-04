import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

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
	 TextField remitente = new TextField();
	 Button Send = new Button();
	 HBox hbox_Numero = new HBox();
	 HBox hbox_EnviarMensaje = new HBox();
	 WindowSendMessage BuzonEntrada = new WindowSendMessage();
	 int Puerto = 0; 
	 

	public void NewMessage (TextField Numero,Button NewMessage,Stage stage) throws FileNotFoundException {
		Events.this.Enviar(Send, text,remitente);
		
		FileInputStream NuevoMensaje = new FileInputStream("C:\\Users\\Julio Varela\\Documents\\GitHub\\Tarea-1-Datos-2020-\\NuevoMensaje.jpg"); 
		Image i = new Image(NuevoMensaje);
		ImageView skip = new ImageView(i); 
		NewMessage.setGraphic(skip);
		
		NewMessage.setOnAction(new EventHandler<ActionEvent>() {
	 		public void handle(ActionEvent e) {
	 			
	 			if (Numero.getText().contentEquals("")) {
	 				System.out.println("Inserte el numero de telefono");
	 			}else {
	 				
	 				Cliente SocketClient = new Cliente();
	 				String NumeroEnCadena = Numero.getText();
	 				int Port = Integer.parseInt(NumeroEnCadena);
	 				Puerto = Port;
		 			SecondWindow.CreateSecondStage(SecondWindow.SecondStage,text,Send,hbox_EnviarMensaje,remitente);
		 			stage.close();
	 			}
	 			
	 			
	 		
	 		}
	 	});

	}
	/**
	 * Este metodo se encarga de darle funcionalidad al boton "Enviar"
	 * @param Send
	 *@param texto
	 * @throws FileNotFoundException 
	 */
	 private void Enviar(Button Send,TextField texto,TextField remitente) throws FileNotFoundException {
		FileInputStream EnviarMensaje = new FileInputStream("C:\\Users\\Julio Varela\\Documents\\GitHub\\Tarea-1-Datos-2020-\\Send.png"); 
		Image i2 = new Image(EnviarMensaje);
		ImageView skip2 = new ImageView(i2); 
		Send.setGraphic(skip2); 
		
		Send.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				
				String mensaje = text.getText();
				if( mensaje.contentEquals("")) {
					System.out.println("Procura que el mensaje tenga cuerpo");
				}else {
					
					Label nuevo_mensaje = new Label(mensaje);
					nuevo_mensaje.setWrapText(true);
					Insets espacios = new Insets(10,10,2,2);
					nuevo_mensaje.setMinWidth(300);
					Cliente SocketClient = new Cliente();
					try {
						System.out.println(Puerto);
						SocketClient.Conexion(mensaje,Puerto,remitente.getText());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					
					}
					
					nuevo_mensaje.setStyle("-fx-background-color: #aae79f ;");
					BuzonEntrada.getVBox().setPadding(espacios);
					BuzonEntrada.getVBox().getChildren().addAll(nuevo_mensaje);			
					texto.clear();
					
				}
				
			}
		});
	}
	
		
}
