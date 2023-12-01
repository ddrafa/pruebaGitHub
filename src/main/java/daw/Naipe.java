/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Random;

/**
 *
 * @author ddrafa
 */
public class Naipe {

    private int carta;
    private String palo;

    public Naipe() {

        Random rd = new Random();
        this.carta = rd.nextInt(1, 11);
        String[] palos = new String[4];
        palos[0] = "oro";
        palos[1] = "basto";
        palos[2] = "espada";
        palos[3] = "copa";
        this.palo = palos[rd.nextInt(0, palos.length)];
    }
}
