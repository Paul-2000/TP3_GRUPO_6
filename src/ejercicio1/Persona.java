package ejercicio1;

public class Persona {
		
	private String Nombre;
	
	private String Apellido;
	
	private String DNI;

	@Override
	public String toString() {
		return Nombre + "-" + Apellido + "-" + DNI;
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
}
