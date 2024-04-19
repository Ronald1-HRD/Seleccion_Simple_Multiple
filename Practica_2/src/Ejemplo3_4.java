import java.util.Scanner;

public class Ejemplo3_4 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float CT,DE,PF;
        float DE1=0.15F;
        float DE2=0.08f;
        System.out.println("Ingrese la cantidad de dinero ");
        CT= RH.nextFloat();
        if (CT>2500){
            DE=(CT*DE1);
        }
        else {
            DE=(CT*DE2);
        }
        PF=CT-DE;
        System.out.println("El precio final es :"+PF);
        System.out.println("El descuento es :"+DE);

    }
}
