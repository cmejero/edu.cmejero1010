package servicios;

import java.util.Scanner;

/** Clase que se encarga de los metodos relacionados con los menu de la aplicacion
 * @author cmejero - 10-10-24*/
public interface MenuInterfaz {

	/**Método que se encarga del menu principal de la aplicación
	 * @author cmejero - 10-10-24 */
	public int menuYSeleccion(Scanner sc);
	
	/**Método que se encarga del menu de empleados
	 * @author cmejero - 10-10-24*/
	public void menuYSeleccionEmpleado(Scanner sc);
	
	/**Método que se encarga del menu gerencia
	 * @author cmejero - 10-10-24 */
	public void menuYSeleccionGerencia(Scanner sc);
}
