package ejercicio4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class Agenda implements Comparator<Contacto>{
//	la clave no se pueded repetir en este caso es Contacto y el valor es Integer
	private Map<Contacto,Integer> listado;

public Agenda(Map<Contacto, Integer> listado) {
	super();
	this.listado = listado;
}

public void agregar(Contacto c,Integer num) {
	listado.put(c, num);
}

//esto saca la clave y el valor
public void mostrar() {
	for (Contacto c: listado.keySet() ) {
		System.out.println(listado.get(c));
		System.out.println(c);
	}
}
public Contacto findById(int id) {
	boolean encontrado;	
	Contacto c;
	Iterator <Contacto> it = listado.keySet().iterator();
	while (it.hasNext()) {
		c=it.next();
		if (c.getId()==id) {
			return c;
		}
		
	}
	return null;
}

public void eliminar(int id) {
	listado.remove(findById(id));
}
public Map<Contacto, Integer> getListado() {
	return listado;
}

public void setListado(Map<Contacto, Integer> listado) {
	this.listado = listado;
}

@Override
public String toString() {
	return "Agenda [listado=" + listado + "]";
}

@Override
public int compare(Contacto o1, Contacto o2) {
	// TODO Auto-generated method stub
	String correo1=o1.getCorreo();
	String correo2=o2.getCorreo();
	return -(correo1.toLowerCase().compareTo(correo2.toLowerCase()));
}

 
	
	

}
