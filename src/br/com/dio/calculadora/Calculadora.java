package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int a,b;

        System.out.println("Entre com o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Entre com o segundo número: ");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a,b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }

    public static int somar(int x, int y){
        return x + y;
    }

    public static int subtrair(int x, int y){
        return x - y;
    }

    public static int multiplicar(int x, int y){
        return x * y;
    }

    public static double dividir(double x, double y){
        return x / y;
    }


}
