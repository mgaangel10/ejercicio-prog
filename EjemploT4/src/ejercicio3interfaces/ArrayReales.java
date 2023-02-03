package ejercicio3interfaces;

public class ArrayReales implements IEstadisticas {
	
	private double [] num;

	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularMAximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcularsuma() {
		// TODO Auto-generated method stub
		double total=0.0;
		for (int i = 0; i < num.length; i++) {
			total=num[i]+total;
		}
		return total; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
