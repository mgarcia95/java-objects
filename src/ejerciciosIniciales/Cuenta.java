package ejerciciosIniciales;

public class Cuenta {
	private Double titular;
	private Double cantidad;
	/////////////////Constructores/////////////////
	public Cuenta(Double titular) {
		this.titular=titular;
	}
	public Cuenta(Double titular, Double cantidad) {
		this(titular);
		this.cantidad=cantidad;
	}
	///////////////////Get y Set///////////////////
	public Double getTitular() {
		return this.titular;
	}
	public void setTitular(Double titular) {
		this.titular=titular;
	}
	public Double getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad=cantidad;
	}
	///////////////////toString///////////////////
	public String toString() {
		return "Titular: "+this.titular+", Cantidad: "+this.cantidad;
	}
	///////////////ingresar-retirar///////////////
	public void ingresarCantidad(Double cantidad) {
		if(cantidad>0) this.cantidad=cantidad;
	}
	public void retirarCantidad(Double cantidad) {
		Double fondos = this.cantidad - cantidad;
		if(fondos<=0) this.cantidad = 0.0;
		else this.cantidad = fondos;
	}
}
