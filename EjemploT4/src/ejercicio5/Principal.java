package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado v=new Vendedor("angel","perez",1000,1,6,100);
		Empleado g=new Gerente("pepe","martinez",900,2,150);
		
		System.out.println(v.calcularSueldo());
		System.out.println(g.calcularSueldo());
		
		
		
	}

	
	
	

}
