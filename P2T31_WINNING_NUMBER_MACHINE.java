
//AUTHOR: Cesar Esteban Gaona 
//DATE: 05_11_2020
//DESCRIPTION:Automatically generate a vector of 10 random numbers between 1 and 10  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard  = new Scanner(System.in);
        f_introduction();
        int v_vector_numbers[]=f_fill_vector_numbers();
        int v_oportunity=1;
        boolean v_win=false;

        do{
        System.out.println("Oportunity ("+v_opportunity+"/4) Input number between 1 and 10:");
        v_user_number= keyboard.nextInt();
        for(int i=0; i<10;i++){
            if(v_vector_numbers[i]==v_user_number){
                v_win=true;

            }
            v_opportunity=v_opportunity+1;

        }
        v_oportunity=v_oportunity+1;

        }while(v_oportunity<=4 && v_win==false);
        if(v_win==false){
            System.out.println("SORRY you loss 1.000.000 dollars");
        }else{
            System.out.println("Congratulations, you win 1.000.000 dollars");

        }       
    }
    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-----------------Soft_MACHINE_LOTTERY-----------");
        System.out.println("-------------version 1.0 5-NOV-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }
     public static int f_fill_vector_numbers (){
         //description: this method returns 10 randoms numbers between 1 and 10 
         int[] v_vector = new int[10];
         for (int i=0; i<10;i++){
             v_vector[i]= (int) (Math.random()*9)+1;
             System.out.println("["+i+"]= "+v_vector[i]);
         }
         return v_vector;
     }
    }

