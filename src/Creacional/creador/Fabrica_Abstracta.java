package Creacional.creador;

import Creacional.producto.Cenfomon;

public interface Fabrica_Abstracta {
    public Cenfomon crearCenfomon(int jeyid,String nombre, String tipo, int nivel, int HP, int ataque, int defensa, String naturaleza,
                                  String mov1, String mov2, String mov3, boolean piedraeterna, boolean metamorfosis2);
}
