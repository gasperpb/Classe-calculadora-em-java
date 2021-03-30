package br.edu.ifpb;

import java.util.Scanner;

public class testarCalculadora {

    public static void main(String[] args) {

        AppCalculadora calc = new AppCalculadora();
        Scanner sc = new Scanner(System.in);
        int op;

        while ((op = calc.menu(sc)) != 6) {

            if (op == 5) {
                System.out.println(
                        "Calculadora criada usando o estudo classes em java programação II IFPB Campina Grande! ");
            }
            System.out.println("Digite o 1 operado:  ");
            Double n1 = sc.nextDouble();
            System.out.println("Digite o 2 operado:  ");
            Double n2 = sc.nextDouble();

            if (op == 1) {
                System.out.printf("%.2f", (n1 + n2));
            }
            if (op == 2) {
                System.out.printf("%.2f", (n1 - n2));
            }
            if (op == 3) {
                System.out.printf("%.2f", (n1 * n2));
            }
            if (op == 4) {
                System.out.printf("%.2f", (n1 / n2));
            }

        }
    }
}