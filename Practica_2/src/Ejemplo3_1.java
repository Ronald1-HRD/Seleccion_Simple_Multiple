import java.util.Scanner;

public class Ejemplo3_1 {
    public static void main(String[] args) {
        Scanner RH =new Scanner(System.in);
        int A,B,M;
        System.out.println("Introdusca el primer valor A :");
        A= RH.nextInt();
        System.out.println("Introdusca el segundo valor B :");
        B= RH.nextInt();
        if (A>B){
            M=A;
        }
        else{
            M=B;
        }
        System.out.println("El resultado del comparacion es :"+M);

    }
}
