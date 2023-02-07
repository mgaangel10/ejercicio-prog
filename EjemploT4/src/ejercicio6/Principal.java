package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuentas [] lista;
		lista = new Cuentas[5];
		Oficina of;
		
		
		
		lista[0]=new CuentaJoven(1000,"123a","angel","perez",1,10);
		lista[1]=new CuentaJoven(1000,"123a","angel","perez",1,20);
		lista[2]=new CuentaEmpresa(1000,"123c","pablo","perez",1,true);
		lista[3]=new CuentaCorriente(1000,"123d","pablo","perez",100,30);
		of=new Oficina(lista);
		System.out.println(of.calcularSueldo(0));
		System.out.println(lista[1].calcularPago());
		System.out.println(of.calcularSueldo(2));		
		System.out.println(of.calcularSueldo(3));
		of.imprimirCuentas();
		

	}

}
