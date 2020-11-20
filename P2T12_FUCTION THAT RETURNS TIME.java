//AUTHOR: Cesar Esteban Gaona 
//DATE: 12_10_2020
//DESCRIPTION: this program calculate the bike time between 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------------");
        System.out.println("P2T12_bike time make by Esteban Gaona");
        System.out.println("Timesoft Version 1.0");
        System.out.println("-------------------------------------");
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("input yhe distance between two cities (km/H): ");
        double DISTANCE = teclado.nextDouble();
        
        if(DISTANCE<=0){
        System.out.println("ERROR: the distance shold be greater than zero");    
        }else{ 
    }

}
     
        public static void f_bike_time(double distance){
        //DESCRIPTION: this fuction/sub-program calculate the bike time between
        Scanner teclado1 = new Scanner(System.in);    
        
        System.out.println("input the velocity (KM)");
        double VELOCITY = teclado1.nextDouble();

        if(VELOCITY<=0){
            System.out.println("ERROR: the distance shold be greater than zero");
        }else{
        double TIME=distance/VELOCITY;
        System.out.println("the time is "+ TIME+" Hours");   
        }

        }
    }

