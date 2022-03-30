package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.Objects;

public class Parola {
	
	private String parola;
	private String traduzione;
	
	LinkedList<String> listaTraduzioni = new LinkedList<String>();
	
	
	
	public Parola(String parola, String traduzione) {
		super();
		this.parola = parola;
		listaTraduzioni.add(traduzione);
	}
	
	
	
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public String getTraduzione() {
		return traduzione;
	}
	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}
	
	
	


	
	public LinkedList<String> getListaTraduzioni() {
		return listaTraduzioni;
	}



	public String getTraduzioni() {
		String output="";
		for (String s : listaTraduzioni)
		{
			output+=s+"\n";
		}
		return output;
	}



	@Override
	public int hashCode() {
		return Objects.hash(parola, traduzione);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		return Objects.equals(parola, other.parola) && Objects.equals(traduzione, other.traduzione);
	}
	
	

	
	
	

}




