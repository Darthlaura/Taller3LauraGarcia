//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package logica;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import dominio.*;

public class EscritorArchivo {
	
	
   /**
    *  
    * @param nombreArchivo
    * @param magos
    */
	public static void guardarMago(String nombreArchivo, ArrayList<Mago> magos) {

		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

			for (int i = 0; i < magos.size(); i++) {
				Mago magoActual = magos.get(i);
				String linea = magoActual.getNombreMago() + ";";
				ArrayList<Hechizo> hechizosMago = magoActual.getListaHechizos();
				for (int j = 0; j < hechizosMago.size(); j++) {
					linea = linea + hechizosMago.get(j).getNombreHechizo();
					if (j < hechizosMago.size() - 1) {
						linea = linea + "|";

					}

				}
				escritor.write(linea);
				escritor.newLine();

			}
			escritor.close();

		} catch (IOException e) {
			System.out.println("Error al guardar Magos. ");
		}

	}
	
	/**
	 * 
	 * @param nombreArchivo
	 * @param listaHechizos
	 */
	public static void guardarHechizo(String nombreArchivo, ArrayList<Hechizo> listaHechizos) {
		
		
		try{
			
			BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));
			
			for(int i=0; i< listaHechizos.size();i++) {
				
				Hechizo hechizoActual = listaHechizos.get(i); 
				escritor.write(hechizoActual.formatoArchivo());
				escritor.newLine();
				
				
			}
			escritor.close();
			
			
			
		}catch (IOException e) {
			System.out.println("Error al guardar los hechizos");
		}
	}
	
	
}