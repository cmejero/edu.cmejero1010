package servicios;

import java.util.Scanner;

/** Clase que se encarga de la implementacion del menu interfaz
 * @author cmejero - 10-10-24 */
public class MenuImplementacion implements MenuInterfaz {

	public int menuYSeleccion(Scanner sc) {

		int opcionUsuario;
		System.out.println("#####################");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Menu empleado");
		System.out.println("2. Menu gerencia");
		System.out.println("Elige una opción");
		System.out.println("#####################");

		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

	/**Metodo que se encarga de mostrar las diferentes secciones del menu empleado
	 * @author cmejero - 10-10-24*/
	private int menuEmpleado(Scanner sc) {

		int opcionUsuario;
		System.out.println("#####################");
		System.out.println("0. Volver");
		System.out.println("1. Agregar compra a un cliente");
		System.out.println("2. Calculo total de ventas mensual");
		System.out.println("Elige una opción");
		System.out.println("#####################");

		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}

	public void menuYSeleccionEmpleado(Scanner sc) {
		
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		
		int opcionUsuario;

		boolean esVolver = false;

		do {
			try {

				opcionUsuario = menuEmpleado(sc);

				switch (opcionUsuario) {

				case 0:
					System.out.println("Has seleccionado volver");
					esVolver = true;
					break;

				case 1:
					System.out.println("Has seleccionado agregar compra a un cliente");
					ei.compraCliente(sc);
					break;

				case 2:
					System.out.println("Has seleccionado calculo total de ventas mensual");
					ei.calculoVentasMensual(sc);
					break;

				default:
					System.out.println("La opcion introducida no es correcta, intentelo de nuevo");

				}

			} catch (Exception e) {

				System.out.println("Se ha producido un error, intentelo más tarde");

			}

		} while (!esVolver);

	}
	
	/**Metodo que se encarga de mostrar las diferentes secciones del menu gerencia
	 * @author cmejero - 10-10-24*/
	private int menuGerencia(Scanner sc) {

		int opcionUsuario;
		System.out.println("#####################");
		System.out.println("0. Volver");
		System.out.println("1. Crear nuevo cliente");
		System.out.println("#####################");

		opcionUsuario = sc.nextInt();
		return opcionUsuario;
	}
	
	
	public void menuYSeleccionGerencia(Scanner sc) {
		
		 GerenciaInterfaz gi = new GerenciaImplementacion();
		
		int opcionUsuario;

		boolean esVolver = false;

		do {
			try {

				opcionUsuario = menuGerencia(sc);

				switch (opcionUsuario) {

				case 0:
					System.out.println("Has seleccionado volver");
					esVolver = true;
					break;

				case 1:
					System.out.println("Has seleccionado crear nuevo cliente");
					gi.nuevoCliente(sc);
					break;

				default:
					System.out.println("La opcion introducida no es correcta, intentelo de nuevo");

				}

			} catch (Exception e) {

				System.out.println("Se ha producido un error, intentelo más tarde");

			}

		} while (!esVolver);

	}
	
}
