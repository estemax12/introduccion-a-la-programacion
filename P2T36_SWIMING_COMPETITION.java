//AUTHOR: Cesar Esteban Gaona
//DATE: 12_11_2020
//DESCRIPTION:the user must specify hoe many copetitors he wants to enter and the times must generated 
// ranmly betweeen 8.0 and 15 sec  per lap

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int v_user_competittors = f_total_competitors();
        int[][] v_matriz_times = f_fill_matriz_times(v_user_competittors);
        int v_player_total_times = 0;
        for (int i = 0; i < v_user_competittors; i++) {
            System.out.print("\nPlayer [" + i + "]");
            v_player_total_times = 0;
            for (int j = 0; j < 6; j++) {
                System.out.print(v_matriz_times[i][j] + "|");
                v_player_total_times += v_matriz_times[i][j];
            }
            System.out.println("|=");
        }

        f_show_winner(v_matriz_times);
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_SWIMMING_COMPETITION-----------");
        System.out.println("-------------version 1.0 13-nov-2020------------");
        System.out.println("---------make by Esteban Gaona_Mauricio_bravo---");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static int f_total_competitors() {
        // description:show inicial menu/information of program
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input the total competitors do you want");
        int v_total_competitors = Keyboard.nextInt();
        while (v_total_competitors < 1) {
            System.out.println(
                    "ERROR  your values must be greater than zero, input again the total competitors do you want: ");
            v_total_competitors = Keyboard.nextInt();
        }
        return v_total_competitors;
    }

    public static int[][] f_fill_matriz_times(int v_user_competittors) {
        // descripion:this method returns the matriz Nx6 with values between 8 and 15
        int[][] v_matriz_times = new int[v_user_competittors][6];
        for (int i = 0; i < v_user_competittors; i++) {
            for (int j = 0; j < 6; j++) {
                v_matriz_times[i][j] = (int) (Math.random() * (15 - 8) + 8);
            }
            return v_matriz_times;
        }
    }

public static void f_show_winner(int [][]v_matriz_times){
    //introduction:this method show who player is winner
    int v_player_winner=0;
    int v_player_total_times=0;
    int v_player_tmp_time=0;
   
    
    for (int i=0; i<v_matriz_times.length; i++){
        int v_player_tmp_times=0;
        for(int j=0; j<6; j++){
            v_player_total_times= v_matriz_times[i][j];
}
if(i==0){
    v_player_winner=i;
    v_player_winner_time= v_player_tmp_times;
}else{
    if(v_player_winner_time>v_player_tmp_times){
        v_player_winner=i;
        v_player_winner_time=v_player_tmp_times;

    }
}
System.out.println("the player winner is ["+v_player_winner+"] with total times= "+v_player_winner_time);
    
}
}
