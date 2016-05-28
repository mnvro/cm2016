package tp18_19et20;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient2 extends Socket {
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public MonClient2() throws UnknownHostException, IOException{
		super ("127.0.0.1",2016);
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
	}
	public MonClient2(String ip, int numPort) 
			throws UnknownHostException, IOException{
		super(ip,numPort);
		ois = new ObjectInputStream(this.getInputStream());
		oos = new ObjectOutputStream(this.getOutputStream());
	}
	
	public void ecrire (Object  o) throws IOException{
		oos.writeObject(o);
	}
	
	public Object lire () throws ClassNotFoundException, IOException{
		return ois.readObject();
	}
	public static void main(String[] args) 
			throws UnknownHostException, IOException, ClassNotFoundException {
		MonClient2 mc2 = new MonClient2();
		mc2.ecrire("Bonjour du client");
		System.out.println(mc2.lire());
	}
}
