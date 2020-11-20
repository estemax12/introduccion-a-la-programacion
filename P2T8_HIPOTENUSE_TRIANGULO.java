import java.util.Scanner; 

public class App
 {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------");
        System.out.println("P2T8_HYPOTENUSE_TRIANGULO");
        System.out.println("---------------------------");

        double CAT1, CAT2, TOT;

        Scanner Keyboard = new Scanner (System.in);

        System.out.println("Imput de cateto 1");
        CAT1 = Keyboard.nextInt();

        System.out.println("Imput de cateto 2"); 
        CAT2 = Keyboard.nextInt();

        TOT = Math.sqrt((CAT1*CAT1)+(CAT2*CAT2));

        System.out.println("The result is "+TOT);

    







    }
}
