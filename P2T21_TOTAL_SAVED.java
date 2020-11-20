//AUTHOR: Cesar Esteban Gaona 
//DATE: 23_10_2020
//DESCRIPTION:Determines the total saved person in N months. Yes a person saves X  anount of money each month 

import java.util.Scanner; 



public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int N_months = f_total_months();
        int sum_total_saved=0;
        double average_total_saved=0;
        for(int i=1;i<=N_months;i++){
            sum_total_saved=sum_total_saved+f_save_money(i);   //it is same to:sum_total_saved=sum total saved+f_save_money(i);
        }
        average_total_saved=sum_total_saved/N_months;
        System.out.println("the total saved money is $"+sum_total_saved+ ", the average is $" +average_total_saved);
        }


    public static void f_menu(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_TOTAL_SAVED-------------------");
        System.out.println("-------------version 1.0 23-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static int f_total_months(){
        //description: this method returns the total months that  user  saved money 
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the total months:");
        int total_months=Keyboard.nextInt();
        while (total_months<2 || total_months>12){
            System.out.println("ERROR the input values should be beetween 2 and 12, input the total months");
            total_months= Keyboard.nextInt();
        }
        return total_months;
    }

    public static int  f_save_money (int i_month){
        //description:this method return saved money in i month
        Scanner Keyboard = new Scanner(System.in);
        int saved_money= Keyboard.nextInt();
        while(saved_money<10000 || saved_money>1000000){
            System.out.println("ERROR the input values should be beetween $10.000 and $1.000.000, input again the saved money ($) by the month "+i_month+" : ");
            saved_money= Keyboard.nextInt();
        }
        return saved_money;
    }





}
