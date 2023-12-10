/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author ddrafa
 */
public class PruebaBaraja {

    public static void main(String[] args) {
        Naipe n1;
        System.out.println("La busqueda del Rey de Oros");
        do {
            n1 = new Naipe();
            System.out.println(n1);
        } while (!(n1.getPalo() == PALOS.OROS && n1.getCarta() == 10));
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
        for(int i = 0; i<sacadas.length;i++){
        System.out.println(sacadas[i]);
        }
        System.out.print("\n-------------------------------------------------\n");
        System.out.println("Comprobación de baraja con nulls");
        System.out.println(b1.toString());
    }
}
