package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		//////Ejercicio 1
		String dni = JOptionPane.showInputDialog("Ingrese un DNI por favor");
		try {
			verificarDniInvalido.verificarDniInvalido(dni);
			System.out.println("El DNI ingresado fue: " + dni);
		} catch (DniInvalido e) {
			e.printStackTrace();
		} 
		
		//////Ejercicio 2
		
		//Set file to use
		Archivo file = new Archivo("Personas.txt");
		
		//Instance a TreeSet(no duplicate items and order by compareTo)
		TreeSet<Persona> treePersona = new TreeSet<Persona>();
		
		//Add Personas from Personas.txt to TreeSet<Personas>
		file.read_personas_tolist(treePersona);
		
		// Read TreeSet<Personas> with iterator
		
		Iterator<Persona> it = treePersona.iterator();
		
		while (it.hasNext()) 
		{
			Persona persona = (Persona) it.next();
			System.out.println(persona.toString());
		}
		
	}
	
}
