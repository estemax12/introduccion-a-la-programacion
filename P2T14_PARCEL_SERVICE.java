//AUTHOR: Cesar Esteban Gaona 
//DATE: 12_10_2020
//DESCRIPTION: this program calculate  the parcel service is based 
//service on the weigthof the package

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("P2T14_PARCEL:SERVICE");
        f_menu();
        int option= f_address();
        double weight= f_weight();
        double price =0;

        if(option=1){
            price= weight=11;

        }else if(option=2){
            price= weight=10;           
         
        }else if(option=3){
            price= weight=12;

        }else if(option=4){
            price= weight=24;

        }else
        price= weight=27;

        System.out.println("the price of your parcel is "+ price);
        
          }
    
     
         
     
           
           public static void f_menu(){
            System.out.println("-------------------------------------");
            System.out.println("------parcel_service-----------------");
            System.out.println("-----make_by_Esteban_gaona-----------");
            System.out.println("------Version 1.0 2020-12_10_2020----");
    
    
           }
    

        public static int f_address(){
         //description:this program return the address 
        Scanner Keyboard= new  Scanner(System.in);
        System.out.println("Input the option address");
        System.out.println("1-North America");
        System.out.println("2-Central America"); 
        System.out.println("3-south America");
        System.out.println("4-Europe");
        System.out.println("5-Asia"); 
        
        int option= Keyboard.nextInt();

        while(option<1 || option>5){
        System.out.println("ERROR your  input the option address DON'T exist, input again:");
        System.out.println("1-North America");
        System.out.println("2-Central America"); 
        System.out.println("3-south America");
        System.out.println("4-Europe");
        System.out.println("5-Asia");
        
        option= Keyboard.nextInt();
        
        }

        return option;

        public static double f_weight(){
        Scanner teclado2 = new Scanner(System.in);
        double weight= teclado2.nextDouble();
        while (weigth<=0){
        System.out.println("input the weight (KG) should be greater than zero- input again the weigth");
        return option;}
    }
        
}


