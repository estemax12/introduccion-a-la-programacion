//AUTHOR: Cesar Esteban Gaona 
//DATE: 12_10_2020
//DESCRIPTION:this program calculate the saved  that money that a person save for N months

 import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
     Scanner Keyboard  = new Scanner (System.in);
        f_menu(); 
        System.out.println("Inpput the total month");
        double mo = Keyboard.nextInt();
        double save_money=0;
        if(mo<=0){
        System.out.println("ERROR the months shold be greater than zero");
        }else{
            save_money = f_money (mo);
            System.out.println("the money saved during "+ mo+" Months is "+ save_money);
 
        
        }    


    }

    public static void f_menu(){
        System.out.println("-------------------------------------");
        System.out.println("------softSavemoney------------------");
        System.out.println("-----make_by_Esteban_gaona-----------");
        System.out.println("------Version 1.0 2020-12_10_2020----");

;
    }

public static double f_money(double months){  
//DESCRIPTION: this sub-program/method/function calculate the save money 
Scanner Keyboard1 = new Scanner(System.in);
double tot_save;
System.out.println("input the monthly salary");
double salary = Keyboard1.nextInt();

if(salary<=0){
 System.out.println("Error the salary should  be greater than zero");
tot_save=0;

}else{
  tot_save=(salary*0.6)*months;

}
return tot_save;
}

}