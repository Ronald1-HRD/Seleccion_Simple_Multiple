import java.util.Scanner;

public class Ejemplo3_11 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        Scanner RH1=new Scanner(System.in);
        int N;
        String TP,TI;
        float PA,CA,TO,TOT;
        System.out.println("Ingrese el tipo de amburguesa");
        TI=RH1.nextLine();
        System.out.println("Ingrese el numero de amburguesas");
        N= RH.nextInt();
        System.out.println("Ingrese el tipo de pago");
        TP=RH1.nextLine();
        if (TI.equals("Sencilla")){
            PA = 20;
        }
        else {
            if (TI.equals("Doble")){
                PA = 25;
            }
            else {
                PA = 28;
            }
        }
         TO = PA * N;
        if (TP.equals("TAR")){
            CA = TO * 0.05F;
        }
        else{
            CA = 0;
        }
        TOT = TO + CA;
        System.out.println("La amburguesa costo : "+PA);
        System.out.println("El total sin cargo es :"+TO);
        System.out.println("El cargo es :"+CA);
        System.out.println("El total a pagar es :"+TOT);
    }
}
