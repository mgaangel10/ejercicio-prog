package ejercicio5;

public class Vendedor extends Empleado {
	
	private double cantVent;
	private int icentivo;
	
	public Vendedor(String nombre, String aplleido, double sueldoBase, int numEmp, double cantVent, int icentivo) {
		super(nombre, aplleido, sueldoBase, numEmp);
		this.cantVent = cantVent;
		this.icentivo = icentivo;
	}
	
	
	
	public double calcularSueldo(Empleado e) {
		double total=0.0,total1=0.0;
		if (cantVent>5) {
			total=cantVent*icentivo;
			total1=e.getSueldoBase()+total;
			return total;
		} else {
			return e.getSueldoBase();
		}
		
	}
	
	
	public double getCantVent() {
		return cantVent;
	}
	public void setCantVent(double cantVent) {
		this.cantVent = cantVent;
	}
	public int getIcentivo() {
		return icentivo;
	}
	public void setIcentivo(int icentivo) {
		this.icentivo = icentivo;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendedor [cantVent=" + cantVent + ", icentivo=" + icentivo + "]";
	}



	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
