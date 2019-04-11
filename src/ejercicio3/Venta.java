package ejercicio3;

public class Venta {
	
	private int identificador;
	private String descripcion;
	private int cantidad;
	private float precioUnitario;

	public float precioTotal() {
		return precioUnitario * cantidad;
	}

	public Venta(int identificador, String descripcion, int cantidad, float precioUnitario) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Venta [identificador=" + identificador + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ ", precioUnitario=" + precioUnitario + ", precioTotal=" + precioTotal() + "]";
	}
	
	
}
