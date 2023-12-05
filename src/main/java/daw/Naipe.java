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
    private PALOS palo;

    public Naipe() {

        Random rd = new Random();
        this.carta = rd.nextInt(1, 11);
        int i = rd.nextInt(1, 5);
        if (i == 1) {
            this.palo = PALOS.bastos;
        } else if (i == 2) {
            this.palo = PALOS.copas;
        } else if (i == 3) {
            this.palo = PALOS.espadas;
        } else {
            this.palo = PALOS.oros;
        }
    }

    public Naipe(int carta, PALOS palo) {
        if (carta < 1 || carta > 10) {
            throw new IllegalArgumentException("La carta tiene que estar entre 1 y 10");
        }
        this.carta = carta;
        this.palo = palo;
    }

    public int getCarta() {
        return carta;
    }

    public PALOS getPalo() {
        return palo;
    }

    public void setCarta(int carta) {
        if (carta < 1 || carta > 10) {
            throw new IllegalArgumentException("La carta tiene que estar entre 1 y 10");
        }

        this.carta = carta;
    }

    public void setPalo(PALOS palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (carta) {
            case 10 -> {
                sb.append("Rey").append(" de ").append(palo);
                break;
            }
            case 9 -> {
                sb.append("Caballo").append(" de ").append(palo);
                break;
            }
            case 8 -> {
                sb.append("Sota").append(" de ").append(palo);
                break;
            }
            default -> {
                sb.append(carta).append(" de ").append(palo);
                break;
            }
        }
        return sb.toString();
    }

}
