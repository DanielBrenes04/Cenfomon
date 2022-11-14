package Main;

import Comportamiento.concreto.ObservadorC;
import Creacional.creador_concreto.Fabrica_Cenfomon;
import Creacional.producto.Cenfomon;
import Estructural.Implementacion.FechaProxy;
import Estructural.Interface.IFecha;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainGestor {
    static IFecha cFC =new FechaProxy();
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Cenfomon> arrCenfomon =new ArrayList<Cenfomon>();
    private HashMap<String, Cenfomon> ListaProductos;




    public static int CalcularFecha(){
        int anno,mes,dia,key;
        System.out.println("Escriba su nombre");
        String Nombre= scan.nextLine();
        System.out.println("Digite su año de nacimiento");
        anno = scan.nextInt();
        System.out.println("Digite su mes de nacimiento");
        mes = scan.nextInt();
        System.out.println("Digite su dia de nacimiento");
        dia = scan.nextInt();
        key = cFC.CalcularFecha(anno,mes,dia);

       if(key == 0){
            System.exit(0);
        }
        return key;

    }


    public static void NuevoCenfomon() {
        String nombre ="",tipo ="",mov1="",mov2="",mov3 = "";
        int keyId = CalcularFecha();
        int hp = Helper.mediumrandomize();
        int ataque = Helper.mediumrandomize();
        int defensa = Helper.mediumrandomize();
        String naturaleza = Helper.NaturalezCenfomon(Helper.mediumrandomize());


        Fabrica_Cenfomon gFabrica = new Fabrica_Cenfomon();
        add_objeto_array(gFabrica.crearCenfomon(keyId,nombre,tipo,4,hp,ataque,defensa,naturaleza,mov1,mov2,mov3,false,false));
        NuevoObservador();

    }

    public static void add_objeto_array(Cenfomon pcenfomon){arrCenfomon.add(pcenfomon);}

    public static String obtnerDatos(){
        String cResult = "";
        for(Cenfomon mtr : arrCenfomon){
            cResult = cResult + mtr.getCenfomon() +"\n";
                }

                return cResult;
    }

    public static void CambiarPiedra(){

        for(Cenfomon mtr : arrCenfomon){
            mtr.PiedraEterna();
        }

    }

    public static void AlimetarCenfomon() throws InterruptedException {
        for(Cenfomon mtr : arrCenfomon){
            mtr.Alimentar();
            nuevoNivel();
            mtr.Evolocionar();
            mtr.SecuenciaMov();
        }
    }

    public static void NuevoObservador(){
        for(Cenfomon mtr : arrCenfomon){
        mtr.addObserver(new ObservadorC());

        }
    }

    public static void nuevoNivel(){
        for(Cenfomon mtr : arrCenfomon){
            mtr.notifyObservers();
        }
    }



    public static String ProcesarOpcion (int Opc) throws InterruptedException {
        String sMensaje = "";
        switch(Opc){
            case 1:
                sMensaje = obtnerDatos();
                break;
            case 2 :
                AlimetarCenfomon();
                break;
            case 3:
                CambiarPiedra();
                break;
            case 4:

        }


        return sMensaje;
    }


}
