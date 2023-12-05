/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ddrafa
 */
public class Baraja {

    private Naipe[] baraja = new Naipe[40];

    public Baraja() {
        boolean correcto = true;
        for (int i = 0; i < baraja.length; i++) {
            baraja[i] = new Naipe();
            System.out.println(i + ". "+ baraja[i].toString());
            if (i > 0) {
                if (yaContieneValor(baraja, baraja[i])) {
                    i--;
                }
            }
        }
    }

    private static boolean yaContieneValor(Naipe[] array, Naipe carta) {
        for (Naipe elemento : array) {
            if (elemento == carta) {
                return true;
            }
        }
        return false;
    }

}
