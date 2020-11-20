//AUTHOR: Cesar Esteban Gaona 
//DATE: 23_10_2020
//DESCRIPTION: Saves sañlaries of 5 employees using a arrangent (vector) where the salaries are a random value 
// between $ 1,000,000 and $ 2,000,000, use  a fuction to calculate the salary and save  it in the vector 

import java.util.Scanner; 


public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
       
        int[] v_salary = new  int [5];
        // (Math random)() * (v_max v_min))+v_min
        v_salary[0]= (int) (Math.random()* (2000000-1000000)+1000000);
        v_salary[1]= (int) (Math.random()* (2000000-1000000)+1000000);
        v_salary[2]= (int) (Math.random()* (2000000-1000000)+1000000);
        v_salary[3]= (int) (Math.random()* (2000000-1000000)+1000000);
        v_salary[4]= (int) (Math.random()* (2000000-1000000)+1000000);

        System.out.println("[0]: "+v_salary[0]);
        System.out.println("[1]: "+v_salary[1]);
        System.out.println("[2]: "+v_salary[2]);
        System.out.println("[3]: "+v_salary[3]);
        System.out.println("[4]: "+v_salary[4]);
    }



    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_VECTOR_WITH_SALARY-------------");
        System.out.println("-------------version 1.0 30-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
}
