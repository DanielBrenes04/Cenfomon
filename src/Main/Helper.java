package Main;

public class Helper {

    public static  int shortrandomize() {return (int) (Math.random()* 3)+1;}
    public static  int mediumrandomize() {return (int) (Math.random()* 7)+1;}

    public static String NaturalezCenfomon (int pId){
        String Naturaleza = "";
        switch (pId){
            case 1:
                Naturaleza = "Serena";
                break;
            case 2:
                Naturaleza = "Audaz";
                break;
            case 3:
                Naturaleza = "Amable";
                break;
            case 4:
                Naturaleza = "Timida";
                break;
            case 5:
                Naturaleza = "Seria";
                break;
            case 6:
                Naturaleza = "Docil";
                break;
            case 7:
                Naturaleza = "Mansa";
                break;
        }return Naturaleza;



    }

}
