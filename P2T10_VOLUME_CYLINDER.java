//AUTHOR: Esteban Gaona
//DATE: 2_Octubre_2020
//DESCRIPTION: this program the volume of cylynder
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------");
        System.out.println("P2T10_VOLUME_CYLINDER");
        System.out.println("---------------------");

        Scanner Keyboard = new Scanner (System.in);
        System.out.println("Imput the radio cm");
        double R1 = Keyboard.nextDouble();

        System.out.println("Imput the height cm");
        double H1 = Keyboard.nextDouble();

        if(R1<=0 ||  H1<=0){
        
         System.out.println("ERROR: this radius or height can't less than or equal to zero");

        }else{
        double VOL = 3.141516*(R1*R1)*H1;
        System.out.println("Volumen is"+VOL+"cm3");   
        }
    }
}
