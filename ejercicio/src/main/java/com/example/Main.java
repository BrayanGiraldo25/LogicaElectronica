package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio Resistencia Electrica");
        Scanner scanner = new Scanner(System.in);

        int Color1;
        int Color2;
        int Multiplicador;
        double Tolerancia;
        double resultado;
        String resultadoT;

        String[] Colores = { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris",
                "Blanco" };
        String[] ColoresM = { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris",
                "Blanco", "Oro", "Plata" };
        String[] Porcentaje = { "1%", "2%", "0.5%", "0.25%", "0,1%", "0.05%", "5%", "10%" };
        int[] valores = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] valores2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double[] multiplicador = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 0.1,
                0.01 };

        System.out.println("0. Negro");
        System.out.println("1. Marron");
        System.out.println("2. Rojo");
        System.out.println("3. Naranja");
        System.out.println("4. Amarillo");
        System.out.println("5. Verde");
        System.out.println("6. Azul");
        System.out.println("7. Violeta");
        System.out.println("8. Gris");
        System.out.println("9. Blanco");
        System.out.print("seleccione el primer color: ");
        Color1 = scanner.nextInt();

        if (Color1 < 0 || Color1 > 9) {
            System.out.println("El numero ingresado es invalido, intente de nuevo");

        }
        System.out.println("Seleccionaste como primer color: " + Colores[Color1]);

        System.out.println("0. Negro");
        System.out.println("1. Marron");
        System.out.println("2. Rojo");
        System.out.println("3. Naranja");
        System.out.println("4. Amarillo");
        System.out.println("5. Verde");
        System.out.println("6. Azul");
        System.out.println("7. Violeta");
        System.out.println("8. Gris");
        System.out.println("9. Blanco");
        System.out.print("seleccione el segundo color: ");
        Color2 = scanner.nextInt();

        if (Color2 < 0 || Color2 > 9) {
            System.out.println("Color invalido, intente de nuevo");

        }
        System.out.println("Seleccionaste como segundo color: " + Colores[Color2]);

        System.out.println("0. Negro (x1)");
        System.out.println("1. Marron (x10)");
        System.out.println("2. Rojo (x100)");
        System.out.println("3. Naranja (x1k)");
        System.out.println("4. Amarillo (x10k)");
        System.out.println("5. Verde (x100k)");
        System.out.println("6. Azul (x1M)");
        System.out.println("7. Violeta (x10M)");
        System.out.println("8. Gris (x100M)");
        System.out.println("9. Blanco (x1B)");
        System.out.println("10. Oro (x0.1)");
        System.out.println("11. Plata (x0.01)");
        System.out.print("Selecciona el multiplicador: ");
        Multiplicador = scanner.nextInt();

        if (Multiplicador < 0 || Multiplicador > 11) {
            System.out.println("Multiplicador invalido, intente de nuevo");
        }
        System.out.println("Seleccionaste como multiplicador el color: " + ColoresM[Multiplicador]);

        System.out.println("0. Marron");
        System.out.println("1. Rojo");
        System.out.println("2. Verde");
        System.out.println("3. Azul");
        System.out.println("4. Violeta");
        System.out.println("5. Gris");
        System.out.println("6. Oro");
        System.out.println("7. Plata");
        System.out.print("Seleccione la Tolerancia: ");
        Tolerancia = scanner.nextDouble();

        if (Tolerancia < 0 || Tolerancia > 7) {
            System.out.println("Tolerancia invalida, intente de nuevo");
        }

        resultadoT = (Porcentaje[(int) Tolerancia]);

        resultado = (valores[Color1] * 10 + valores2[Color2] * multiplicador[Multiplicador]);
        if (resultado >= 1000) {
            resultado = resultado / 1000;
            System.out.println("el resultado es " + resultado + "k con tolerancia" + resultadoT + "ohm");
        } else {
            System.out.println("el resultado es " + resultado + " con tolerancia " + resultadoT + " ohm");
        }
        scanner.close();
    }
}