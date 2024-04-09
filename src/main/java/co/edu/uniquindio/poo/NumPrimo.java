package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class NumPrimo implements Proposicion{
    private int num;
    private Euclides euclides;
    private boolean cumple;

    public NumPrimo(int num){
        this.num  = num;
        this.euclides = new Euclides(1, 1);
    }

    private boolean ComprobarEsPrimo() {
        boolean cumple = true; int i = 2; int raizNum = (int)Math.ceil(Math.sqrt(Math.abs(num)));
        while (i <= raizNum){
            if((num % i) == 0){
                cumple = false;
                break;
            }i++;
        }
        this.cumple = cumple;
        return cumple;
    }

    public boolean ComprobarEsPrimo(int num) {
        boolean cumple = true; int i = 2; int raizNum = (int)Math.ceil(Math.sqrt(Math.abs(num)));
        if(num != 2){
            while (i <= raizNum){
                if((num % i) == 0){
                    cumple = false;
                    break;
                }i++;
            }
        }
        this.cumple = cumple;
        return cumple;
    }

    public List<Integer> obtenerListaPrimos(int n) {
        List<Integer> primos = new ArrayList<>(); int veces = 0; int i = 2;
        while (veces < n) {
            if (ComprobarEsPrimo(i)) {
                primos.add(i);
                veces++;
            }
            i++;
        }
        return primos;
    }

    public Euclides getEuclides() {
        return euclides;
    }public int getNum() {
        return num;
    }public boolean getCumple() {
        ComprobarEsPrimo();
        return cumple;
    }
}
