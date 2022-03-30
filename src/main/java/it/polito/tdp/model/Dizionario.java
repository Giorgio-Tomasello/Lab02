package it.polito.tdp.model;

import java.util.LinkedList;

public class Dizionario {
	
	LinkedList<Parola> listaParole = new LinkedList<Parola>();

	public void add(Parola p)
	{
		listaParole.add(p);
	}

	public LinkedList<Parola> getListaParole() {
		return listaParole;
	}


}
