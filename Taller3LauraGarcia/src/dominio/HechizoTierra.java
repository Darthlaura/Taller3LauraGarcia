//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package dominio;

public class HechizoTierra extends Hechizo {
	private int mejoraDefensa;

	public HechizoTierra(String nombreHechizo, String tipo, int dano, int mejoraDefensa) {
		super(nombreHechizo, tipo, dano);
		this.mejoraDefensa = mejoraDefensa;
	}

	public int getMejoraDefensa() {
		return mejoraDefensa;
	}

	
	public int calcularPuntuacion() {
		int total;
		total=((getDano()*mejoraDefensa)/2);
		return total;
	}

	public void setMejoraDefensa(int mejoraDefensa) {
		this.mejoraDefensa = mejoraDefensa;
	}

	@Override
	public String formatoArchivo() {
		return getNombreHechizo() + ";" + getTipo() + ";" + getDano() + ";" + getMejoraDefensa();
	} 
	
	
	
	

}
