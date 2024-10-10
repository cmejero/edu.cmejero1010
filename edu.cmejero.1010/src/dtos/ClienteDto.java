package dtos;

/**Clase que se encarga de los datos de los clientes
 *  @author cmejero - 10-10-24
 */
public class ClienteDto {

	long idCliente;
	String nombreCliente = "aaaaa";
	String apellidosCliente = "aaaaa";
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
	
	public ClienteDto(long idCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}

	
	@Override
	public String toString() {
		return "ventaDto [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + "]";
	}
}
