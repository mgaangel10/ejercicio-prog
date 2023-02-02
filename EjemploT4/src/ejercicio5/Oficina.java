package ejercicio5;

import java.util.Arrays;

public class Oficina {
	
	private Empleado lista [];

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}
	
	public double calcularSueldoDeUnEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double sumarSueldos() {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total=total+calcularSueldoDeUnEmpleado(lista[i]);
		}
		return total;
	}
	//añadir
	
	
	
	
	
	

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
