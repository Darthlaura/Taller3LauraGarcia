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

	@Override
	public int calcularPuntuacion() {
		int total;
		total=((getDano()*mejoraDefensa)/2);
		return total;
	} 
	
	
	
	

}
