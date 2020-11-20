//AUTHOR: Cesar Esteban Gaona 
//DATE: 28_10_2020
//DESCRIPTION:Calculates the average salary and highest salary of N employees, where salary - (salary / 30)* working_days

import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standart_ja;


public class App {
    public static void main(String[] args) throws Exception {
    f_introduction();
        double v_salary_average=0, v_salary_total=0, v_salary_higher=0;
        int N_employees=f_N_employees();
        
        for(int i=1; i<=N_employees; i++){
            v_salary_tmp=f_salary_one_employee(i);
            v_salary_total=v_salary_total+v_salary_tmp;
            if(v_salary_higher>v_salary_tmp){
                v_salary_higher=v_salary_tmp;
            }

        }
        v_salary_average=v_salary_total/N_employees;
        System.out.println("the total salary is $"+v_salary_total+", average salary is $"+v_salary_average+" and the higher salary is $"+v_salary_higher);
    }

public static void f_introduction(){
    //description: show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_SALARY_N_EMPLOYEES------------");
        System.out.println("-------------version 1.0 27-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
}

public static int f_N_employees(){
    //description: this method returns the total employees to calculate
    Scanner Keyboard = new Scaneer (System.in);
    System.out.println("Input the total employees: ");
    int N_employees= Keyboard.nextInt();
    while(N_employees<1 || N_employees>100){    
        System.out.println("ERROR:  Your should be  between Input the total employees: ");
        N_employees= keyboard.nextInt();
    }
    return N_employees;
}
    

public static double f_salary_one_employee(int i){
    //description: this method calculate the salary by one employee (SALARY_EMPLOYEE= SALARY/DAYS_WORK)
    Scanner Keyboard = new Scaneer (System.in);
    System.out.println("Input the salary for the employee "+i+" $: ");
    salary= Keyboard.nextInt();
    while(salary<1){
    System.out.println("ERROR: this salary should be greater tha zero, Input again the salary for the employee "+i+" $: ");
    salary= Keyboard.nextInt();
    }

    System.out.println("Input the workdays in thismonth for the employee "+i+" $: ");
     int workdays= Keyboard.nextInt();
     while(workdays<1 || workdays>30){
        System.out.println("ERROR: the workdays should be between 1 and 30, Input again the workdays for the employee "+i+" $: ");
        workdays= Keyboard.nextInt();
    }
      double salary_employee= (salary/30)*workdays;
      return salary_employee;
    }

}
    


