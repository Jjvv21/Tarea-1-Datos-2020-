import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	
	/**
	 * Esta funcion se encarga de establecer una conexion entre el cliente y el server, esto mediante el puerto de salida
	 * Se encarga de enviar el mensaje al servidor
	 * Se encarga de enviar el nombre de la persona junto con el mensaje
	 * @param Mensaje
	 * @param Puerto
	 * @param remitente
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void Conexion(String Mensaje,int Puerto,String remitente) throws UnknownHostException, IOException {
		Socket cliente = new Socket("localhost",Puerto);
		OutputStreamWriter writer = new OutputStreamWriter(cliente.getOutputStream());
		writer.write(remitente+": "+Mensaje);
		writer.close();
		cliente.close();
	}

}	
