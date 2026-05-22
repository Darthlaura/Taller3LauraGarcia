//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package logica;

import java.util.ArrayList;

import dominio.*;

public class AnalistaImple implements Analista {
	private ArrayList<Mago> listaMagos;
	private ArrayList<Hechizo> listaHechizos;

	public AnalistaImple(ArrayList<Mago> listaMagos, ArrayList<Hechizo> listaHechizos) {
		super();
		this.listaMagos = listaMagos;
		this.listaHechizos = listaHechizos;
	}

	@Override
	public void mostrarTop10Hechizos() {
		// ordenar y copiarHechizos por puntuacion

		System.out.println("Top de los 10 mejores hechizos....");
		listaHechizos = ordenamientoBurbuja(listaHechizos);
		
		int limite =10; 
		if(listaHechizos.size() <10){
			limite = listaHechizos.size();
		}
		for (int i = 0; i < limite; i++) {

			Hechizo hechizoActual = listaHechizos.get(i);
			System.out.println((i + 1) + ")" + hechizoActual.getNombreHechizo() + " Puntaje : "
					+ hechizoActual.calcularPuntuacion());

		}

	}

	@Override
	public void mostrarTop3Magos() {
		System.out.println("Mostrando el top 3 de los mejores magos");

		listaMagos = ordenamiendoBurbujaMago(listaMagos);
		int limite= 3; 
		if (listaMagos.size()<3) {
			limite = listaMagos.size();
		}
		
		for (int i = 0; i < limite; i++) {
			Mago magoActual = listaMagos.get(i);
			System.out.println(
					(i + 1) + ")" + magoActual.getNombreMago() + " Puntaje total : " + magoActual.calculaPuntajeMago());

		}

	}

	@Override
	public void mostrarTodosLosHechizos() {
		// mostrar todos los hechizos

		for (int i = 0; i <listaHechizos.size(); i++) {
			System.out.println(listaHechizos.get(i).toString());

		}

	}

	@Override
	public void mostrarTodosLosMagos() {
		// mostrar todos los magos
		for (int i = 0; i < listaMagos.size(); i++) {
			System.out.println(listaMagos.get(i).toString());

		}

	}

	@Override
	public void mostrarHechizosConPuntuacion() {

		System.out.println("Mostrando hechizos con puntuacion..");

		for (int i = 0; i < listaHechizos.size(); i++) {
			Hechizo hechizoActual = listaHechizos.get(i);
			System.out.println((i + 1) + ")" + hechizoActual.getNombreHechizo() + " Puntanje : "
					+ hechizoActual.calcularPuntuacion());

		}

	}

	@Override
	public void mostrarMagosConPuntuaciones() {
		System.out.println("Mostrando Magos con puntuacion..");

		for (int i = 0; i < listaMagos.size(); i++) {
			Mago magoActual = listaMagos.get(i);
			System.out.println(
					(i + 1) + ")" + magoActual.getNombreMago() + " Puntanje : " + magoActual.calculaPuntajeMago());

		}

	}

	/**
	 * 
	 * @param listaHechizos
	 * @return
	 */
	public ArrayList<Hechizo> ordenamientoBurbuja(ArrayList<Hechizo> listaHechizos) {

		for (int a = 0; a < listaHechizos.size() - 1; a++) {
			for (int b = a+1; b < listaHechizos.size(); b++) {
				if (listaHechizos.get(a).calcularPuntuacion() < listaHechizos.get(b).calcularPuntuacion()) {

					Hechizo aux = listaHechizos.get(a);
					listaHechizos.set(a, listaHechizos.get(b));
					listaHechizos.set(b, aux);

				}

			}

		}
		return listaHechizos;
	}

	public ArrayList<Mago> ordenamiendoBurbujaMago(ArrayList<Mago> listaMagos) {

		for (int a = 0; a < listaMagos.size() - 1; a++) {
			for (int b = a + 1; b < listaMagos.size(); b++) {
				if (listaMagos.get(a).calculaPuntajeMago() < listaMagos.get(b).calculaPuntajeMago()) {
					Mago aux = listaMagos.get(a);
					listaMagos.set(a, listaMagos.get(b));
					listaMagos.set(b, aux);
				}
			}

		}
		return listaMagos;

	}

}
