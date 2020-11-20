//AUTHOR: Cesar Esteban Gaona
//DATE: 12_11_2020
//DESCRIPTION:store in matrix the number of students (10) with which a subject has with their respective 
// four notes 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        double[][] v_matriz_grades = f_fill_matriz();
        double v_final_grade = 0;
        System.out.println("Students Grades");
        for (int i = 0; i < 10; i++) {
            v_final_grade = v_matriz_grades[i][0] * 0.3 + v_matriz_grades[i][2] * 0. + v_matriz_grades[i][3] * 0.4;
            v_final_grade = Math.round(v_final_grade * 100) / 100;
            System.out.println(v_matriz_grades[i][0] + " | " + v_matriz_grades[i][0] + " | " + v_matriz_grades[i][2]);
        }
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_ESTUDENTS_GRADES---------------");
        System.out.println("-------------version 1.0 12-nov-2020------------");
        System.out.println("---------make by Esteban Gaona_Mauricio_bravo---");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static double[][] f_fill_matriz() {
        // description:this method returns the fill matriz(10x3) whit double number
        // beetween 0.0 5.0
        double[][] v_matriz = new double[10][3];
        for (double i = 0; i < 10; i++) {
            v_matriz[i][0] = Math.random() * 5.1;
            v_matriz[i][1] = Math.random() * 5.1;
            v_matriz[i][2] = Math.random() * 5.1;

        }
        return v_matriz;

    }
}
