import java.util.Scanner;

public class Ejemplo3_15 {
    public static void main(String[] args) {
        Scanner RH = new Scanner(System.in);
        int TT;
        float LA,AC=1,NC;
        System.out.println("que tipo de tarjeta tiene?\ntipo1(1),tipo1(2),tipo1(3),otro tipo(4)");
        TT= RH.nextInt();
        System.out.println("cual es su limite de credito a prosesar?");
        LA= RH.nextFloat();
        switch (TT){
            case 1:
                AC=LA*0.25f;
                break;
            case 2:
                AC=LA*0.35F;
                break;
            case 3:
                AC=LA*0.40f;
                break;
            case 4:
                AC=LA*0.50f;
                break;
            default:
                System.out.println("no existe el tipo de tarjeta que esta solicitando");


        }if(TT>=5){
            System.out.println("no hay nada");

        }else{
            NC=LA+AC;
            System.out.println("Nuevo limite de credito"+AC);
            System.out.println("su nuevo aumento de credito sera : "+NC);}



    }
}
