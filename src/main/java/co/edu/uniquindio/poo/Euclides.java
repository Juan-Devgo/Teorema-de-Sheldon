package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Euclides implements Proposicion{
    public Euclides(){
    }

    public List<Double> RealizarAlgoritmo(double dividendo, double divisor){
        List<Double> cocienteYResiduo = new ArrayList<>();
        int cociente = (int)Math.floor(dividendo/divisor);
        double residuo = dividendo % divisor;
        cocienteYResiduo.add((double)cociente); cocienteYResiduo.add(residuo);
        return cocienteYResiduo;
    }
}
