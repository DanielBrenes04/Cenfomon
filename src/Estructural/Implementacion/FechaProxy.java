package Estructural.Implementacion;

import Estructural.Interface.IFecha;
import Main.Helper;

import java.lang.annotation.Documented;
import java.time.LocalDate;
import java.time.Period;

public class FechaProxy implements IFecha {
    int resultado;

    public FechaProxy() {
    }

    public int CalcularFecha(int anno, int mes, int dia) {

        LocalDate l = LocalDate.of(anno, mes, dia);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(l, now);


        if (diff.getYears() > 18 && diff.getYears() < 30) {
            if (mes >= 1 && mes <= 4) {
                resultado = 1;
            }
            if (mes >= 5 && mes <= 8) {
                resultado = 2;
            }
            if (mes >= 9 && mes <= 12) {
                resultado = 3;
            }
        } else if (diff.getYears() > 4 || diff.getYears() > 100) {
            int op;
            op = Helper.shortrandomize();
            switch (op) {
                case 1:
                    resultado = 1;
                    break;
                case 2:
                    resultado = 2;
                    break;
                case 3:
                    resultado = 3;
                    break;
            }
        } else if (diff.getYears() < 4 || diff.getYears() > 100) {
            System.out.println("Edad invalida");
            return 0;


        }
        return resultado;
    }
}
