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
        Naipe nB = new Naipe(10, PALOS.oros);
        do{
        nA = new Naipe();
        System.out.println(nA.toString());
        }while(nA==nB);
//
//        Baraja b1 = new Baraja();
//
//        Naipe solicitante = new Naipe(1, PALOS.oros);
//        do {
//            try {
//                System.out.println("Introduce el número de tu carta:");
//                solicitante.setCarta(sc.nextInt());
//                repetir = false;
//            } catch (InputMismatchException ime) {
//                sc.nextLine();
//                System.out.println("Error pon un numero");
//                repetir = true;
//            } catch (IllegalArgumentException iae) {
//                sc.nextLine();
//                System.out.println("Pon un numero entre 1 y 10");
//                repetir = true;
//            }
//        } while (repetir);
//        sc.nextLine();
//        String solicitud = "";
//        do {
//            try {
//                System.out.println("Introduce tu palo:");
//                solicitud = sc.nextLine();
//                solicitante.setPalo(ElegirPalo(solicitud));
//            } catch (IllegalArgumentException iae) {
//                System.out.println("Error pon un palo válido");
//                repetir = true;
//            }
//        } while (repetir);
//        System.out.println(solicitante.toString());
    }

    public static PALOS ElegirPalo(String solicitud) {
        if (solicitud.equalsIgnoreCase(PALOS.bastos.name())) {
            return PALOS.bastos;
        } else if (solicitud.equalsIgnoreCase(PALOS.espadas.name())) {
            return PALOS.espadas;
        } else if (solicitud.equalsIgnoreCase(PALOS.copas.name())) {
            return PALOS.copas;
        } else if (solicitud.equalsIgnoreCase(PALOS.oros.name())) {
            return PALOS.oros;
        }
        throw new IllegalArgumentException("Valor incorrecto");
    }

}
