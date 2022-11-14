package Creacional.creador_concreto;

import Creacional.creador.Fabrica_Abstracta;
import Creacional.producto.Cenfomon;
import Creacional.producto_concreto.*;

public class Fabrica_Cenfomon implements Fabrica_Abstracta {

    public Cenfomon crearCenfomon(int keyID,String nombre, String tipo, int nivel, int HP, int ataque, int defensa, String naturaleza,
                                  String mov1, String mov2, String mov3, boolean piedraeterna, boolean metamorfosis2) {


        if( keyID ==1 )
            return new CenfomonAgua("Osotias","Agua",nivel,HP,ataque,defensa,naturaleza,mov1,mov2,mov3,piedraeterna,metamorfosis2);
        else
            if (keyID ==2)
            return new CenfomonFuego("Feniluna","Fuego",nivel,HP,ataque,defensa,naturaleza,mov1,mov2,mov3,piedraeterna,metamorfosis2);
            else
                return new CemfomonPlanta("Orucros","Planta",nivel,HP,ataque,defensa,naturaleza,mov1,mov2,mov3,piedraeterna,metamorfosis2);

    }



}
