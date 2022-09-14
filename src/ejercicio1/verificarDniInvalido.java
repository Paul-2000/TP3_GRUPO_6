package ejercicio1;

public class verificarDniInvalido {

	public verificarDniInvalido ()
	{
	}

	public static boolean verificarDniInvalido(String dni) throws DniInvalido
	{
		boolean result = dni.matches("[0-9]{1,8}");
		
		if(!result) 
		{
			throw new DniInvalido();
		}
			
		return result;

	}
}
