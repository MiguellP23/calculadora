package co.edu.unbosque.model;

public class Suma2 implements Operacion {
    @Override
    public double operar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a + b;
    }
}
