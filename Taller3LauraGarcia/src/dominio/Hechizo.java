//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 

package dominio;

public abstract class Hechizo {
	
	private String nombreHechizo; 
	private String tipo; 
	private int dano;
	
	
	public Hechizo(String nombreHechizo, String tipo, int dano) {
		this.nombreHechizo = nombreHechizo;
		this.tipo = tipo;
		this.dano = dano;
	}


	public String getNombreHechizo() {
		return nombreHechizo;
	}


	public String getTipo() {
		return tipo;
	}


	public int getDano() {
		return dano;
	} 
	
	
	
	public void setNombreHechizo(String nombreHechizo) {
		this.nombreHechizo = nombreHechizo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setDano(int dano) {
		this.dano = dano;
	}
    

	@Override
	public String toString() {
		
		return "Hechizo: " + nombreHechizo + ", tipo: (" + tipo + ")";
	}


	public abstract int calcularPuntuacion();
		
		
	public abstract String formatoArchivo();
	
	}
	
	
	
