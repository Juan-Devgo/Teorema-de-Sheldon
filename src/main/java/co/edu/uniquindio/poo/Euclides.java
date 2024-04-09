package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Euclides implements Proposicion{
    private float dividendo;
    private float divisor;
    private float cociente;
    private double residuo;

    public Euclides(){

    }

    public Euclides(Integer dividendo, Integer divisor){
        assert divisor != 0:"E de estúpido";
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    private List<Double> RealizarAlgoritmo(){
        List<Double> cocienteYResiduo = new ArrayList<>();
        int cociente = (int)Math.floor(dividendo/divisor);
        double residuo = dividendo % divisor;
        this.cociente = cociente; this.residuo = residuo;
        cocienteYResiduo.add((double)cociente); cocienteYResiduo.add(residuo);
        return cocienteYResiduo;
    }

    public List<Double> RealizarAlgoritmo(double dividendo, double divisor){
        List<Double> cocienteYResiduo = new ArrayList<>();
        int cociente = (int)Math.floor(dividendo/divisor);
        double residuo = dividendo % divisor;
        cocienteYResiduo.add((double)cociente); cocienteYResiduo.add(residuo);
        return cocienteYResiduo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }public void setDivisor(int divisor) {
        assert divisor != 0:"E de estúpido";
        this.divisor = divisor;
    }

    public float getCociente() {
        RealizarAlgoritmo();
        return cociente;
    }public float getDividendo() {
        return dividendo;
    }public float getDivisor() {
        return divisor;
    }public double getResiduo() {
        RealizarAlgoritmo();
        return residuo;
    }
}
