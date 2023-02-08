package ejercicio4bienhecho;

public class LineaDeVenta {
	
	private Producto pr;
	private int cant;
	//Constructor
	public LineaDeVenta(Producto pr, int cant) {
		super();
		this.pr = pr;
		this.cant = cant;
	}
	//Getter and setter
	public Producto getPr() {
		return pr;
	}
	public void setPr(Producto pr) {
		this.pr = pr;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	//toString
	@Override
	public String toString() {
		return "LineaDeVenta [pr=" + pr + ", cant=" + cant + "]";
	}
	//Methods
	public double precioTotal() {
		return cant * pr.calcularPVP();
	}

}
