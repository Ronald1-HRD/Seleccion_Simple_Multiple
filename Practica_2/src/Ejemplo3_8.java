import java.util.Scanner;

public class Ejemplo3_8 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int NA;
        float PA,TOT;
        System.out.println("Ingrese el numero de alumnos que realizan el viaje :");
        NA= RH.nextInt();
        if (NA>=100){
            PA=65;
        }else {
            if (NA>=50){
                PA=70;
            }else {
                if (NA>=30){
                    PA=95;
                }else {
                    PA=4000/NA;
                }
            }
        }
        TOT=PA*NA;
        System.out.println("El pago individual es :"+PA);
        System.out.println("El apgo total es :"+TOT);
    }
}
