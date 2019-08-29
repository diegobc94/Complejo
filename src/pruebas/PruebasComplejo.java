package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import complejo.Complejo;

public class PruebasComplejo {
	public static void main(String[] args) 
	{
		Complejo z1 = new Complejo();
		Complejo z2 = new Complejo(2,2);
		Complejo z3 = new Complejo(1.1,1.1);
		System.out.println(z1); //no necesario .toString
		System.out.println(z2); //
		System.out.println(z3); //
		z3=z1.suma(z2);
		System.out.println(z3); // muestra 2,2
		z3=Complejo.suma(z3,z2);
		System.out.println(z3); // muestra 4,4
		z2 = (Complejo) z1.clone();
		System.out.println(z2);
		
				
		List<Complejo> vComplejo = new ArrayList<Complejo>();
		//Iterator<Complejo> itComplejos = vComplejo.iterator();
		
		for (int i=0; i<10;i++)
			vComplejo.add(i,new Complejo(Math.sin(i+10),Math.cos(i+20))) ;
		
		for (int i=0; i<10;i++)
			System.out.println(vComplejo.get(i).modulo());
			
				
		Collections.sort(vComplejo);
		System.out.println("Ahora ordenado");
		
		for (int i=0; i<10;i++)
			System.out.println(vComplejo.get(i).modulo());
		}
}
