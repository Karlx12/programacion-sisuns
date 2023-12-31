package org.sisuns.condicionales.avanzado;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Definir las longitudes de los lados del triángulo
        int lado1 = 0; // Puedes cambiar estos valores según tus necesidades
        int lado2 = 0;
        int lado3 = 0;

        // Verificar si las longitudes forman un triángulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            // Determinar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles");
            } else {
                System.out.println("Es un triángulo escaleno");
            }
        } else {
            System.out.println("No es un triángulo");
        }
    }
}
