package ejemplo1;

public class Trabajador {
	
	private String nombre;
	private String puesto;
	public Trabajador(String nombre, String puesto) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
	}
	
	public double calcularPaga(int numHijos) {
		double cant=100;
		return cant*numHijos ;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	

}
