package dominio;

public class HechizoAgua  extends Hechizo {
	
	private int cantidadHeal; 
	private int presionAgua;
	
	
	public HechizoAgua(String nombreHechizo, String tipo, int dano, int cantidadHeal, int presionAgua) {
		super(nombreHechizo, tipo, dano);
		this.cantidadHeal = cantidadHeal;
		this.presionAgua = presionAgua;
	}


	public int getCantidadHeal() {
		return cantidadHeal;
	}


	public int getPresionAgua() {
		return presionAgua;
	} 
	
	

}
