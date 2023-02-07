package ejercicio4;

import java.util.Arrays;

public class Venta {
	
	private Producto [] lista;

	public Venta(Producto[] lista) {
		super();
		this.lista = lista;
	}
	
	public double calcularPrecioDeUnProducto(Producto p) {
		return p.calcularPrecio();
	}
	
	public double calcularPrecio(int posi) {
		return lista[posi].calcularPrecio();
	}
	
	

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
