import java.util.Scanner;

public class Ejemplo3_3 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int x;
        float PAG;
        float G1=0.85F;
        float G2=0.90F;
        x=RH.nextInt();

        if (x>=1000){
            PAG=(x*G1);
        }
        else {
            PAG =(x*G2);
        }
        System.out.println("El pago total de los dos pagos es :"+PAG);
    }
}
