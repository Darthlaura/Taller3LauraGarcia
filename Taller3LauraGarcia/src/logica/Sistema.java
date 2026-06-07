//Autor: Laura Garcia
//rut : 26427429-k
//paracelo C2 
package logica;

import java.util.Scanner;
import java.util.*;

import dominio.*;
public class Sistema {
	
    /**
     * Metodo para inicar el sistema en el main  
     */
	public static void iniciarSistema() {
		
		
		Scanner teclado = new Scanner(System.in); 
		try {
			
			ArrayList<Hechizo> listaHechizos = LectorArchivo.leerarchivoHechizos("Hechizos.txt");
			ArrayList<Mago> listaMagos = LectorArchivo.leerArchivoMago("Magos.txt", listaHechizos); 
			Administrador administrador = new AdministradoImple(listaMagos, listaHechizos);
			Analista analista = new AnalistaImple(listaMagos, listaHechizos);
			mostrarMenuPrincipal(teclado, administrador,analista);
			 
		}catch (Exception e) {
			System.out.println("Error al iniciar el sistema");
			e.printStackTrace();
		}
		teclado.close();
	}
	
	/**
	 * Metodo para mostrar el menu principal, sera usado en el metodo de inicar el sistema 
	 * @param teclado
	 * @param administrado
	 * @param analista
	 */
	public static void mostrarMenuPrincipal(Scanner teclado, Administrador administrado, Analista analista) {
		int retornoValidacion;
		boolean continuar = true;
		while (continuar) {
			retornoValidacion = retornoValidacionMenuPrincipal(teclado);
			switch (retornoValidacion) {
			case 1: {
				mostrarMenuPrincipalAministrador(teclado, administrado);
				break;
			}
			case 2: {
				mostrarMenuPrincipalAnalista(teclado,analista);
				break;
			}
			case 3: {
				System.out.println("Saliendo del sistema");
				continuar = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + retornoValidacion);
			}

		}

	}

	/**
	 * Metodo para retornar una opcion valida para el menu principal
	 * @param teclado
	 * @return
	 */
	public static int retornoValidacionMenuPrincipal(Scanner teclado) {

		int entradaNumerica = 0;

		do {
			System.out.println("====Bienvenidos al Sitema de magia======");
			System.out.println("1) Menu Aministrador");
			System.out.println("2) Menu Analista ");
			System.out.println("3) Salir..");
			entradaNumerica = validarEntradaNumerica(teclado);
			if (entradaNumerica < 1 || entradaNumerica > 3) {
				System.out.println("Opcion fuera del rango ingrese nuevamente....");
			}
		} while (entradaNumerica < 1 || entradaNumerica > 3);
		return entradaNumerica;

	}

	/**
	 * Metodo para mostrar el menu principal del administrador
	 * @param teclado
	 */
	public static void mostrarMenuPrincipalAministrador(Scanner teclado, Administrador administrador) {
		int opcion;
		boolean continuar = true;

		while (continuar) {
			opcion = retornoMenuAministrador(teclado);
			switch (opcion) {
			case 1: {

				System.out.println("Ingresar Mago");
				administrador.agregarMago();
				continuar = true;
				break;
			}
			case 2: {
				System.out.println("Modificar Mago");
				administrador.modificarMago();
				continuar = true;
				break;
			}
			case 3: {
				System.out.println("Eliminar Mago");
				administrador.eliminarMago();
				continuar = true;
				break;
			}
			case 4: {
				System.out.println("Agregar Hechizo");
                administrador.agregarHechizo();
				continuar = true;
				break;
			}
			case 5: {
				System.out.println("Modificar Hechizo");
				administrador.modificarHechizo();
				continuar = true;
				break;
			}
			case 6: {
				System.out.println("Eliminar Hechizo");
				administrador.eliminarHechizo();
				continuar = true;
				break;
			}
			case 7: {
				System.out.println("Regresando al Menu Principal");
				continuar = false;
				break;
			}

			default:
				System.out.println("Error en la lectura");
			}

		}

	}

	/**
	 * Metodo para el menu de Aministrador retornar un int que valida la entrada del
	 * menu
	 * 
	 * @param teclado
	 * @return opcion
	 */
	public static int retornoMenuAministrador(Scanner teclado) {
		int opcion;

		do {
			System.out.println("=====Panel Administrador======");
			System.out.println("1) Agregar Mago");
			System.out.println("2) Modificar Mago");
			System.out.println("3) Eliminar Mago");
			System.out.println("4) Agregar Hechizo");
			System.out.println("5) Modifciar Hechizo");
			System.out.println("6) Eliminar Hechizo");
			System.out.println("7) Regresar al Menu Principal");
			System.out.println("Ingrese opcion: ");

			opcion = validarEntradaNumerica(teclado);

			if (opcion < 1 || opcion > 7) {
				System.out.println("Opcion fuera del rango vuelva a intentar");

			}

		} while ((opcion < 1 || opcion > 7));
		return opcion;
	}

	/**
	 * Metodo para Mostrar el menu principal Analista
	 * 
	 * @param teclado
	 */
	public static void mostrarMenuPrincipalAnalista(Scanner teclado, Analista analista) {
		int opcion;
		boolean continuar = true;

		while (continuar) {
			opcion = retornoMenuAnalista(teclado);
			switch (opcion) {
			case 1: {

				System.out.println("Top 10 Mejores Hechizos");
				analista.mostrarTop10Hechizos();
				continuar = true;
				break;
			}
			case 2: {
				System.out.println(" Top 3 Mejores Magos");
				analista.mostrarTop3Magos();
				continuar = true;
				break;
			}
			case 3: {
				System.out.println("Mostrar todos los Hechizos");
				analista.mostrarTodosLosHechizos();
				continuar = true;
				break;
			}
			case 4: {
				System.out.println("Mostrar todos los magos");
				analista.mostrarTodosLosMagos();

				continuar = true;
				break;
			}
			case 5: {
				System.out.println("Mostrar todos los Hechizos junto a su puntuacion");
				analista.mostrarHechizosConPuntuacion();
				continuar = true;
				break;
			}
			case 6: {
				System.out.println("Mostrar todos los magos junto a su puntuacion");
				analista.mostrarMagosConPuntuaciones();
				continuar = true;
				break;
			}
			case 7: {
				System.out.println("Regresando al Menu Principal");
				continuar = false;
				break;
			}

			default:
				System.out.println("Error en la lectura");
			}

		}

	}

	/**
	 * Metodo para retornar un ir del menu Analista
	 * 
	 * @param teclado
	 * @return
	 */
	public static int retornoMenuAnalista(Scanner teclado) {
		int opcion;

		do {
			System.out.println("=====Panel Analista======");
			System.out.println("1) Top 10 Mejores Hechizos");
			System.out.println("2) Top 3 Mejores Magos");
			System.out.println("3) Mostrar todos los Hechizos");
			System.out.println("4) Mostrar todos los Magos");
			System.out.println("5) Mostrar todos los Hechizos junto a su puntiacion");
			System.out.println("6) Mostrrar todos los magos junto a su puntuacion");
			System.out.println("7) Regresar al Menu Principal");
			System.out.println("Ingrese opcion: ");

			opcion = validarEntradaNumerica(teclado);

			if (opcion < 1 || opcion > 7) {
				System.out.println("Opcion fuera del rango vuelva a intentar");

			}

		} while ((opcion < 1 || opcion > 7));
		return opcion;
	}

	/**
	 * Metodo para validar la entrada numerica
	 * 
	 * @param teclado
	 * @return
	 * @throws NumberFormatException
	 */
	public static int validarEntradaNumerica(Scanner teclado) throws NumberFormatException {

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

}
