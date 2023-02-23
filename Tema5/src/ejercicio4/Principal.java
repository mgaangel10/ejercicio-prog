package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c3=new Contacto(3,"raul","c@a.com");
		Contacto c4=new Contacto(4,"jaime","d@a.com");
		Contacto c2=new Contacto(2,"marco","b@a.com");
		Contacto c1=new Contacto(1,"angel","a@a.com");
		
		
		Map <Contacto,Integer> listado=new HashMap <Contacto,Integer>();
		//agregamos con coleccion
		listado.put(c1, 111111);
		listado.put(c2, 2222222);
		listado.put(c3, 333333);
		listado.put(c4, 444444);
		Agenda a = new Agenda(listado);
		System.out.println("agregar y mostrar");
		a.agregar(c4, 444444);
		a.mostrar();
		System.out.println(a.findById(2));
		System.out.println("ahora elimina ");
		
		a.eliminar(2);
		a.mostrar();
		TreeMap<Integer,Contacto> ordenado = new TreeMap<Integer,Contacto>();
		ordenado.putAll(ordenado);
		
	}

}
