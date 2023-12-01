/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author ddrafa
 */
public class Baraja {

    private Naipe[] naipeArray = new Naipe[40];

    public Baraja() {
        for (int i = 0; i < naipeArray.length; i++) {
            naipeArray[i] = new Naipe();
            for (int j = 0; j<i ; j++){
                if (naipeArray[j]==naipeArray[i])
                    i--;
                break;
            }
        }
    }

    public Naipe[] getNaipeArray() {
        return naipeArray;
    }

    public void setNaipeArray(Naipe[] naipeArray) {
        this.naipeArray = naipeArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Baraja{");
        for(int i = 0;i<naipeArray.length;i++){
        sb.append("naipeArray=").append(naipeArray[i].toString());
        }
        sb.append('}');
        return sb.toString();
    }
    
}
