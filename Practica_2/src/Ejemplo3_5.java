import java.util.Scanner;

public class Ejemplo3_5 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int A,B,C;
        float M;
        System.out.println("Ingrese la primera cantidad");
        A= RH.nextInt();
        System.out.println("Ingrese la segunda cantidad");
        B= RH.nextInt();
        System.out.println("Ingrese la tercera cantidad");
        C= RH.nextInt();
        if (A>B){
            if (A>C){
                M=A;
            }
            else {
                M=C;
            }
        }
        else {
            if (B>C){
                M=B;
            }
            else{
                M=C;
            }
        }
        System.out.println("El mayor es :"+M);
    }
}
