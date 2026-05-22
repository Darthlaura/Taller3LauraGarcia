//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package dominio;

public class HechizoAgua extends Hechizo {

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

	
	public int calcularPuntuacion() {
		int total = ((getDano() + cantidadHeal + presionAgua) * 2);
		return total;
	}

	public void setCantidadHeal(int cantidadHeal) {
		this.cantidadHeal = cantidadHeal;
	}

	public void setPresionAgua(int presionAgua) {
		this.presionAgua = presionAgua;
	}

	
	@Override
	public String formatoArchivo() {
	
			return getNombreHechizo() + ";" + getTipo() + ";" + getDano() + ";" + getCantidadHeal()+ "," +presionAgua;
	
	}

	
	
}
