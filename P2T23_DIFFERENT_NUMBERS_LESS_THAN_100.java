//AUTHOR: Cesar Esteban Gaona 
//DATE: 29_10_2020
//DESCRIPTION: 

import java.util.Scanner; 


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado= new Scanner(System.in);
        double v_average_numbers=0, v_sum_numbers=0;
        int v_N_numbers=0;
        System.out.println("Input any number:");
        int v_number= teclado.nextInt();
        while(v_number>100){
            v_sum_numbers=v_sum_numbers+v_number;
            v_N_numbers=v_N_numbers+1;
            System.out.println("Input other any number: ");
            v_number= teclado.nextInt();
        }
        if(v_N_numbers!=0){
            v_average_numbers=v_average_numbers/v_N_numbers;
        }
        System.out.println("The sum is "+v_sum_numbers+ ",average "+v_average_numbers+ "Total Numbers are" +v_N_numbers);
}
