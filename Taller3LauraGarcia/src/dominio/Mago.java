package dominio;

import java.util.ArrayList;

public class Mago {

	private String nombreMago;
	private ArrayList<Hechizo> listaHechizos;
	
	
	public Mago(String nombreMago, ArrayList<Hechizo> listaHechizos) {
		this.nombreMago = nombreMago;
		this.listaHechizos = listaHechizos;
	}


	
	public String getNombreMago() {
		return nombreMago;
	}


	public ArrayList<Hechizo> getListaHechizos() {
		return listaHechizos;
	} 
	
	
	
}
