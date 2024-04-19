import java.util.Scanner;

public class Ejemplo3_7 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        String TI;
        int TA,K;
        float P,GA;
        float P1=0.20F;
        float P2=0.30f;
        System.out.println("Ingrese el tipo de uva :");
        TI=RH.nextLine();
        System.out.println("Ingrese el tamaño de la uva :");
        TA= RH.nextInt();
        System.out.println("Ingrese el precio de la uva :");
        P= RH.nextFloat();
        System.out.println("Ingrese los kilos de produccion :");
        K=RH.nextInt();
        if (TI.equals("A")){
            if (TA==1){
                P=P+P1;
            }else{
                P=P+P2;
            }
        }else {
            if (TA==1){
                P=P-P2;
            }else {
                P=P-P1;
            }
        }
        GA=P*K;
        System.out.println("La ganancia es :"+GA);
    }
}
