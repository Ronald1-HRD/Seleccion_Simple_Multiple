import java.util.Scanner;

public class Ejemplo3_13 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int C;
        float MP,MO,GF,CP,PV;
        System.out.println("Ingrese la clave del articulo :");
        C=RH.nextInt();
        System.out.println("Ingrese el costo de materia prima :");
        MP= RH.nextFloat();
        if ((C == 3) || (C == 4)){
            MO = MP * 0.75f;
        }else {
            if ((C == 1) || (C == 5)){
                MO = MP * 0.80f;
            }else {
                MO = MP * 0.85f;
            }
        }
        if ((C == 2) || (C == 5)){
            GF = MP * 0.30f;
        }else {
            if ((C == 3) || (C == 6)){
                GF = MP * 0.35f;
            }else {
                GF = MP * 0.28f;
            }
        }
        CP = MP + MO + GF;
        PV = CP + CP * 0.45f;
        System.out.println("El costo de produccion es :"+CP);
        System.out.println("El precio de venta es :"+PV);
    }
}
