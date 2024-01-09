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
public class PruebaBaraja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;
        Naipe n1;
        
        System.out.println("La busqueda del Rey de Oros");

        do {
            n1 = new Naipe();
            System.out.println(n1);
        } while (!(n1.getPalo() == PALOS.OROS && n1.getCarta() == 10));
        System.out.print("\n-------------------------------------------------\n");

        System.out.println("Crear Carta Especifica");
        
        Naipe n2 = new Naipe(1, PALOS.OROS);
        do {
            try {
                try {
                    System.out.println("Introduce un numero de la carta:");
                    n2.setCarta(sc.nextInt());
                } catch (InputMismatchException ime) {
                    repetir = true;
                    sc.nextLine();
                    System.out.println("Error pon un número");
                    break;
                }
                sc.nextLine();
            } catch (IllegalArgumentException iae) {
                repetir = true;
                sc.nextLine();
                System.out.println("Error repeat");
            }
            try {
                System.out.println("Introduce un número válido: 1 oros, 2 espadas, 3 bastos y 4 copas");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        n2.setPalo(PALOS.OROS);
                        repetir = false;
                        break;
                    case 2:
                        n2.setPalo(PALOS.ESPADAS);
                        repetir = false;
                        break;
                    case 3:
                        n2.setPalo(PALOS.BASTOS);
                        repetir = false;
                        break;
                    case 4:
                        n2.setPalo(PALOS.COPAS);
                        repetir = false;
                        break;
                    default:
                        repetir = true;
                        System.out.println("Error no está entre 1 y 4");
                        break;
                }
            } catch (InputMismatchException ime) {
                repetir = true;
                sc.nextLine();
                System.out.println("Error pon un número");
            }
        } while (repetir);
        System.out.println(n1);
        System.out.print("\n-------------------------------------------------\n");

        Baraja b1 = new Baraja();
        System.out.println("Baraja con posiciones desordenadas");
        System.out.println(b1.toString());
        System.out.print("\n-------------------------------------------------\n");
        
        int move = 2;
        b1.barajar(move);
        System.out.println("Baraja con movimientos hechos");
        System.out.println(b1.toString());
        System.out.print("\n-------------------------------------------------\n");
        
        int numCartas = 5;
        Naipe[] sacadas;
        sacadas = b1.sacar(numCartas);
        System.out.println("Cartas sacadas");
        for (int i = 0; i < sacadas.length; i++) {
            System.out.println(sacadas[i]);
        }
        System.out.print("\n-------------------------------------------------\n");
        
        System.out.println("Comprobación de baraja con nulls");
        System.out.println(b1.toString());
    }
}
