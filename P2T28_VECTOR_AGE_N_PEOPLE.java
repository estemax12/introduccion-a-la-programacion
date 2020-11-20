//AUTHOR: Cesar Esteban Gaona 
//DATE: 30_10_2020
//DESCRIPTION:Generates the age  randomly for N people and save them in a vector 

import java.util.Scanner; 

public class App {
import jdk.jfr.Description;
    public static void main(String[] args) throws Exception {
        f_introduction();
        int N_people= f_total_people();
        int [] v_vector_age= f_fill_vector_age_people(N_people);

        int v_total_children=0, v_total_adults=0, v_total_seniors=0;

        for(int i=0; i<N_people;i++){
            if(v_vector_age[i]<18){
                v_total_children+=1;
            }else if (v_vector_age[i]>=18 && v_vector_age[i]<60){
                v:total_adults+=1;
            }else{
                v_total_seniors+=1;
            }
              v_sum_ages=v_sum_ages+v_vector_age[i];
              System.out.println("Age of person["+i+"]:"+v_vector_age[i]);
             }
             double v_average_age= v _sum_ages/N_people;
             System.out.println("TOTALS");
             System.out.println("Total children: "+v_total_children);
             System.out.println("Total Adults: "+v_total_Adults);
             System.out.println("Total seniors: "+v_total_seniors);
             System.out.println("the age average is: "+v_average_age);

            
            }
        
    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_VECTOR_AGE_N_PEOPLE-----------");
        System.out.println("-------------version 1.0 30-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
}


public static int f_total_people(){
    //description:this method return the total person for program
    Scanner Keyboard = new Scanner (System.in);
    System.out.println("Input the total people do you need");
    int v_total_people= Keyboard.nextInt();
    while (v_total_people<1 || v_total_people>1000){
        System.out.println("ERROR the value should be beetween 1 to  1000, input again the total people do you want;");
        v_total_people= Keyboard.nextInt();
    }
    return v_total_people;
}

public static  int[] f_fill_vector_age_people(int N){
    //description: this method return a vector with age for N people 
    int[] v_vector_age= new int[N];
    for (int i=0; i<N; i++){

        v_vector_age[i]= (int) (Math.random()*100)+1;
      }
      return v_vector_age;
} 

}