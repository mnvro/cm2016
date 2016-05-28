package tp18_;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur extends ServerSocket {
	private boolean actif = true;
	private ArrayList<SocketCoteServeur> clients = new ArrayList<SocketCoteServeur>();

	public MonServeur() throws IOException {
		super(0);	
	}
	public MonServeur(int numPort) throws IOException {
		super(numPort);	
	}
	public void accepterPlusieursClients() throws IOException{
		while (this.actif){
			System.out.println("On attend un nouveau client");
			clients.add(new SocketCoteServeur(this.accept()));
			System.out.println("Un nouveau client s'est connecté");
		}
	}
	
	public static void main(String[] args) throws IOException {
		MonServeur ms = new MonServeur(2016);
		ms.accepterPlusieursClients();
		
	}

}
