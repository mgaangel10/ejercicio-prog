package ejemplocomparator;

public class ComprobarPorMarca {
	
	public int compare(Corredor c1,Corredor c2) {
		double marca1=c1.getMarca();
				double marca2=c2.getMarca();
		if (marca1<marca2) {
			return -1;
		} else {
			if (marca1>marca2) {
				return 1;
			}
		}
		return 0;
	}

}
