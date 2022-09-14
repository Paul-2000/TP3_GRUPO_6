package ejercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String dni = JOptionPane.showInputDialog("Ingrese un DNI por favor");
		try {
			verificarDniInvalido.verificarDniInvalido(dni);
			System.out.println("El DNI ingresado fue: " + dni);
		} catch (DniInvalido e) {
			e.printStackTrace();
		} 
	}
}
