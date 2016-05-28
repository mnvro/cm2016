package tp18_19et20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur2 extends ServerSocket {
	private boolean actif = true;
	private static int nbClients = 0;
	private ArrayList<SocketCoteServeur> clients = 
			new ArrayList<SocketCoteServeur>();

	public MonServeur2() throws IOException {
		super(0);	
		// le serveur va se lancer sur un num port libre choisi par l'OS
	}
	public MonServeur2(int numPort) throws IOException{
		super(numPort);
	}

	public void accepteUnClient() throws IOException, ClassNotFoundException{
		System.out.println("On attend un seul client");
		nbClients++;
		clients.add(new SocketCoteServeur(nbClients,this.accept()));
		System.out.println("on a reçu un seul client");
		System.out.println(this.clients.get(nbClients-1).lire());
		this.clients.get(nbClients-1).ecrire(
				"Vous êtes le client "+ (nbClients-1)+
				"\nBien reçu votre message");
	}
	public void accepteDesClientsNonStop() throws IOException, ClassNotFoundException {
		while (actif){
			System.out.println("on attend un client");
			nbClients++;
			clients.add(new SocketCoteServeur(nbClients,this.accept()));
			System.out.println("on a reçu un nouveau client");
			System.out.println(this.clients.get(nbClients-1).lire());
			this.clients.get(nbClients-1).ecrire(
					"Vous êtes le client "+ (nbClients-1)+
					"\nBien reçu votre message");
		}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MonServeur2 ms2 = new MonServeur2(2016);
		ms2.accepteUnClient();
		System.out.println("On a un nouveau client (un seul)");
		ms2.accepteDesClientsNonStop();
		
	}

}

