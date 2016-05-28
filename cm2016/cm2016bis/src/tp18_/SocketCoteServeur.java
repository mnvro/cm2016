package tp18_;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketCoteServeur {
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private boolean actif;
	public SocketCoteServeur(Socket socket) throws IOException {
		this.socket = socket;
		oos = new ObjectOutputStream(this.socket.getOutputStream());
		ois = new ObjectInputStream(this.socket.getInputStream());
	}
	public Object lireUnObjet() throws ClassNotFoundException, IOException{
		return this.ois.readObject();
	}
	
	
	
	public void ecrireUnObjet(Object o) throws IOException{
		oos.writeObject(o);
	}

}
