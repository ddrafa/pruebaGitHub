/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ddrafa
 */
public class Baraja {

    public static final int NAIPESXBARAJA = 40;
    private ArrayList<Naipe> baraja;

    // Metodo para inicializar la baraja con cartas ordenadas.
    public Baraja() {
        this.baraja = new ArrayList<>(NAIPESXBARAJA);
        for (PALOS palo : PALOS.values()) {
            for (int numero = 1; numero <= 10; numero++) {
                this.baraja.add(new Naipe(numero, palo));
            }
        }
    }

    public ArrayList<Naipe> getBaraja() {
        return baraja;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baraja.size(); i++) {
            sb.append(i + 1).append(".- ").append(baraja.get(i)).append("\n");
        }
        return sb.toString();
    }

    public void barajar(int movimientos) {
        Random rd = new Random();
        int c1 = 0;
        int c2 = 0;
        for (int i = 1; i <= movimientos; i++) {
            do {
                c1 = rd.nextInt(0, baraja.size());
                c2 = rd.nextInt(0, baraja.size());
            } while (c1 == c2);
            Naipe s1 = this.baraja.get(c1);
            Naipe s2 = this.baraja.get(c2);
            this.baraja.set(c1, s2);
            this.baraja.set(c2, s1);
        }
// Son movimientos (cantidad aleatoria de estos)
//        Collections.shuffle(baraja);
    }

    public Naipe[] sacar(int numCartas) {

        if (numCartas < 1 || numCartas > baraja.size()) {
            return new Naipe[0];
        } else {
            Random rd = new Random();
            Naipe[] sacados = new Naipe[numCartas];

            for (int i = 0; i < sacados.length; i++) {
                int cell = rd.nextInt(0, NAIPESXBARAJA);
                sacados[i] = baraja.get(cell);
                baraja.set(cell, null);
            }
            ArrayList<Naipe> barajaNull = new ArrayList<>();
            barajaNull.add(null);
            baraja.removeAll(barajaNull);

            return sacados;
        }
    }
}
