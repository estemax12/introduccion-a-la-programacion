//AUTHOR: Cesar Esteban Gaona 
//DATE: 16_10_2020
//DESCRIPTION:

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option_user= f_option_beverage();
        while (option_user!=0){
            if(option_user==1){ //aromatic
                f_aromatic();
            }else if(option_user==2){ //black coffee
                 f_black_coffee();
            }else if(option_user==3){ //coffe with milk 
                f_coffee_with_milk();
            }else if(option_user==4){ // capuccino
                f_capuccino();
            }else if(option_user==5){ // mochaccino
               f_mochaccino();
        }

           option_user= f_option_beverage();
    }
                
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

    public static int f_option_beverage(){
        //description:this method returns an option of beverage
        Scanner Keyboard= new Scanner (System.in);
        int option =0; 
        do{
            
        System.out.println("--------option's drinks--------------------");
        System.out.println("1 Aromatic,         unit value $1300-------");
        System.out.println("2 black coffe,      unit value $1000-------");
        System.out.println("3, coffe with milk, unit value $1900-------");
        System.out.println("4 cappuccino,       unit value $2500-------");
        System.out.println("5 mochaccino,       unit value $2700-------");
        System.out.println("-------------Input your option-------------");

        option= Keyboard.nextInt();
        }while(option<1 || option>5);
            return option;
    }
        
        
        public static f_money(){
            //description:this method return the money entered in the machine
            Scanner Keyboard= new Scanner (System.in);
            System.out.println("----------------");
            System.out.println("input your money");
            int money= Keyboard.nextInt();
            while(money!=100 && money!=200 && money!=500 && money!=1000 && money!=2000 && money!=5000 ){
                System.out.println("ERROR, your money is unknown, input  other  money:");
                money=Keyboard.nextInt();
            }
            return money;
        }


     public static void f_aromatic(){
         //description: this method process the aromatic beverage
         int price=1000;
         int money_user = f_money();
         while(money_user<price){
             System.out.println("Do you need input $"+(price-money_user)+"Money");
             money_user += f_money();  

         }
         int surplus = money_user-price;
         System.out.println("Your surplus money is $"+surplus+", the aromatic has time finish 30 seg");
        }

        public static void f_black_coffee(){
            //description: this method process the balck coffee beverage
            int price=1000;
            int money_user = f_money();
            while(money_user<price){
                System.out.println("Do you need input $"+(price-money_user)+"Money");
                money_user += f_money();  
   
            }
            int surplus = money_user-price;
            System.out.println("Your surplus money is $"+surplus+", the black coffe has time finish 30 seg");
        }
        public static void f_coffe_with_milk(){
            //description: this method process the coffe_with_milk beverage
            int price=1900;
            int money_user = f_money();
            while(money_user<price){
                System.out.println("Do you need input $"+(price-money_user)+"Money");
                money_user += f_money();  
   
            }
            int surplus = money_user-price;
            System.out.println("Your surplus money is $"+surplus+", the coffe_with_milk  has time finish 30 seg");
        
        }

        public static void f_capuccino(){
            //description: this method process the capuccino beverage
            int price=2500;
            int money_user = f_money();
            while(money_user<price){
                System.out.println("Do you need input $"+(price-money_user)+"Money");
                money_user += f_money();  
   
            }
            int surplus = money_user-price;
            System.out.println("Your surplus money is $"+surplus+", the capuccino  has time finish 60 seg");
        
        }

        public static void f_mochaccino(){
            //description: this method process the mochaccino beverage
            int price=2700;
            int money_user = f_money();
            while(money_user<price){
                System.out.println("Do you need input $"+(price-money_user)+"Money");
                money_user += f_money();  
   
            }
            int surplus = money_user-price;
            System.out.println("Your surplus money is $"+surplus+", the coffe_with_milk  has time finish 70 seg");

        }
    
    
    }
