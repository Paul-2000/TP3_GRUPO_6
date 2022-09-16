package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	
	private String source;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean exist()
	{
		File file = new File(source); 
		if(file.exists())
		      return true;
		return false;
	}
	
	public void read_line() 
	{
		FileReader reader;
		
		try 
		{
			reader = new FileReader(source);
			BufferedReader buffer = new BufferedReader(reader);
			
		    String line = "";
		   
			while (line != null) 
			{
				System.out.println(line);
				line = buffer.readLine();
			}
			
			buffer.close();
			reader.close();

		} 
		
		catch (IOException e) 
		{
			System.out.println("No se encontro el archivo");
		}
		
		
	}
	
}