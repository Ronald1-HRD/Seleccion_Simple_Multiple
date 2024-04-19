import java.util.Scanner;

public class Ejemplo3_14 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int NZ,PE;
        float CO;
        System.out.println("Ingrese la zona donde se dirige el paquete :");
        NZ= RH.nextInt();
        System.out.println("Ingrese el peso del paquete en gramos :");
        PE=RH.nextInt();
        if (PE >= 5000){
            System.out.println("NO SE DA EL SERVICIO");

        }else {
            switch (NZ){
                case 1:
                    CO = PE * 11;
                case 2:
                    CO = PE * 10;
                case 3:
                    CO = PE * 12;
                case 4:
                    CO = PE * 24;
                default:
                    System.out.println("NO EXISTE EL NUMERO DE ZONA");
            }
        }
        CO = PE * 27;
        System.out.println("El costo de la entrega es :"+CO);
    }
}
