package ejemplocomparator;

public class CompararPorNombre {
	
	public int compare(Corredor c1,Corredor c2) {
		String nombre1=c1.getNombre();
		String nombre2=c2.getNombre();
		return -(nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}

}
