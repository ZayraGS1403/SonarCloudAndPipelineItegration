package org.example;

/**
 * Clase principal con métodos de utilidad.
 */
public class Main {


    public static void main(String[] args) {
        Main app = new Main();
        int resultado = app.sumar(2, 3);
        System.out.println("La suma es: " + resultado);
    }
    

    /**
     * Método para sumar dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Método para verificar si un número es par.
     * @param numero Número a evaluar.
     * @return true si es par, false en caso contrario.
     */
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
