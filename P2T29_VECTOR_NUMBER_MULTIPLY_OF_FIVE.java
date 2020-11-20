//AUTHOR: Cesar Esteban Gaona 
//DATE: 03_11_2020
//DESCRIPTION:this program automatically create an array (vector) of N positions with  random numbers between 
// 1 and 50 in addition  display only numbers  that are  divisible by 5

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_total_numbers = f_total_numbers();
        int v_vector_number[] = f_fill_vector_numbers(v_total_numbers);
        for (int i = 0; i < v_total_numbers; i++) {
            if (v_vector_number[i] % 5 == 0) {
                System.out.println(v_vector_number[i]);
            }
        }
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("---Soft_VECTOR_NUMBER_MULTIPLY_OF FIVE-----------");
        System.out.println("-------------version 1.0 03-nov-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static int f_total_numbers() {
        // description:this method return the total numbers beetween 1 and 50
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the total numbers do you need");
        int v_total_numbers = Keyboard.nextInt();
        while (v_total_numbers < 1 || v_total_numbers > 100) {
            System.out
                    .println("ERROR the value should be beetween 1 to  50, input again the total numbers do you want;");
            v_total_numbers = Keyboard.nextInt();
        }
        return v_total_numbers;

    }

    public static int[] f_fill_vector_numbers(int N_numbers) {
        // description: this method returns a vector with prices the N numbers
        int[] v_vector_numbers = new int[N_numbers];

        for (int i = 0; i < N_numbers; i++) {
            v_vector_numbers[i] = (int) (Math.random() * (50) + 1);
        }
        return v_vector_numbers;
    }
}