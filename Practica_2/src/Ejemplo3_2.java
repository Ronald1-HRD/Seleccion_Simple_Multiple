import java.util.Scanner;

public class Ejemplo3_2 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int num;
        String R;
        System.out.println("Introdusca el valor para determinar el signo");
        num= RH.nextInt();
        if (num>0){
            R="Positivo";
        }
        else{
            R="Negativo";
        }
        System.out.println("El numero es :"+R);

    }
}
