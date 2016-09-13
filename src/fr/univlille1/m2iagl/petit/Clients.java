package fr.univlille1.m2iagl.petit;

import java.util.ArrayList;
import java.util.List;

public class Clients {

	protected List<Client> allClient;

	public void addClient(final Client client) {
		allClient.add(client);
	}

	public void delClient(final Client client) {
		allClient.remove(client);
	}

	public Clients() {
		super();
		allClient = new ArrayList<Client>();
	}

}
