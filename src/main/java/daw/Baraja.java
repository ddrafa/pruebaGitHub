/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author ddrafa
 */
public class Baraja {

    public static final int TAM_CARTA = 40;
    private final Naipe[] naipeArray = new Naipe[TAM_CARTA];

    public Baraja() {
        for (int i = 0; i < naipeArray.length; i++) {
            naipeArray[i] = new Naipe();
            for (int j = 0; j < i; j++) {
                if (naipeArray[j] == naipeArray[i]) {
                    i--;
                }
            }
        }
    }

    public Naipe[] getNaipeArray() {
        return naipeArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAM_CARTA; i++) {
            sb.append(i + 1).append(".- ").append(naipeArray[i]).append("\n");
        }
        return sb.toString();
    }

    public void barajar(int movimientos) {
        Random rd = new Random();
        int c1 = 0;
        int c2 = 0;
        for (int i = 1; i <= movimientos; i++) {
            do {
                c1 = rd.nextInt(0, naipeArray.length);
                c2 = rd.nextInt(0, naipeArray.length);
            } while (c1 == c2);
            Naipe s1 = this.naipeArray[c1];
            Naipe s2 = this.naipeArray[c2];
            this.naipeArray[c1] = s2;
            this.naipeArray[c2] = s1;
        }
    }

    public Naipe[] sacar(int numCartas) {
        if (numCartas < 1 || numCartas > 40) {
            return new Naipe[0];
        } else {
            Random rd = new Random();
            Naipe[] sacados = new Naipe[numCartas];

            for (int i = 0; i < sacados.length; i++) {
                int cell = rd.nextInt(0, TAM_CARTA);
                sacados[i] = naipeArray[cell];
                naipeArray[cell] = null;
            }
            return sacados;
        }
    }
}
