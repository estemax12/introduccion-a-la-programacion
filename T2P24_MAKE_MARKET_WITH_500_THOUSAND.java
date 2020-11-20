//AUTHOR: Cesar Esteban Gaona 
//DATE: 29_10_2020
//DESCRIPTION:an algorithm that captures the price of  each product
import java.util.Scanner;

import jdk.jfr.Description; 

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        Scanner Keyboard= new Scanner(System.in);
        int v_bill_market=0, v_tmp_producto, v_total_product=0;
        do{
           System.out.println("Please, pass the product through the billing machine");
           v_tmp_producto=Keyboard.nextInt();
           v_bill_market= v_bill_market+v_tmp_producto;
           v_total_product+1;
           System.out.println("Your invoice is: $"+v_bill_market+ "with "+v_total_product+"products---");
        }while(v_bill_market<=500000);
        if (v_bill_market<=500000){
            v_bill_market=v_bill_market-v_tmp_producto;
            v_total_product=v_total_product-1;
        }
        System.out.println("YOUR FINAL INVOICE IS $"+v_bill_market+"WHIT " +v_total_product+" PRODUCTS----");

        System.out.println("");
    }
    public static void f_introduction(){
        //description:
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_MAKE_MARKET_WITH_500_THOUSAND--");
        System.out.println("-------------version 1.0 23-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    
    }

}
