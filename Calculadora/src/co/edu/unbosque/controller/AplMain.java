package co.edu.unbosque.controller;

import co.edu.unbosque.view.ConsolaView;

public class AplMain {

	public static void main(String[] args) {
        ConsolaView vista = new ConsolaView();
        CalculadoraController controlador = new CalculadoraController(vista);
        controlador.iniciar();
        
    }
}
