package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto [] lista  ;
		lista=new Producto [5];
		Producto produc = new Producto(10,"h",7);
		String nombre;
		lista[0]=new Alimentacion(10,"tarta",1,1,5);
		lista[1]=new Ropa(230,"Jordan 11",2,true,10);
		lista[2]=new Electronica(200,"Iphone 14 Pro",3,10,true);
		lista[3]=new Ropa(240,"Nike tech",4,true,10);
		lista[4]=new Ropa(230,"Airforce 1",5,true,10);
		Venta v = new Venta (lista);
		
		LIneaDeVenta lv=new LIneaDeVenta(produc,2);
		System.out.println("esto es solo den ropa");
		v.imprimirRop();
		System.out.println("diga el nombre");
		nombre=Leer.dato();
		v.imprimirBuscado(v.buscarPorclient(nombre));
		
		System.out.println(v.calcularPrecio(0));
		System.out.println(v.calcularPrecio(1));
		System.out.println(v.calcularPrecio(2));
		System.out.println(v.calcularPrecio(3));
		System.out.println(v.calcularPrecio(4));
		
		
		
	
	}
}
