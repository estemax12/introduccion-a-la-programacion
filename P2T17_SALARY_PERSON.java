//AUTHOR: Cesar Esteban Gaona 
//DATE: 16_10_2020
//DESCRIPTION: this program calculate salary this person 

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        f_salary();
        String option_user= f_continue_yes_no();
        while (option_user.equals("Y")){
            f_salary();
            String option_user= f_continue_yes_no();}
    }
public static void f_menu(){
    //description:show inicial menu/information of program
    System.out.println("------------------------------------------------");
    System.out.println("------------------------------------------------");
    System.out.println("-------------Soft_salary_person-----------------");
    System.out.println("-------------version 1.0 16-oct-2020------------");
    System.out.println("-------------make by Esteban Gaona--------------");
    System.out.println("-------------------------------------------------");
    System.out.println("-------------------------------------------------");

}
 
public static void f_salary(){
    //description:this method calculate the salary of a worker, every hour $20.000 > 80 $20%
    Scanner Keyboard= new Scanner (System.in);
    
    System.out.println("input the total hours than worked by employee:");
    int hours= Keyboard.nextInt();

    while(hours<=0){
        System.out.println("ERROR: the hours should by greater than zero input again the total hours");
        hours= Keyboard.nextInt();
    }
    if (hours>80){
        int extra= hours-80;
        int salary_extra= extra*24000;
        salary= (80*20000)+salary_extra;
        System.out.println("her salary is $"+salary+ "whit extra hours "+extra+ "whit extra salary $"salary_extra); 
    }else{
        salary=(hours*20000);
        System.out.println("her salary is $"+salary);
    
    }

    public static String f_continue_yes_no(){
        //description:this method return yes(Y) / Not (N) by continue or not
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Do you want continue (Y/N):");
        String option = Keyboard.nextLine();
        while(option.equals("Y") && !option.equals("N")){
        System.out.println("ERROR, your option don't exist, Do you want continue (Y/N):");
        option = Keyboard.nextLine();
        }
        return option;






}


}

 
