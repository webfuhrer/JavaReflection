package paquete.pruebasintrospeccion;

import java.lang.reflect.Field;

public class ClasePrincipal {
public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
	Class clase=Perro.class;
	Perro p=new Perro();
	Field[]campos=p.getClass().getDeclaredFields();
	for (Field f: campos)
	{
		f.setAccessible(true);
		f.set(p, "XXX");
	}
	
	System.out.println(p.toString());
}
}
