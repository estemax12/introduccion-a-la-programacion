//AUTHOR: Cesar Esteban Gaona 
//DATE: 03_11_2020
//DESCRIPTION:Generates the age randomly for N people and save them in a vector 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_N_products = f_total_products();
        double v_IVA = 0, v_total_bill = 0, v_average_price = 0;
        int v_vector_products[] = f_fill_vector_products(v_N_products);
        for (int i = 0; i < v_N_products; i++) {
            if (v_vector_products[i] > 10000) {
                v_IVA = v_IVA + (v_vector_products[i] * 0.19);
            }
            v_total_bill += v_vector_products[i];
        }
        v_average_price = (v_total_bill + v_IVA) / v_N_products;
        System.out.println("Gross value: $" + v_total_bill);
        System.out.println("tax (19%): $" + v_IVA);
        System.out.println("Total bill $" + v_total_bill + v_IVA);
        System.out.println("Average bill $" + v_average_price);
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_VECTor_WITH_N_PRODUCTS---------");
        System.out.println("-------------version 1.0 03-NOV-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static int f_total_products() {
        // description:this method return the total products beetween 1 and 10000
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the total products do you need");
        int v_total_products = Keyboard.nextInt();
        while (v_total_products < 1 || v_total_products > 10000) {
            System.out.println(
                    "ERROR the value should be beetween 1 to  10000, input again the total products do you want;");
            v_total_products = Keyboard.nextInt();
        }
        return v_total_products;
    }

    public static int[] f_fill_vector_products(int N_products) {
        // description: this method returns a vector with prices the N products
        int[] v_vector = new int[N_products];

        for (int i = 0; i < n_products; i++) {
            v_vector_age[i] = (int) (Math.random() * (98000)) + 1000;
        }
        return v_vector_products;
    }
}
