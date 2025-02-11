package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Código innecesario y poco eficiente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = scanner.nextInt();
        System.out.println("El número ingresado es: " + num);
    }

    public int sum(int a, int b) {
        return a + b; // Falta de comentarios y sin validaciones
    }

    public int duplicateCode(int x) {
        // Código duplicado innecesario
        if (x > 0) {
            return x + 1;
        } else {
            return x + 1; // Código redundante
        }
    }

    public void deadCode() {
        // Código muerto que nunca se ejecuta
        if (false) {
            System.out.println("Esto nunca se imprimirá");
        }
    }

    public void badMethod() {
        int a = 5;
        int b = 10;
        int resultado = sum(a, b);

        if (resultado > 0) {
            System.out.println("Resultado positivo");
        } else {
            System.out.println("Resultado negativo");
        }

        if (resultado % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }

        for (int i = 0; i < 10; i++) {
            if (i == resultado) {
                break;
            }
        }

        // Código innecesariamente largo y sin modularizar
        int c = 15;
        int d = 20;
        int e = sum(c, d);
        if (e > 0) {
            System.out.println("Resultado positivo");
        }
    }
}
