package ejercicio1;

public class Persona implements Comparable<Persona>{ 
		
	private String Nombre;
	
	private String Apellido;
	
	private String DNI;

	@Override
	public String toString() {
		return Nombre + "-" + Apellido + "-" + DNI;
	}
	
	//Constructor that gets a string like "xxxNombrexxx-xxxApellidoxxx-xxxDNIxxx" and translates it to Persona
	public Persona(String line) {
		
		String s1, s2, s3;
		
		s1 = line.substring(0, line.indexOf("-"));
	    line = line.substring(line.indexOf("-") + 1);
	    s2 = line.substring(0, line.indexOf("-"));
	    line = line.substring(line.indexOf("-") + 1, line.length());
	    s3 = line;
		
		this.setNombre(s1);
		this.setApellido(s2);
		this.setDNI(s3);
		
	}

	
	public Persona() {
		
	}

	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	//Compare to for treeSet alphabetical ordering by Apellido
	@Override
	public int compareTo(Persona o) {
		return this.getApellido().compareTo(o.getApellido());
	}

}
