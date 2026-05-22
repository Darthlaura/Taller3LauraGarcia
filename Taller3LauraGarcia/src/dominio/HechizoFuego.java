//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package dominio;

public class HechizoFuego extends Hechizo {
	private int duracionQuemadura;
	
	
	
	public HechizoFuego(String nombreHechizo, String tipo, int dano, int duracionQuemadura) {
		super(nombreHechizo, tipo, dano);
		this.duracionQuemadura = duracionQuemadura;
	}



	public int getDuracionQuemadura() {
		return duracionQuemadura;
	} 
	

	public int calcularPuntuacion() {
		int total;
		total =((getDano() * duracionQuemadura));
		return total;
	}



	public void setDuracionQuemadura(int duracionQuemadura) {
		this.duracionQuemadura = duracionQuemadura;
	}



	@Override
	public String formatoArchivo() {
		return getNombreHechizo() + ";" + getTipo() + ";" + getDano() + ";" + getDuracionQuemadura(); 
	}

}
