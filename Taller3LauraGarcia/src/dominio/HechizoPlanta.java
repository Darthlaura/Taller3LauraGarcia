//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package dominio;

public class HechizoPlanta  extends Hechizo{

	private int duracionStun; 
	private int cantPlantas;
	
	

	public HechizoPlanta(String nombreHechizo, String tipo, int dano, int duracionStun, int cantPlantas) {
		super(nombreHechizo, tipo, dano);
		this.duracionStun = duracionStun;
		this.cantPlantas = cantPlantas;
	}


	public int getDuracionStun() {
		return duracionStun;
	}


	public int getCantPlantas() {
		return cantPlantas;
	} 
	
	public int calcularPuntuacion() {
		int total = (getDano()+ (duracionStun*cantPlantas));
		return total;
	}


	public void setDuracionStun(int duracionStun) {
		this.duracionStun = duracionStun;
	}


	public void setCantPlantas(int cantPlantas) {
		this.cantPlantas = cantPlantas;
	}


	@Override
	public String formatoArchivo() {
		return getNombreHechizo() + ";" + getTipo() + ";" + getDano() + ";" + getDuracionStun()+ ","
				+ "" + getCantPlantas();
		
	}
	
	
	
}
