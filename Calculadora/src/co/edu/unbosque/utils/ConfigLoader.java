package co.edu.unbosque.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	 private static Properties props = new Properties();

	    static {
	        try {
	            props.load(new FileInputStream("config.properties"));
	        } catch (IOException e) {
	            System.out.println("No se pudo cargar configuración.");
	        }
	    }

	    public static String get(String key) {
	        return props.getProperty(key);
	    }
	
}
