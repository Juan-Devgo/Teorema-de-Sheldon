package co.edu.uniquindio.poo;

import java.util.List;

public class App {
    public static void main(String[] args) {

        var numPrimo = new NumPrimo(-31);
        var cumple = numPrimo.getCumple();
        System.out.println(cumple);
        
        var euclides = new Euclides();
        List<Double> resultados = euclides.RealizarAlgoritmo(14.0, 3);
        System.out.println(resultados.get(1)); System.out.println(resultados.get(0));
    
        TeoremaSheldon sheldon = new TeoremaSheldon(73);
        System.out.println(sheldon.comprobarCumpleTeorema()); // = sheldon.getCumple();
    }
}
