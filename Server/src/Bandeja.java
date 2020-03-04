import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;



public class Bandeja {

	List<String> mensajes = new ArrayList<>();
	private static int i2;

	/**
	 * esta funcion recibe un numero el cual es el numero de puerto al que estara conectado el servidor
	 * @param numero
	 */
	public void setpuerto(String numero) {
		Main.Numero.setText("Tu numero es: "+numero);
	}
	/**
	 * Esta funcion se encarga de recibir el numero de mensajes que llegan para luego ser este numero 
	 * el indice de una lista que contendra los mensajes que llegaron, asi se podran leer todos los mensajes
	 * en el orden en que llegaron al presionar el boton que se genera por cada uno
	 */
	public void NumMensajes() {
		int i=0;
		this.i2=i;
		i++;
	}
	/**
	 * Esta funcion recibe los parametros necesarios para ser representados los mensajes en la interfaz grafica
	 * y que se genere un boton por cada mensaje nuevo que es recibido
	 * Tambien se encarga de enviar el mensaje a la lista para ser almacenado 
	 * @param Mensaje
	 * @param newMessage
	 * @param numero
	 */
	
	public void BandejaEntrada(String Mensaje,Button newMessage,String numero) {
		List<String> mensajes = new ArrayList<>();
		mensajes.add(Mensaje);
		Main.label2.setText(Mensaje);
		newMessage.setStyle("-fx-background-color: white;");
		newMessage.setOnAction(new EventHandler<ActionEvent>() {
	 		public void handle(ActionEvent e) {
	 			
	 			Main.label2.setText(mensajes.get(i2));
	 			
	 		}
		});
		
		Main.BandejaEntrada.getChildren().addAll(newMessage);
		

		
	}
}
