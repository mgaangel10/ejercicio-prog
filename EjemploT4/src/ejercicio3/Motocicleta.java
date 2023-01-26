package ejercicio3;

public class Motocicleta extends Vehiculos {
	
	private int numRueda;

	

	public Motocicleta(double impuesto, double cilindrada, double potencia, double categoria, int numRueda) {
		super(impuesto, cilindrada, potencia, categoria);
		this.numRueda = numRueda;
	}

	public int getNumRueda() {
		return numRueda;
	}

	public void setNumRueda(int numRueda) {
		this.numRueda = numRueda;
	}

	@Override
	public String toString() {
		return super.toString()+"Motocicleta [numRueda=" + numRueda + "]";
	}
	
	
	
	

}
