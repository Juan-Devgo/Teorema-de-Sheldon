package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class TeoremaSheldon implements Proposicion{
    private final int num;
    private final NumPrimo numPrimo;
    private boolean cumple;

    public TeoremaSheldon(int num){
        assert num > 0; 
        this.num = num;
        this.numPrimo = new NumPrimo(num);
    }
    
    public boolean comprobarCumpleTeorema(){
        boolean cumple = false;
        if (numPrimo.ComprobarEsPrimo(num)) {

            int espejoNum = obtenerEspejo(num);

            if(numPrimo.ComprobarEsPrimo(espejoNum)){

                int productoCifras = multiplicarCifras(num);
                int primoNesimoProductoCifras = ObtenerPrimoPosicion(productoCifras);

        //La posición de "num" debe ser igual al producto de sus cifras.
                if(primoNesimoProductoCifras == num){

                    int espejoProductoCifras = obtenerEspejo(productoCifras);
                    int primoNesimoEspejoProductoCifras = ObtenerPrimoPosicion(espejoProductoCifras);

        //La posición del espejo de la posición de "num" debe ser igual al espejo de "num".
                    if(primoNesimoEspejoProductoCifras == espejoNum){
                        cumple = true;
                        setCumple(cumple);

                    }
                }
            }
        }

        return cumple;
    }

    public int obtenerEspejo(int num) {
        List<Integer> cifras = obtenerCifras(num); int i = 1; int resultado = 0;

        for (Integer integer : cifras) {
            resultado += integer * (Math.pow(10, (cifras.size() - i)));
            i++;
        }
        return resultado;
    }

    public int multiplicarCifras(int num) {
        List<Integer>  cifras = obtenerCifras(num); int resultado = 1;

        for (int integer : cifras) {
            resultado *= integer;
        }
        return resultado;
    }

    public int ObtenerPrimoPosicion(int primoPosicion) {
        List<Integer> listaPrimos = numPrimo.obtenerListaPrimos(primoPosicion);
        return listaPrimos.get(listaPrimos.size() - 1);
    }

    private List<Integer> obtenerCifras(int num) {
        List<Integer> cifras = new ArrayList<>();

        while (num > 0) {
            cifras.add(num % 10);
            num = (int)Math.floor(num/10);
        }return cifras;
    }

    public void setCumple(boolean cumple) {
        this.cumple = cumple;
    }
    public int getNum() {
        return num;
    }public boolean getCumple() {
        comprobarCumpleTeorema();
        return cumple;
    }
}
