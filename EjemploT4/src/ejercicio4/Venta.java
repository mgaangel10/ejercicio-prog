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
	
	public void imprimirRop() {
		Ropa aux;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Ropa) {
				
				System.out.println(lista[i]);
				
			}
		}
	}
	
	//find
	public Producto buscarPorclient(String nombre) {
		int i= 0;
		boolean encontrado =false;
		while (i<lista.length && !encontrado) {
			Producto delista=lista[i];
			if (delista.getNombre().equalsIgnoreCase(nombre)) {
				encontrado=true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		}else {
			return null;
		}
	}
	
	//esto es mio espera un momento
	
	//imprimir producto
	
	public void impirmirBuscado(String nombre) {
		System.out.println(buscarPorclient(nombre));
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
