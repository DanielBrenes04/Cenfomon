package Creacional.producto_concreto;

import Comportamiento.Interfase.IObservador;
import Creacional.producto.Cenfomon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CemfomonPlanta extends Cenfomon {
    private List<IObservador> observers = new ArrayList<IObservador>();
    private static Scanner scan = new Scanner(System.in);
    private boolean flag1 = false;
    private boolean flag2 =false;
    public CemfomonPlanta(String nombre, String tipo, int nivel, int HP, int ataque, int defensa, String naturaleza, String mov1, String mov2, String mov3, boolean piedraeterna, boolean metamorfosis2) {
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



    @Override
    public String getCenfomon() {
        return "Su cenfomon es "  +this.getNombre()+ " es tipo "+this.getTipo()+" y nivel es "+this.getNivel()+"\n"
                +"Ataque :"+this.getAtaque()+"\n"
                +"Defenesa :"+this.getDefensa()+"\n"
                +"Tiene "+this.getHP()+ " puntos de vidas\n"
                +"su naturaleza es " +this.getNaturaleza()+"\n"
                +"Sabe el movimiento " +this.getMov1()+ "\n"
                +"Sabe el movimiento " +this.getMov2()+ "\n"
                +"Sabe el movimiento " +this.getMov3()+ "\n" +
                "Tiene una piedra eterna equipada "+this.isPiedraeterna();
    }

    @Override
    public String getMovimientos(){
        return this.getNombre()+ " Sabe los siguientes movimientos\n"+
                "Primer movimiento "+this.getMov1()+"\nSegundo movimiento "+this.getMov2()+ "\nTercer movimiento "+this.getMov3();
    }

    @Override
    public void newMov(String mov) {
        System.out.println(this.getNombre()+" esta intentando aprender " +mov);
        System.out.println("Digite 1 para aprender el movimiento y remplezarlo con otro. \n2 para conservar los movimientos antigous");
        int opc = scan.nextInt();
        if (opc == 1) {
            System.out.println(getMovimientos());
            System.out.println("Digite el numero del movimiento a cambiar");
            int movOpc = scan.nextInt();
            switch (movOpc) {
                case 1:
                    setMov1(mov);
                    break;
                case 2:
                    setMov2(mov);
                    break;
                case 3:
                    setMov3(mov);
                    break;
            }


        }
    }

    @Override
    public void SecuenciaMov(){
        String mov;
        switch(this.getNivel()){
            case 5:
                mov ="Latigo";
                newMov(mov);
                break;
            case 10:
                mov ="Espinas";
                newMov(mov);
                break;
            case 15:
                mov ="Petalos remolino";
                newMov(mov);
                break;
            case 20:
                mov ="Drenaje";
                newMov(mov);
                break;
            case 25:
                mov ="Lanzas";
                newMov(mov);
                break;
            case 30:
                mov ="Latigo Dragon";
                newMov(mov);
                break;
            case 35:
                mov ="Absorver";
                newMov(mov);
                break;
            case 40:
                mov ="Tormneta Floral";
                newMov(mov);
                break;
            case 45:
                mov ="Rosa Sangre";
                newMov(mov);
                break;

        }

    }

    @Override
    public void SecuenciaEvo() throws InterruptedException {
        System.out.println("Que? "+this.getNombre()+" esta evolucionando!");
        Thread.sleep(2000);
        for (int i =0;i < 2;i++){
            System.out.println("...");
            Thread.sleep(2000);
        }
    }

    @Override
    public void PiedraEterna() {

        if (this.isPiedraeterna() == false){
            this.setPiedraeterna(true);
        }else if (this.isPiedraeterna() == true){
            this.setPiedraeterna(false);
        }



    }

    @Override
    public void Alimentar() {
        this.setNivel(getNivel()+1);
        this.setHP(getHP()+2);
        this.setAtaque(getAtaque()+4);
        this.setDefensa(getDefensa()+1);
    }

    @Override
    public void Evolocionar() throws InterruptedException {
        if(this.getNivel() >12 && this.isPiedraeterna() == false && flag1 == false){
            SecuenciaEvo();
            System.out.println(getNombre()+" ha metamorfoseado a Caporucros");
            this.setNombre("Caporucros");
            this.setMetamorfosis2(true);
            flag1 = true;
        }
        else if(this.getNivel() > 32 && this.isMetamorfosis2() == true && this.isPiedraeterna()==false && flag2 == false){
            SecuenciaEvo();
            System.out.println(getNombre()+" ha metamorfoseado a Monarucros");
            this.setNombre("Monarucros");
            flag2 =true;
        }
    }

    @Override
    public void addObserver(IObservador o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(IObservador o: observers){
            o.update(this.getNivel(),this.getNombre());
        }
    }

    @Override
    public void cambiarNivel(int val) {
        this.nivel =val;
        notifyObservers();
    }




}