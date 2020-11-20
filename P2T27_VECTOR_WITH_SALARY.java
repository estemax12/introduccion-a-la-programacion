import jdk.jfr.Description;

//AUTHOR: Cesar Esteban Gaona 
//DATE: 23_10_2020
//DESCRIPTION: a program in JAVA that allows storing the salaries of the employees grouped by shift (8 employees)
//import java.util.Scanner; 


public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        System.out.println("");
        int[] v_salary_day = f_turn_day();
        int[] v_salary_night = f_turn_night();
        int v_total_salary_day=0, v_total_salary_night=0, v_total_salary=0;

        System.out.println("Turn day");
        for (int i=0, i<8;i++){
        v_total_salary_day += v_salary_day[i];
        System.out.println("Employee ["+i+"] $"+v_salary_day[i]");
        }
        System.out.println("Turn night");
        for (int i=0, i<8;i++){
        v_total_salary_day += v_salary_night[i];
        System.out.println("Employee ["+i+"] $"+v_salary_night[i]");
    }
    System.out.println("TOTALS SALARY");
    System.out.println("Total  salary day $"+v_total_salary_day);
    System.out.println("Total  salary day $"+v_total_salary_night);
    System.out.println("Total salary (day+night) $"+ (v_total_salary_day+v_total_salary_night));

}


    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_VECTOR_WITH_SALARY-------------");
        System.out.println("-------------version 2.0 30-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
}


public static int[] f_turn_day(){
    //description: this method returns  a vector with 8 salarys 
    int[] v_salary = new int [8];
    for (int i=0; i<8; i++){
        v_salary[i]= (int) ((Math.random()*8)*29260);
    }
    return v_salary;
}

public static int[] f_turn_night(){   
      //description: this method returns  a vector with 8 salarys more +35%
      int[] v_salary_night= new int [8];
      for (int i=0; i<8; i++){
        v_salary_night[i]= (int) ((Math.random()*8)*38151);
      }
      return v_salary_night;
    }
}