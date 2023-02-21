package ejercicio3;

import java.util.Objects;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private double notaM;
	private String dni;
//	el hash se crea aqui
	
	public Alumno(String nombre, String apellidos, int edad, double notaM, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notaM = notaM;
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNotaM() {
		return notaM;
	}
	public void setNotaM(double notaM) {
		this.notaM = notaM;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", notaM=" + notaM
				+ ", dni=" + dni + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, nombre, notaM);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaM) == Double.doubleToLongBits(other.notaM);
	}
	
	
	
	
	
	

}
