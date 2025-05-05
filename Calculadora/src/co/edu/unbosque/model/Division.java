package co.edu.unbosque.model;

public class Division extends Operacion {
    @Override
    public double operar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
