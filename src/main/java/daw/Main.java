/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ddrafa
 */
public class Main {

    public static void main(String[] args) {
        boolean repetir = false;
        Scanner sc = new Scanner(System.in);

        Naipe nA = new Naipe();
        System.out.println(nA.toString());

        Baraja b1 = new Baraja();
        System.out.println(b1.toString());

        Naipe solicitante = new Naipe(1, "oro");
        do {
            try {
                System.out.println("Introduce el número de tu carta:");
                solicitante.setCarta(sc.nextInt());
                repetir = false;
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("Error pon un numero");
                repetir = true;
            }
        } while (repetir);
        sc.nextLine();
        System.out.println("Introduce tu palo:");
        solicitante.setPalo(sc.nextLine());
        System.out.println(solicitante.toString());
    }
}
