package dtos;

import java.time.LocalDateTime;

/**Clase que se encarga de los datos de las ventas
 *  @author cmejero - 10-10-24
 */
public class VentaDto {

	long idVenta;
	double importe = 0.00;
	LocalDateTime fechaVenta;
	long clienteId;
	public long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
	
	public VentaDto(long idVenta, double importe, LocalDateTime fechaVenta, long clienteId) {
		super();
		this.idVenta = idVenta;
		this.importe = importe;
		this.fechaVenta = fechaVenta;
		this.clienteId = clienteId;
	}
	
	
	@Override
	public String toString() {
		return "VentaDto [idVenta=" + idVenta + ", importe=" + importe + ", fechaVenta=" + fechaVenta + ", clienteId="
				+ clienteId + "]";
	}
	
	
	
	
	
	
}
