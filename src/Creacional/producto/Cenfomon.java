package Creacional.producto;

import Comportamiento.Interfase.iCenfomon;
import Comportamiento.Interfase.IObservador;

public abstract class Cenfomon  implements iCenfomon {
    public String Nombre;
    public String Tipo;
    public int nivel;
    public int HP;
    public int ataque;
    public int defensa;
    public String Naturaleza;
    public String Mov1;
    public String Mov2;
    public String Mov3;
    public boolean piedraeterna;
    public boolean metamorfosis2;


    public Cenfomon(String nombre, String tipo, int nivel, int HP, int ataque, int defensa, String naturaleza,
                    String mov1, String mov2, String mov3, boolean piedraeterna, boolean metamorfosis2) {
        setNombre(nombre);
        setTipo(tipo);
        setNivel(nivel);
        setHP(HP);
        setAtaque(ataque);
        setDefensa(defensa);
        setNaturaleza(naturaleza);
        setMov1(mov1);
        setMov2(mov2);
        setMov3(mov3);
        setPiedraeterna(piedraeterna);
        setMetamorfosis2(metamorfosis2);
    }
    public Cenfomon() {
        setNombre("");
        setTipo("");
        setNivel(0);
        setHP(0);
        setAtaque(0);
        setDefensa(0);
        setNaturaleza("");
        setMov1("");
        setMov2("");
        setMov3("");
        setPiedraeterna(false);
        setMetamorfosis2(false);
    }



    //Gets
    public void setNombre(String nombre) { Nombre = nombre; }
    public void setTipo(String tipo) { Tipo = tipo; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public void setHP(int HP) { this.HP = HP; }
    public void setAtaque(int ataque) { this.ataque = ataque; }
    public void setDefensa(int defensa) { this.defensa = defensa; }
    public void setNaturaleza(String naturaleza) { Naturaleza = naturaleza; }
    public void setMov1(String mov1) { Mov1 = mov1; }
    public void setMov2(String mov2) { Mov2 = mov2; }
    public void setMov3(String mov3) { Mov3 = mov3; }
    public void setPiedraeterna(boolean piedraeterna) { this.piedraeterna = piedraeterna; }
    public void setMetamorfosis2(boolean metamorfosis2) { this.metamorfosis2 = metamorfosis2; }

    //Sets
    public String getNombre() { return Nombre; }
    public String getTipo() { return Tipo; }
    public int getNivel() { return nivel; }
    public int getHP() { return HP; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }
    public String getNaturaleza() { return Naturaleza; }
    public String getMov1() { return Mov1; }
    public String getMov2() { return Mov2; }
    public String getMov3() { return Mov3; }
    public boolean isPiedraeterna() { return piedraeterna; }
    public boolean isMetamorfosis2() { return metamorfosis2; }

    //Funciones
    public abstract String getCenfomon();
    public abstract String getMovimientos();
    public abstract void newMov(String parametro);
    public abstract void SecuenciaMov();
    public abstract void SecuenciaEvo() throws InterruptedException;
    public abstract void PiedraEterna();
    public abstract void Alimentar();
    public abstract void Evolocionar() throws InterruptedException;
    public abstract void addObserver(IObservador a);
    public abstract void notifyObservers();
    public abstract void cambiarNivel(int val);



}
