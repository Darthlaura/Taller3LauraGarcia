package logica;

import java.util.*;
import dominio.*;

public class AdministradoImple  implements Administrador {
	
	private ArrayList<Mago> magos; 
	private ArrayList<Hechizo> hechizos;
	
	
	

	public AdministradoImple(ArrayList<Mago> magos, ArrayList<Hechizo> hechizo) {
		this.magos = magos;
	}
	
	
	

	@Override
	public void agregarMago() {
	ArrayList<Hechizo> listaHechizos = new ArrayList<Hechizo>();	
	Scanner teclado = new Scanner(System.in); 
	int cantidadHechizos=0;
	
	System.out.println("Ingrese el mago..");
	String magoAgregar= validarQueingreseCaractr(teclado);
	System.out.println("Ingrese la cantidad de Hechizos que tiene este mago: ");
	cantidadHechizos = validarEntradaNumerica(teclado);
	
    	
	for(int i=0; i< cantidadHechizos;i++ ) {
	    System.out.println("Ingrese el nombre del hechizo" + (i+1));
	    String nombreHechizo = validarQueingreseCaractr(teclado);
		Hechizo hechizoEncontrado = buscarHechizoPorNombre(nombreHechizo, listaHechizos); 
		
		if (hechizoEncontrado != null) {
			listaHechizos.add(hechizoEncontrado);
		}
		else {
			System.out.println("El hechizo no existe primedo debe agregarlo al sistema. ");
			
		}
				
	} 
	
	
	
		
	}

	@Override
	public void modificarMago() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarMago() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarHechizo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarHechizo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarHechizo() {
		// TODO Auto-generated method stub
		
	}
    /**
     * 
     * @param teclado
     * @return
     * @throws NumberFormatException
     */
	public int validarEntradaNumerica(Scanner teclado) throws NumberFormatException {

		int numeroValidado = 0;
		boolean entradaValida = false;

		do {

			try {
				System.out.println(">_: ");
				numeroValidado = Integer.valueOf(teclado.nextLine());
				if (numeroValidado < 1) {
					System.out.println("Solo se permiten numeros positivos ");

				} else {
					entradaValida = true;

				}
			} catch (NumberFormatException e) {
				System.out.println("Error: debe ingresar un numero entero");
			}
		} while (!entradaValida);
		return numeroValidado;
	}
    
	/**
	 * 
	 * @param teclado
	 * @return
	 * @throws IllegalArgumentException
	 */
	public String validarQueingreseCaractr(Scanner teclado) throws IllegalArgumentException{
		
		String opcion=null;
		boolean entradaValida= false; 
				do {
					try {
					System.out.println(">_: ");
					opcion= teclado.nextLine();
					if (!opcion.matches("[a-zA-Z]+")) {
						System.out.println("Ingrese solo letras");
					}
					else {
						entradaValida = true;
					}
					}catch (IllegalArgumentException e) {
						// TODO: handle exception
					}
					
				}while(!entradaValida); 
				return opcion; 
	}
	
	
	private Hechizo buscarHechizoPorNombre(String nombreHechizo, ArrayList<Hechizo>  listaHechizos) {
		Hechizo hechizoActual=null;
		for (int i=0; i< listaHechizos.size();i++) {
			hechizoActual= listaHechizos.get(i); 
			if(hechizoActual.getNombreHechizo().equalsIgnoreCase(nombreHechizo)) {
				System.out.println("Este hechizo ya existe..");
				return hechizoActual; 
				
			}
			}
	return null;	
	}
	
	
	
}
