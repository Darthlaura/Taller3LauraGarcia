package logica;

import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

import dominio.*;

public class LectorArchivo {

	/**
	 * Metodo para leer el archivo Mago, se encarga de recibir los parametros y
	 * retornar un ArrayList<> del objeto Mago
	 * 
	 * @param nombreArchivo
	 * @param listaHechizos
	 * @return
	 * @throws FileNotFoundException
	 */
	public static ArrayList<Mago> leerArchivoMago(String nombreArchivo, ArrayList<Hechizo> listaHechizos)
			throws FileNotFoundException {

		ArrayList<Mago> listaMago = new ArrayList<Mago>();
		File archivo = new File(nombreArchivo);
		Scanner lectura = new Scanner(archivo);

		while (lectura.hasNextLine()) {
			String linea = lectura.nextLine();
			String[] partes1 = linea.split(";");
			String nombreMago = partes1[0];
			String lineaHechizo = partes1[1];
			// separar hechizo
			String[] partes2 = lineaHechizo.split("\\|");

			ArrayList<Hechizo> hechizosLectura = new ArrayList<Hechizo>();//Arraylist para guardar los hechizos de la lectura
			for (int i = 0; i < partes2.length; i++) {
				String tipoHechizo = partes2[i];
				Hechizo hechizoAdd = buscarPorNombre(tipoHechizo, listaHechizos);
				//solo se agrega si hechizo es distinto de null
				if (hechizoAdd != null) {

					hechizosLectura.add(hechizoAdd);
				}
			}
			Mago magolectura = new Mago(nombreMago, hechizosLectura);
			listaMago.add(magolectura);
		}
		lectura.close();
		return listaMago;

	}
    /**
     * Metodo para buscar las coincidencias de los nombres de hechizos en el Arraylist listaHechizos y compararlo con el String leido en el txt
     * @param nombre
     * @param hechizosLectura
     * @return
     */
	public static Hechizo buscarPorNombre(String nombre, ArrayList<Hechizo> listaHechizos) {

		for (int i = 0; i < listaHechizos.size(); i++) {

			Hechizo hechizoActual = listaHechizos.get(i);
			// compraro si hechizo actual . nombre en string es igual al nombre que busco
			if (hechizoActual.getNombreHechizo().equals(nombre)) {
				return hechizoActual;
			}

		}

		return null;

	}
	/**
	 * Metodo para leer el archivo de hechizos y separar por objetos cada uno de los tipos de hechizos 
	 * @param nombreArchivo
	 * @return
	 * @throws FileNotFoundException
	 */
	public static ArrayList<Hechizo> leerarchivoHechizos(String nombreArchivo) throws FileNotFoundException { 
		ArrayList<Hechizo> listaHechizos = new ArrayList<Hechizo>(); 	
		File archivo = new File(nombreArchivo);
		Scanner lectura = new Scanner(archivo);
		
		
		while(lectura.hasNextLine()) {
			
			String linea = lectura.nextLine(); 
			String[] partes = linea.split(";"); 
            String nombreHechizo= partes[0]; 
            String tipo =partes[1]; 
            //Separar para el caso en que sea agua 
            
            if (tipo.equalsIgnoreCase("Agua")) {
            	int dano = Integer.parseInt(partes[2]);
            	String lineasAgua= partes[3];
                String[] partesAgua = lineasAgua.split(","); 
                int cantidadHeal= Integer.parseInt(partesAgua[0]);
                int presionAgua = Integer.parseInt(partesAgua[1]);
                HechizoAgua aguaLectura = new HechizoAgua(nombreHechizo, tipo, dano, cantidadHeal, presionAgua); 
                listaHechizos.add(aguaLectura);
            }
            else if (tipo.equalsIgnoreCase("Fuego")) {
            	int dano = Integer.parseInt(partes[2]);
            	int duracionQuemadura = Integer.parseInt(partes[3]); 
            	HechizoFuego fuegoLectura = new HechizoFuego(nombreHechizo, tipo, dano, duracionQuemadura); 
                listaHechizos.add(fuegoLectura);
            }
            else if (tipo.equalsIgnoreCase("Tierra")) {
            	int dano = Integer.parseInt(partes[2]);
            	int mejoraDefensa = Integer.parseInt(partes[3]); 
            	HechizoTierra tierraLectura = new HechizoTierra(nombreHechizo, tipo, dano, mejoraDefensa); 
            	listaHechizos.add(tierraLectura);
            }
            else if (tipo.equalsIgnoreCase("Planta")) {
            	int dano = Integer.parseInt(partes[2]);
            	String lineasPlanta= partes[3];
                String[] partesPlanta = lineasPlanta.split(","); 
                int cantidadHeal= Integer.parseInt(partesPlanta[0]);
                int presionAgua = Integer.parseInt(partesPlanta[1]);
                HechizoPlanta plantaLectura = new HechizoPlanta(nombreHechizo, tipo, dano, cantidadHeal, presionAgua); 
                listaHechizos.add(plantaLectura);
            }    
           
		}
		lectura.close();
		return listaHechizos;
		

	}
	
	

}






















