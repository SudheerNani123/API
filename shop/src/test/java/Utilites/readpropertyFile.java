package Utilites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readpropertyFile {
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("C:\\Users\\vasam\\eclipse-workspace\\shop\\src\\test\\resources\\Configfiles\\Config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}
