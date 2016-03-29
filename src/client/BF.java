package client;

import model.Lecteur;

public class BF {

	public static void main(String[] args) {
		Lecteur lecteur = new Lecteur(System.in);
		lecteur.Process();
	}

}
