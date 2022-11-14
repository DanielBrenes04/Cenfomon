package Comportamiento.concreto;

import Comportamiento.Interfase.IObservador;


public class ObservadorC implements IObservador {

    private void mostrarValor(int value,String pNombre){
        System.out.println(pNombre+" Ha subido de nivel "+value+ "!");
    }

    @Override
    public void update(int value, String nombre) {
     mostrarValor(value,nombre);
    }

}