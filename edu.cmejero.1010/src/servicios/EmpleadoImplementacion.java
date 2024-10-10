package servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDto;
import dtos.VentaDto;

/**
 * Clase que se encarga de la implementacion de empleado interfaz
 * 
 * @author cmejero - 10-10-24
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	public void compraCliente(Scanner sc) {

		String respuesta;
		do {
			long idVenta = autoIncrementarIdVenta();

			System.out.println("Introduzca el importe de la venta");
			double importe = sc.nextDouble();

			System.out.println("Introduzca el id del cliente");
			long idCliente = sc.nextLong();
			LocalDateTime fechaInstante = LocalDateTime.now();

			VentaDto nuevaVenta = new VentaDto(idVenta, importe, fechaInstante, idCliente);
			Inicio.listaVentas.add(nuevaVenta);

			System.out.println("¿Quieres agregar otra venta? s/n");
			respuesta = sc.next();

		} while (respuesta.equalsIgnoreCase("s"));

		for (ClienteDto clientes : Inicio.listaClientes) {

			System.out.println(clientes.toString());
		}

	}

	public void calculoVentasMensual(Scanner sc) {
		System.out.println("Introduzca el mes y año de la venta. Formato (MM-yyyy)");
		String fecha = sc.next();
		/**DateTimeFormatter formato = new DateTimeFormatter("MM-yyyy"); */
		

	}

	/**
	 * Metodo que se encarga de generar un nuevo id de ventas de forma automatica
	 * 
	 * @author cmejero - 10-10-24
	 * @return devuelve el valor del id
	 */
	private long autoIncrementarIdVenta() {
		long nuevoId;
		int tamanioLista = Inicio.listaVentas.size();

		if (tamanioLista == 0) {
			nuevoId = 1;
		} else {

			nuevoId = Inicio.listaVentas.get(tamanioLista - 1).getIdVenta() + 1;
		}
		return nuevoId;
	}
}
