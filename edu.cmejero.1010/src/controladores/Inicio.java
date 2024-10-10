package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

 /**Clase principal de nuestra aplicación 
  * @author cmejero - 10-10-24
  */
public class Inicio {

	/** Metodo principal de entrada de nuestra aplicación
	 * @author cemejero - 10-10-24
	 * @param args
	 */
	
	static public List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	static public List<VentaDto> listaVentas = new ArrayList<VentaDto>();
	
	
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();

		Scanner sc = new Scanner(System.in);

		int opcionUsuario;

		boolean esCerrar = false;

		do {
			try {

				opcionUsuario = mi.menuYSeleccion(sc);

				switch (opcionUsuario) {

				case 0:
					System.out.println("Has seleccionado cerrar aplicacion");
					esCerrar = true;
					break;

				case 1:
					System.out.println("Has seleccionado menu empleado");
					mi.menuYSeleccionEmpleado(sc);
					break;

				case 2:
					System.out.println("Has seleccionado menu gerencia");
					mi.menuYSeleccionGerencia(sc);
					break;

				default:
					System.out.println("La opcion introducida no es correcta, intentelo de nuevo");

				}

			} catch (Exception e) {

				System.out.println("Se ha producido un error, intentelo más tarde");

			}

		} while (!esCerrar);

	}

}
