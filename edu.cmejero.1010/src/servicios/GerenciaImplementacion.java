package servicios;

import java.util.Scanner;

import controladores.Inicio;
import dtos.ClienteDto;

/** Clase que se encarga la implementacion de gerencia interfaz 
 * @author cmejero - 10-10-24 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	
	public void nuevoCliente(Scanner sc) {
		String respuesta;
		do {
		long idCliente = autoIncrementacionIdCliente();
		System.out.println("Introduzca el nombre");
		String nombre = sc.next();
		System.out.println("Introduzca los apellidos");
		String salto = sc.nextLine();
		String apellidos = sc.nextLine();
		
		ClienteDto nuevoCliente = new ClienteDto(idCliente,nombre,apellidos);
		Inicio.listaClientes.add(nuevoCliente);
		
		System.out.println("¿Quieres agregar otro nuevo cliente?: s/n");
		respuesta = sc.next();
		
		}while(respuesta.equalsIgnoreCase("s"));
		
		for(ClienteDto clientes : Inicio.listaClientes) {
			
			System.out.println(clientes.toString());
		}
	}
	
	/** Metodo que se encarga de crear una id al nuevo cliente
	 * @author cmejero - 10-10-24 */
	private long autoIncrementacionIdCliente() {
		
		long nuevoId;
		int tamanioLista = Inicio.listaClientes.size();
		if(tamanioLista == 0) {
			
			nuevoId = 1;
		}
		else {
			
			nuevoId = Inicio.listaClientes.get(tamanioLista -1).getIdCliente() +1;
		}
		
		return nuevoId;
	}
}
