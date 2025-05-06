package co.edu.unbosque.controller;
import co.edu.unbosque.model.Operacion;
import co.edu.unbosque.model.Suma;
import co.edu.unbosque.view.ConsolaView;
import co.edu.unbosque.utils.Appconfig;

public class CalculadoraController {
		
	    private ConsolaView vista;

	    public CalculadoraController(ConsolaView vista) {
	        this.vista = vista;
	    }

	    public void iniciar() {
	        double a = vista.pedirNumero("Ingrese el primer numero:");
	        double b = vista.pedirNumero("Ingrese el segundo numero:");
	        int opcion = vista.mostrarMenuYSeleccionar();

	        Operacion operacion;
	        switch (opcion) {
	            case 1 -> operacion = new Suma();
//	            case 2 -> operacion = new Resta();
//	            case 3 -> operacion = new Multiplicacion();
	            case 4 -> operacion = new Division();
	            default -> {
	                vista.mostrarResultado("Opción invalida");
	                return;
	            }
	        }

	        double resultado = operacion.operar(a, b);
	        vista.mostrarResultado("Resultado operacion: " + resultado);
	        System.out.println("Version del programa: " + Appconfig.VERSION);
	    }
	}
