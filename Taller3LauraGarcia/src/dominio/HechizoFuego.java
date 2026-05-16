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
	
	

}
