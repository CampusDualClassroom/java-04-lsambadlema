package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

    }
    // Método que suma los primeros 'num' números enteros
    public static int sumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i ++) {
            sum += i;
        }
        return sum;
    }
    // Método que suma los primeros 'num' números enteros pares
    public static int sumEvenNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += 2 * i; // Sumar los números pares
        }
        return sum;
    }
    // Método que calcula el factorial de 'num'
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *=i;
        }
        return result;
    }
    // Método que calcula el factorial de 'num' usando recursión
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1; // Caso base: 0! es 1
        }
        return num * recursiveFactorial(num -1);// Llamada recursiva
    }
}
