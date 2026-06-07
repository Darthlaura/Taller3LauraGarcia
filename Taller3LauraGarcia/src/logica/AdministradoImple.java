//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package logica;
import java.util.*;
import dominio.*;

public class AdministradoImple  implements Administrador {
	
	private ArrayList<Mago> magos; 
	private ArrayList<Hechizo> hechizos;
	
	
	

	public AdministradoImple(ArrayList<Mago> magos, ArrayList<Hechizo> hechizos) {
		this.magos = magos;
		this.hechizos= hechizos;
	}
	
	
	
    /**
     * Metodo para agregar un mago
     */
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
		boolean encontrado = false;
		do {
	    System.out.println("Ingrese el nombre del hechizo" + (i+1));
	    String nombreHechizo = validarQueingreseCaractr(teclado);
		Hechizo hechizoEncontrado = buscarHechizoPorNombre(nombreHechizo, hechizos); 
		
		if (hechizoEncontrado != null) {
			listaHechizos.add(hechizoEncontrado);
			encontrado= true;
			
		}
		else {
			System.out.println("El hechizo no existe primedo debe agregarlo al sistema. ");
			
		}
				
	}while (!encontrado); 
	Mago nuevoMago = new Mago(magoAgregar, listaHechizos); 
	magos.add(nuevoMago); 
	EscritorArchivo.guardarMago("Magos.txt", magos);
	
	
	
		
	}
	}
    /**
     * Metodo para modificar un mago
     */
	@Override
	public void modificarMago() {
		Scanner teclado = new Scanner(System.in);  
		System.out.println(magos.toString());
	
		System.out.println("Que mago desea modificar? ");
		String nombreBuscado = validarQueingreseCaractr(teclado); 
		Mago magoBuscado = buscarMagoPorNombre(nombreBuscado, magos); 
		
		if (magoBuscado != null) {
			System.out.println("Ingrese el nuevo nombre del mago..");
			String nuevoNombre = validarQueingreseCaractr(teclado); 
			magoBuscado.setNombreMago(nuevoNombre);
			EscritorArchivo.guardarMago("Magos.txt", magos);
			System.out.println("Nombre del mago modificado correctamente");
			
		}
		
		else {
			System.out.println("Solo puede Modificar un mago de la lista ya existente...");
			
		}
		}
	
    /**
     * Metodo para eliminar un mago
     */
	@Override
	public void eliminarMago() {
		Scanner teclado = new Scanner(System.in);  
		System.out.println(magos.toString());
		System.out.println("Que mago desea eliminar");
		String nombreEliminado = validarQueingreseCaractr(teclado); 
		Mago magoEliminado = buscarMagoPorNombre(nombreEliminado, magos);
		if (magoEliminado != null) {
			magos.remove(magoEliminado);
			EscritorArchivo.guardarMago("Magos.txt", magos);
			System.out.println("Mago eliminado Correctamente");
			
		}else {
			System.out.println("El mago no existe en la lista.");
		}
		
		
		
	}
    /**
     * Metodo para agregar un hechizo
     */
	@Override
	public void agregarHechizo() {
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Ingrese nombre del hechizo");
		String nombreNuevo = validarQueingreseCaractr(teclado);
		Hechizo nuevoHechizoAgredo = buscarHechizoPorNombre(nombreNuevo, hechizos);
		
		if(nuevoHechizoAgredo == null ) {
		
		System.out.println("Ingrese el tipo de hechizo");
		String tipoNuevo = validarQueingreseCaractr(teclado);
		// segun tipo se ingresa sus valores especiales 
		if(tipoNuevo.equalsIgnoreCase("Agua")) {
			System.out.println("Ingrese el daño que genera el Hechizo");
			int danoNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la cantidad de heal ");
			int cantidadHealNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la presion del agua ");
			int presionAguaNueva= validarEntradaNumerica(teclado); 
			HechizoAgua nuevoHechizoAgua = new HechizoAgua(nombreNuevo, tipoNuevo, danoNuevo, cantidadHealNuevo, presionAguaNueva);
			hechizos.add(nuevoHechizoAgua);
		}else if((tipoNuevo.equalsIgnoreCase("Fuego"))){
			System.out.println("Ingrese el daño que genera el Hechizo");
			int danoNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la duracion de la quemadura");
			int duracionDeLaQuemadura= validarEntradaNumerica(teclado);
			HechizoFuego nuevoHechizoFuego= new HechizoFuego(nombreNuevo, tipoNuevo, danoNuevo, duracionDeLaQuemadura);
			hechizos.add(nuevoHechizoFuego);
			
		}else if((tipoNuevo.equalsIgnoreCase("Tierra"))) {
			System.out.println("Ingrese el daño que genera el Hechizo");
			int danoNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la mejora en la defensa");
			int mejoraDefensa= validarEntradaNumerica(teclado);
			HechizoTierra nuevoHechizoTierra = new HechizoTierra(nombreNuevo, tipoNuevo, danoNuevo, mejoraDefensa);
			hechizos.add(nuevoHechizoTierra); 
			
		}else if ((tipoNuevo.equalsIgnoreCase("Planta"))) {
			System.out.println("Ingrese el daño que genera el Hechizo");
			int danoNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la duracion del Stum ");
			int duracionStumNuevo= validarEntradaNumerica(teclado);
			System.out.println("Ingrese la cantidad de plantas ");
			int cantidadPlantasNueva= validarEntradaNumerica(teclado); 
			HechizoPlanta nuevoHechizoPlanta = new HechizoPlanta(nombreNuevo, tipoNuevo, danoNuevo, duracionStumNuevo, cantidadPlantasNueva);
			hechizos.add(nuevoHechizoPlanta);
		}else {
			
			System.out.println("Hechizo no valido");
		}
		
		EscritorArchivo.guardarHechizo("Hechizos.txt", hechizos);
		System.out.println("Hechizo agregado correctamente.");
		}
		
		
	}
    /**
     * Metodo para modificar un hechizo 
     */
	@Override
	public void modificarHechizo() {
		Scanner teclado = new Scanner(System.in);  
		for (int i =0; i< hechizos.size();i++) {
			Hechizo h = hechizos.get(i); 
			System.out.println((i+1)+") " + h.getNombreHechizo()+ " - "+ h.getTipo());
			
		}
	
		System.out.println("Que Hechizo desea modificar? ");
		String hechizoCambiar = validarQueingreseCaractr(teclado); 
		Hechizo hechizoBuscado = buscarHechizoPorNombre(hechizoCambiar, hechizos);
		
		if (hechizoBuscado != null) {
			System.out.println("Ingrese el nuevo nombre del hechizo..");
			String nuevoNombre = validarQueingreseCaractr(teclado); 
			hechizoBuscado.setNombreHechizo(nuevoNombre);
			EscritorArchivo.guardarHechizo("Hechizos.txt", hechizos);
			System.out.println("Nombre del hechizo modificado correctamente");
			
		}
		
		else {
			System.out.println("Solo puede Modificar un hechizo de la lista ya existente...");
			
		}
	  
		
	}
    /**
     * Metodo para eliminar un hechizo
     */
	@Override
	public void eliminarHechizo() {
		Scanner teclado = new Scanner(System.in);  
		for (int i =0; i< hechizos.size();i++) {
			Hechizo h = hechizos.get(i); 
			System.out.println((i+1)+") " + h.getNombreHechizo()+ " - "+ h.getTipo());
			
		}
		System.out.println("Que hechizo desea eliminar");
		String hechizoEliminado = validarQueingreseCaractr(teclado); 
		Hechizo hechizoBuscado = buscarHechizoPorNombre(hechizoEliminado, hechizos);
		if (hechizoBuscado != null) {
			hechizos.remove(hechizoBuscado);
			EscritorArchivo.guardarHechizo("Hechizos.txt", hechizos);
			System.out.println("Hechizo eliminado correctamente.");
		}else {
			System.out.println("El hechizo no existe en la lista.");
		}
		
		
		
		
		
		
	}
    /**
     * Metodo para validar la entrada de un dato de forma numerica
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
	 * Metodo para validar la entrada por teclado de un caracter usando lenguaje regular (REGEX) 
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
					if (!opcion.matches("[a-zA-ZáéíóúÁÉÓÚñÑ\\s]+")) {
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
	
	/**
	 * Metodo para buscar un hechizo por nombre
	 * @param nombreHechizo
	 * @param listaHechizos
	 * @return
	 */
	private Hechizo buscarHechizoPorNombre(String nombreHechizo, ArrayList<Hechizo>  listaHechizos) {
		Hechizo hechizoActual=null;
		for (int i=0; i< listaHechizos.size();i++) {
			hechizoActual= listaHechizos.get(i); 
			if(hechizoActual.getNombreHechizo().equalsIgnoreCase(nombreHechizo)) {
				System.out.println("Hechizo encontrado.....");
				return hechizoActual; 
				
			}
			}
	return null;	
	}
	
	private Mago buscarMagoPorNombre(String nombreBuscado, ArrayList<Mago> magos ) {
		Mago magoActual =null;
		for(int i=0;i< magos.size();i++) {
		    magoActual = magos.get(i); 
		    if(magoActual.getNombreMago().equalsIgnoreCase(nombreBuscado)) {
		    	System.out.println("Mago encontrado....");
		    	return magoActual;
		    }
		    
		}		
		return null;
	}
	
	

		
		
		
		
	} 
	






