//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
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


	public void setNombreMago(String nombreMago) {
		this.nombreMago = nombreMago;
	}



	public ArrayList<Hechizo> getListaHechizos() {
		return listaHechizos;
	} 
	
	public int calculaPuntajeMago() {
		int total =0; 
		for(int i=0; i < listaHechizos.size();i++) {
			total = total + listaHechizos.get(i).calcularPuntuacion();
			
		}
		return total;
		
		
	}



	@Override
	public String toString() {
		return "Mago: " + nombreMago + " : "+ listaHechizos + " \n";
	}




	
	
}
