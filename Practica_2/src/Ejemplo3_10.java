import java.util.Scanner;

public class Ejemplo3_10 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        Scanner RH1=new Scanner(System.in);
        String TI;
        int KM,NPR,NP;
        float CK,CP,TO;
        System.out.println("Ingrese el tipo de autobus");
        TI=RH1.nextLine();
        System.out.println("Ingrese el numero de personas");
        NPR=RH.nextInt();
        System.out.println("Ingrese los kilometros por recorer");
        KM= RH.nextInt();
        if (TI.equals("A")){
            CK = 2.00F;
        }
        else {
            if (TI.equals("B")){
                CK = 2.50F;
            }
            else {
                CK = 3.00f;
            }
        }
        if (NPR<20){
            NP = 20;
        }
        else {
            NP = NPR;
        }
        TO = NP * CK * KM;
        CP = TO / NPR;
        System.out.println("La persona pagara :"+CP);
        System.out.println("El costo del viaje es :"+TO);
    }
}
