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
	
	
	
	public abstract int calcularPuntuacion();
		
		
	}
	
	
	
