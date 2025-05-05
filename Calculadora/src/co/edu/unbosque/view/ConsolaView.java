package co.edu.unbosque.view;
import java.util.Scanner;

public class ConsolaView {


	    private final Scanner scanner = new Scanner(System.in);

	    public double pedirNumero(String mensaje) {
	        System.out.println(mensaje);
	        return scanner.nextDouble();
	    }

	    public int mostrarMenuYSeleccionar() {
	        System.out.println("Seleccione la operacion:");
	        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
	        return scanner.nextInt();
	    }

	    public void mostrarResultado(String resultado) {
	        System.out.println(resultado);
	    }
	}
