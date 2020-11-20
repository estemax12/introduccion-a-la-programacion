//AUTHOR: Cesar Esteban Gaona 
//DATE: 15_10_2020
//DESCRIPTION:this sorftware mate many fuctions that converts 
//kilometers into miles, Miles to KM 
// and another that converts colombian pesos into dollars 

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int user_option();
        while(user_option!=0){

        if(user_option==1){
            f_calculate_miles_to_km();
        }else if (user_option==2){
            f_calculate_km_to_miles();
        }else if (user_option==3){
            f_calculate_USD_to_pesos_col();
        }else{
            f_calculate_pesos_co_to_USD_();
        
        }
        public static void f_menu(){    
        //description:show inicial menu/informationof program 

        System.out.println("---------------------------------")
        System.out.println("---------------------------------")
        System.out.println("-------softConvert---------------")
        System.out.println("------Version-2.0-2020-oct-15----")
        System.out.println("------make-by-Esteban-Gaona------")
        System.out.println("---------------------------------")
    }


      public static void f_option(){
     //Description:this method will return the option that user input 
     Scanner teclado1= new Scanner(System.in);
     System.out.println("input  the option of convert: \n 1- miles  to KM \n 2-  KM to miles");
     System.out.println(" 3- Money USD to pesos  Co \n 4- Money Pesos  CO to USD\ 0- To exit");
     int option = teclado.nextInt();
     while(option<0 || option>4){
        System.out.println("ERROR: this option does  not exist, input the option fo convert: \n1- miles to KM \n 2- KM to miles")
        System.out.println(" 3- Money USD to pesos  Co \n 4- Money Pesos  CO to USD\n 0- To exit");
        option = teclado.nextInt();
     }
     return option;
    }

        public static void f_calculate_miles_to_km(){
        //description: this method calculate  a convertion of miles to km 
        Scanner teclado = new  Scanner(System.in);
        System.out.println("------1--miles_to_km");
        System.out.println("input the total miles");
        double miles teclado.nextDouble();
        double km = miles * 0.621371
        System.out.println("the "+miles + "miles convert to "+km+ " km");
        System.out.println("------------------------------------------");    
    }
        public static void f_calculate_km_to_miles(){
        //description: this method calculate  a convertion of km to miles
        Scanner teclado = new  Scanner(System.in);
        System.out.println("------2--km_to_miles");
        System.out.println("input the total km");
        double miles teclado.nextDouble();
        double miles = km * 0.621371
        System.out.println("the "+km + "km convert to "+miles+ " miles");
        System.out.println("------------------------------------------");
    }
        public static void f_calculate_USD_to_pesos_col(){
        //description: this method calculate  a convertion of USD to colombian pesos 
        Scanner teclado = new  Scanner(System.in);
        System.out.println("------3--USD_to_colombian_pesos");
        System.out.println("input the total USD");
        double miles teclado.nextDouble();
        double pesos = USD * 3840
        System.out.println("the $"+usd + "dollars convert to $"+pesos+ " colombian pesos");
        System.out.println("-------------------------------------------------------------");

    }
        public static void f_calculate_pesos_co_to_USD_(){
        //description: this method calculate  a convertion of colombian pesos to USD
        Scanner teclado = new  Scanner(System.in);
        System.out.println("------4--colombian_pesos_to_USD");
        System.out.println("input the total colombian pesos");
        double miles teclado.nextDouble();
        double pesos = pesos/3840;
        System.out.println("the $"+pesos   + "colombian pesos con vert to $"+usd+ " USD");
        System.out.println("------------------------------------------------------------");
    }
         
    






}
