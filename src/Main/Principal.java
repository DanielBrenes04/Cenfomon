package Main;

import java.util.Scanner;


public class Principal {

    private static MainGestor gGestor = new MainGestor();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {





        gGestor.NuevoCenfomon();
        int OpcMenu = 0;
        do {
            OpcMenu = ImprimirMenu();
            System.out.print(gGestor.ProcesarOpcion(OpcMenu));
        }while (OpcMenu != 0);
    }

    private static int ImprimirMenu(){
        String cad="";

        cad=cad+"\n";
        cad=cad+"\nIngrese la opcion que desea procesar";
        cad=cad+"\n(1)Ver informcaion de tu Cenfomon";
        cad=cad+"\n(2)Alimentar a tu Cenfomon";
        cad=cad+"\n(3)Equipar o desequipar una piedra tiempo infinito";
        System.out.println(cad);
        return scan.nextInt();
    }
}
