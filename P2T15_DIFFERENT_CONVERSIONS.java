//AUTHOR: Cesar Esteban Gaona 
//DATE: 13_10_2020
//DESCRIPTION:this program  calculate conversions the  grades of temperature 

import java.util.Scanner;     


public class App {
    public static void main(String[] args) throws Exception {
        f_menu();
        int option= f_option_convert();
        if(option==1){
           f_convert_c_f();}
            else if(option==2){
           f_convert_f_c();
            }else if(option==3){
           f_convert_k_c();
            }else{
             f_convert_c_k();  

            }   
               

        

        Scanner Keyboard = new  Scanner (System.in);
         System.out.println("Input the grades to convert");

            }


    public static void f_menu(){
        System.out.println("----------------------------");
        System.out.println("P2T15_DIFFERENT_CONVERSIONS");
        System.out.println("----------------------------");

    }

             
            
    public static int f_option_convert(){
        //DESCRIPTION:this program return the option convert
        Scanner Keyboard = new  Scanner (System.in);
             
             System.out.println("Input the option:");
             System.out.println("1- °C to °F ");
             System.out.println("2- °F to °C ");
             System.out.println("3- °K to °C ");
             System.out.println("4- °C to °K ");

             int option= Keyboard.nextInt();

             while(option<1 || option>4){
   
             System.out.println("ERROR: your input the option address DONT'T exist, input again:");
             System.out.println("1- °C to °F ");
             System.out.println("2- °F to °C ");
             System.out.println("3- °K to °C ");
             System.out.println("4- °C to °K ");

             option= Keyboard.nextInt();
             
             }

             return option;

            }


             public static void f_convert_c_f(){
                 //DESCRIPTION:this program realice convert  from °C to °F
                 Scanner teclado = new Scanner(System.in); 
                System.out.println("-------convert to  °C  to °F--------");
                System.out.println("Input the value of °C");
                double value= teclado.nextDouble();
                double convert= (value*1.8)+32;
                System.out.println(value +"°C is "+convert+ "°F"); 

             }
                
                


                public static void f_convert_f_c(){
                    //DESCRIPTION:this program realice convert  from °C to °F
                    Scanner teclado = new Scanner(System.in); 
                   System.out.println("-------convert to  °F  to °C--------");
                   System.out.println("Input the value of °F");
                   double value= teclado.nextDouble();
                   double convert= (value-32)/1.8;
                   System.out.println(value +"F is "+convert+ "°C");

                }


              
                   public static void f_convert_c_k(){
                    //DESCRIPTION:this program realice convert  from °C to °K
                    Scanner teclado = new Scanner(System.in); 
                   System.out.println("-------convert to  °C  to °K--------");
                   System.out.println("Input the value of °C");
                   double value= teclado.nextDouble();
                   double convert= (value+273.15);
                   System.out.println(value +"°C is "+convert+ "°K");

                   }



                   public static void f_convert_k_c(){
                    //DESCRIPTION:this program realice convert  from °K to °C
                    Scanner teclado = new Scanner(System.in); 
                   System.out.println("-------convert to  °K  to °C--------");
                   System.out.println("Input the value of °K");
                   double value= teclado.nextDouble();
                   double convert= (value-273.15);
                   System.out.println(value +"°K is "+convert+ "°C");





        }
    }
