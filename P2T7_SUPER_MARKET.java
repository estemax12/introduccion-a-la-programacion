
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------");
        System.out.println("P2T7_SUPER_MARKET");
        System.out.println("-------------------");
        
        int P1, P2, P3, P4, VALBR; 
        double IVA,  BILL; 
        Scanner Keyboard = new Scanner (System.in);

        System.out.println("imput de 1 product:");
        P1 = Keyboard.nextInt();

        System.out.println("imput de 2 product:");
        P2 = Keyboard.nextInt();

        System.out.println("Input de 3 product:");
        P3 = Keyboard.nextInt();

        System.out.println("Input de 4 product:");
        P4 = Keyboard.nextInt();

        VALBR = P1+P2+P3+P4; 
        IVA = VALBR*0.19;
        BILL = VALBR+IVA;

        System.out.println("--------------------------------------------------");
        System.out.println("The total bill is $"+ BILL+" with IVA  19% $"+IVA);
        System.out.println("-------------------------------------------------");




    }
}
