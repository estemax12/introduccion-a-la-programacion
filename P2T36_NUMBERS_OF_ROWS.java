//AUTHOR: Cesar Esteban Gaona_Mauricio Bravo
//DATE: 18_11_2020
//DESCRIPTION:

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_user_rows= f_total_rows();
        int v_user_columns= f_total_columns();
        int[][] v_matriz_times = f_fill_matriz_values(v_user_rows, v_user_columns);
        int v_total_N_M = 0;
        for (int i = 0; i < v_user_values; i++) {
            System.out.print("[" + i + "]");
            v_total_N_M = 0;
            for (int j = 0; j < 6; j++) {
                System.out.print(v_matriz_values[i][j]+ "|");
                v_total_N_M+= v_matriz_values[i][j];
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_NUMBERS_OF_ROW----------------");
        System.out.println("-------------version 1.0 18-nov-2020------------");
        System.out.println("---------make by Esteban Gaona_Mauricio_bravo---");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

}

    public static int f_total_rows() {
        // description:show inicial menu/information of program
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the values of rows");
        int v_total_rows = Keyboard.nextInt();
        while (v_total_rows < 1) {
            System.out.println("ERROR  your values must be greater than zero, input again the value of N and M ");
            v_total_N_M = Keyboard.nextInt();
        }
        return v_total_rows;

    }

public static int f_total_columns() {
    // description:show inicial menu/information of program
    Scanner Keyboard = new Scanner(System.in);
    System.out.println("Input the values of rows");
    int v_total_columns = Keyboard.nextInt();
    while (v_total_columns < 1) {
        System.out.println("ERROR  your values must be greater than zero, input again the value of N and M ");
        v_total_columns = Keyboard.nextInt();
    }
    return v_total_columns;


}

    public static int[][] f_fill_matriz_values(int v_user_rows, int v_user_columns) {
        // descripion:this method returns the matriz Nx6 with values between N and M
        int[][] v_matriz_values = new int[v_user_rows][v_user_columns];
        for (int i = 0; i < v_user_rows i++) {
            for (int j = 0; j < v_user_columns; j++) {
                v_matriz_values[i][j] = (int) (Math.random()*(1000)+1);
            }
            return v_matriz_values;
}
