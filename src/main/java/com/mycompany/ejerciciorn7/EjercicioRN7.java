package com.mycompany.ejerciciorn7;
import java.util.Scanner;
public class EjercicioRN7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A ES MAYOR QUE B");
        } else {
            if (A == B) {
                System.out.println("A ES IGUAL A B");
            } else {
                System.out.println("A ES MENOR QUE B");
            }
        }

        scanner.close();
    }
}
