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
        palos[0] = "oros";
        palos[1] = "bastos";
        palos[2] = "espadas";
        palos[3] = "copas";
        this.palo = palos[rd.nextInt(0, palos.length)];
    }

    public Naipe(int carta, String palo) {
        String[] palos = new String[4];
        palos[0] = "oro";
        palos[1] = "basto";
        palos[2] = "espada";
        palos[3] = "copa";
        this.carta = carta;
        if (carta < 1 || carta > 10)
            throw new IllegalArgumentException("La carta tiene que estar entre 1 y 10");
        
        this.palo = palo; 
        if (!(palo.equalsIgnoreCase(palos[0]))) 
            if (!(palo.equalsIgnoreCase(palos[1]))) 
                if (!(palo.equalsIgnoreCase(palos[2]))) 
                    if (!(palo.equalsIgnoreCase(palos[3])))
                        throw new IllegalArgumentException("El palo no es igual a ninguno de los palos que existen");
    }

    public int getCarta() {
        return carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe:\n");
        sb.append(carta).append(" de ").append(palo);
        return sb.toString();
    }
    
    
}
