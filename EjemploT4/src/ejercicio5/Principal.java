package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Empleado v=new Vendedor("angel","perez",1000,1,6,100);
		Empleado g=new Gerente("pepe","martinez",900,2,150);
		
		System.out.println(v.calcularSueldo());
		System.out.println(g.calcularSueldo());
		
//	entra 100%
//		dentro del metodo
//		Alimentacion aux
//		dentro de un for
//		if(lineadeticket[i].getproducto() instanceof Alimentacion){
//		una manera de castear:aux (Alimentacion)lineadeticket[i].getproduct();
//		aux.imprimirmensaje();
//		otra manera de castear:((Alimentacion)lineadeticket[i].getproduct()).imprimirmensaje();
//		}
//		lo que hace esto en este caso es que en el if comprueba que el producto 
//		es de almentacion porque lso productos de alimentacion pone en el enunciado que si queda menos de dos dias 
//		antes de que caduque se rebaja un tanto % y entonces el if comprueab que es de alimentacion y no de otra cosa
//		y si es verdadero dentro del if hay que CASTEAR es decir linea 20 , se hace para poder llamar al metodo imprimirmensaje 
//		que esta en la clase Alimentacion y el metdod imprirmimensaje dentro hay un if que si es menor de dos dias pone un mensaje de que caduca y eso
//		entonces como estamos en la clase Lineadeventa para poder llamar a ese metodo hay que castear para que en el main 
//		cuando llames a etse metodo que esta en la clase Lineadeventa ya compruebe si le falta dos dias o mas para que caduque y si el producto
//		es tipo Alimentacion 
		
	}

	
	
	

}
