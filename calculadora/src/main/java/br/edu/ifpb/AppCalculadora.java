package br.edu.ifpb;

import java.util.Scanner;

public class AppCalculadora {

    public int menu(Scanner sc) {
        System.out.println("");
        System.out.println("========Calculadora============");
        System.out.println("1 Para Somar");
        System.out.println("2 Para Subtração");
        System.out.println("3 Para Multiplicação");
        System.out.println("4 Para Divisão");
        System.out.println("5 Sobre");
        System.out.println("6 Para Sair");
        System.out.println("Digite uma opção: ");

        return sc.nextInt();
    }

    // public static int soma(int n1, int n2) {

    // return n1 + n2;

    // }

    // public static int sub(int n1, int n2) {

    // return n1 - n2;

    // }

    // public static int mult(int n1, int n2) {

    // return n1 * n2;

    // }

    // public static int div(int n1, int n2) {

    // return n1 / n2;

    // }
}