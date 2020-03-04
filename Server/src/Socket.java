
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Socket extends Thread {
	
	/**
	 * Esta funcion se encarga de generar un numero aleatorio entre 20000 y 30000 el cual sera el puerto
	 * Tambien se encarga de recibir todos los mensajes que lleguen a su puerto y se los envia a una funcion 
	 * encargada de enviarlos a  la interfaz
	 */
	public void run(){
		boolean active = true;
		int port = (int) Math.floor(Math.random()*(30000-20000+1)+20000);
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			Bandeja bandeja = new Bandeja();
			String numeroPuerto = Integer.toString(port);
			bandeja.setpuerto(numeroPuerto);
			while(active) {
				java.net.Socket entrante = serverSocket.accept();
				BufferedReader lector = new BufferedReader(new InputStreamReader(entrante.getInputStream()));
				String mensaje = lector.readLine();
				Button newMensaje = new Button ("Mensaje De:"+entrante.getLocalAddress());
				Platform.runLater(() -> bandeja.BandejaEntrada(mensaje,newMensaje,numeroPuerto));
				Platform.runLater(() -> bandeja.NumMensajes());
	
				entrante.close();	
			
			}
			
			
			

			

			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}