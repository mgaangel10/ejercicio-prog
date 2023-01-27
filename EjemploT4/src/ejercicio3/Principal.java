	package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double categoria=0.0;
		int op=0, op1=0;
		
		System.out.println("cual es la emision de su vehiculo");
		System.out.println("1---cero");
		System.out.println("2---eco");
		System.out.println("3---tipo b");
		System.out.println("4---tipo c");
		op1=Leer.datoInt();
		switch (op1) {
		case 1:
			categoria=100;
			break;
		case 2:
			categoria=150;
			break;
		case 3:
			categoria=200;
			break;
		case 4:
			categoria=1073;
			break;

		default:
			break;
		}
		Coches c=new Coches(1,200,100,categoria,true);
		Motocicleta m= new Motocicleta(1,150,150,categoria,2);
		Furgonetas f=new Furgonetas(1,300,100,categoria,120);
		
		System.out.println("1---coche");
		System.out.println("2---motos");
		System.out.println("3---furgoneta");
		op=Leer.datoInt();
		switch (op) {
		case 1:
			System.out.println("su impuesto es de:");
			
			break;
		case 2:
			System.out.println("su impuesto es de:");
			
			break;
		case 3:
			System.out.println("su impuesto es de:");
			
			break;

		default:
			break;
		}
	}

}
