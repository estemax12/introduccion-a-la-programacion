//AUTHOR: Esteban Gaona
//DATE: 6_Octubre_2020
//DESCRIPTION: This program show the age person
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------");
        System.out.println("P2T9_AGE_PERSON"   );
        System.out.println("----------------- ");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Input your year birth");

        int YEAR = teclado.nextInt();
        if (YEAR> = 2020) {
        System.err.println("ERR: this year can't process, you should input year less than 2020");

        }else{
        
            int AGE = 2020-YEAR;
        if (AGE>=18) {;

        System.out.println("she/he is a adult");
        }else{

        System.out.println(" she/he is a kid/girl");    

    }
}
