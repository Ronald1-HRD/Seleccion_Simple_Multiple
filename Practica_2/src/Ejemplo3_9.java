import java.util.Scanner;

public class Ejemplo3_9 {
    public static void main(String[] args) {
        Scanner RH= new Scanner(System.in);
        Scanner RH1= new Scanner(System.in);
        int TI;
        String DI,TU;
        float PAG,IMP,TOT;
        System.out.println("ingrese el TIEMPO");
        TI= RH.nextInt();
        System.out.println("Ingrese el tipo de dia");
        DI= RH1.nextLine();
        System.out.println("Ingrese el turno");
        TU= RH1.nextLine();
        if (TI<=5){
            PAG=TI*1;
        }
        else {
            if (TI <= 8) {
                PAG = (float) ((TI - 5) * 0.8 + 5.0);
            }
            else {
                if (TI<=10){
                    PAG = (float) ((TI - 8) * 0.7 + 7.4);
                }
                else {
                    PAG = (float) ((TI - 10) * 0.5 + 8.8);
                }
            }

        }
        if (DI.equals("DOM")){
            IMP = (float) (PAG * 0.05);
        }
        else {
            if (TU.equals("M")){
                IMP = (float) (PAG * 0.15);
            }
            else{
                IMP = (float) (PAG * 0.10);
            }
        }
        TOT = PAG + IMP;
        System.out.println("El pago es :"+PAG);
        System.out.println("El impuesto es :"+IMP);
        System.out.println("El pago total es :"+TOT);
    }

}
