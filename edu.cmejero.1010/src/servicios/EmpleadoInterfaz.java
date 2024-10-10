package servicios;

import java.util.Scanner;
/** Clase que se encarga de las operaciones realizadas por empleados
 * @author cmejero - 10-10-24
 */
public interface EmpleadoInterfaz {

	/** Metodo que se encarga de agregar una nueva venta
	 * @author cmejero - 10-10-24
	 * @param sc
	 */
	public void compraCliente(Scanner sc);
	
	/** Metodo que se encarga de calcular todas las ventas de un mes
	 * @author cmejero - 10-10-24
	 * @param sc
	 */
	public void calculoVentasMensual(Scanner sc);
}
