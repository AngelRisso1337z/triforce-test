/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri.fuerza;

import java.util.Scanner;

/**
 *
 * @author mrene
 */
public class TriFuerza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero");
        num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            for (int j = i; j <= (num * 2) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            for (int j = i; j < num + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
