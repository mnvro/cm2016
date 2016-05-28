package tp18_19et20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketCoteServeur  {
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private int num;
	
	public SocketCoteServeur(int num,Socket socket) throws IOException{
		this.num = num;
		this.socket = socket;
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
	}
	public void ecrire(Object o) throws IOException{
		oos.writeObject(o);
	}
	public Object lire() throws ClassNotFoundException, IOException{
		return ois.readObject();
	}
	
}
