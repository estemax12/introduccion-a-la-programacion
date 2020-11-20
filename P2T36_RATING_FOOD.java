//AUTHOR: Cesar Esteban Gaona
//DATE: 17_11_2020
//DESCRIPTION:the software somulate the rate food  in the cafeteria 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_user_people = f_total_surveyed();
        int [][] v_matriz_survey= f_fill_matriz_survey(v_user_people);
        int v_bad_food=0;
        int v_regular_food=0;
        int v_excellent_food=0;
        int v_total_survey;
        for(int i=0; i<v_user_people; i++){
         for(int j=0; j<5; j++){
             if(v_matriz_survey[i][j]<=3){
                 v_bad_food+=1;
             }else if(v_matriz_survey[i][j]<=6){
                 v_regular_food+=1;
             }else{
                 v_excellent_food+=1;

             }
             v_total_survey+=1;
         }
      
        }  System.out.println("TOTALS");
         System.out.println("Total survey: "+v_total_survey+" (100%)");
         System.out.println("Total bad food:"+v_bad_food+"(+((v_bad_food*100/v_total_survey))));
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_RATING_FOOD-------------------");
        System.out.println("-------------version 1.0 17-nov-2020------------");
        System.out.println("---------make by Esteban Gaona_Mauricio_bravo---");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static int f_total_surveyed() {
        // description:this method return total people than surveyed
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("How many people do you want");
        int v_total_people = Keyboard.nextInt();
        while (v_total_people < 1 || v_total_people_people)
            ;
    }

    public static int[][] f_fill_matriz_survey(int v_user_people) {
        // description: this method returns the matriz Nx5 with values beetween 1 to 10
        int[][] v_matriz_survey = new int[v_user_people][5];
        for (int i = 0; i < v_user_people; i++) {
            for (int j = 0; j < 5; j++) {
                v_matriz_survey[i][j] = (int) (Math.random() * 9) + 1;
            }
            return v_matriz_survey;
        }
    }

    public static void f_show_matriz_value(int[][] v_matriz_survey) {
        // Description:this method to show the values matriz
        for (int i = 0; i < v_matriz_survey.length; i++) {
            System.out.println("\n [" + i + "]: ");

        }
    }

}
