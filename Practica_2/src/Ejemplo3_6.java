import java.util.Scanner;

public class Ejemplo3_6 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int NP;
        float TOT;
        System.out.println("Ingrese el numero de personas:");
        NP= RH.nextInt();
        if (NP>300){
            TOT=NP*75;
        }else {
            TOT=NP*95;
        }
        System.out.println("Total que se va pagar por el vanquete:"+TOT);
    }
}
