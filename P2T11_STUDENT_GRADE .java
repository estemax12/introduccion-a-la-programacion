//AUTHOR:Esteban Gaona
//DATE:8_10_2020
//DESCRIPTION: This program calculate the final grade : N1 (20%) + N2 (25%)

import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------------------");
        System.out.println("P2T11 student grades: Esteban Gaona");
        System.out.println("GRADESOFT VERSION 1.0");
        System.out.println("------------------------------------");
            
        Scanner Keyboard = new Scanner (System.in);
        System.out.println("input the 1 grade (20%) - this value should be betweeen 0 and 5);
        float N1 = Keyboard.nextfload();
        
        System.out.println("input the 2 grade (25%) - this value should be betweeen 0 and 5);
        float N2 = Keyboard.nextfload();

        System.out.println("input the 3 grade (25%) - this value should be betweeen 0 and 5);
        float N3 = Keyboard.nextfload();

        System.out.println("input the 4 grade (30%) - this value should be betweeen 0 and 5);
        float N3 = Keyboard.nextfload();

        if(N1<0 || N1>5 ||  N2<0 ||  N2>5 ||  N3<0 ||  N3>5 ||  N4<0 ||   N4>5){

         System.out.println("ERR: the final grade CAN'T  calculate because  one grade was not betwween 0 and 5");

         }else{

         double FINALG - (N1*0,2)+(N2*0,25)+(N3*0.25)+(N4*0.3);
         System.out.println("the final grade is: "+FINALG);   
    }
}
