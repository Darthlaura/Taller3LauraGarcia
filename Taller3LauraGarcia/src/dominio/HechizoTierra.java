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
	
	
	
	

}
