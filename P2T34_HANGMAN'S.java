//AUTHOR: Cesar Esteban Gaona_Mauricio_bravo
//DATE: 12_11_2020
//DESCRIPTION:this program act like the game hanged  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        String v_opt_user = f_opt_user();
        String[] v_vector_word = f_fill_vector(v_opt_user);
        char v_letter_user;
        int v_failed_attempts = 0;
        int v_random = (int) Math.random() * 9;
        String v_word_guess = v_vector_word[v_random];
        int v_failed_attemps=0;
        int  v_total_vacios=0; 
                  
        

              
        for(int i=0; i<10; i++){System.out.println("["+i+"]= "+v_vector_word[i]);} 
       
        //System.out.println("\nWORD TO GUESS:["+v_random+"]= "+v_word_guess);
        //for(int i=0; i<v_word_guess.length();i++){
             System.out.print("__");
            v_vector_word_guess[i] = '_';

        do{   

     

                v_vector_word_guess=f_find_letter_to_word(v_letter_user, v_word_guess, v_word_guess);

            }else{
                System.out.println("Error this letter don't exist into the word(failed attemps"+v_failed_attemps+"/4");
                v_failed_attemps+=1;
            }
            for(int i=0; i<v_word_guess.length();i++){
                System.out.print(" "+v_vector_word_guess[i]+" ");
            }
            v_total_vacios=0;
            for(int i=0;i<v_vector_word_guess.length();i++){
     

               }

        while(v_failed_attemps<4 && v_total); 
    if(v_total_vacios==0){

    System.out.println("\n!You are the best in the word¡");
    }

    public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_HANGMAN'S---------------------");
        System.out.println("-------------version 1.0 09-nov-2020------------");
        System.out.println("---------make by Esteban Gaona_Mauricio_bravo---");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static String f_option_user();

    // description:this method return a char (Y/N)
    Scanner Keyboard = new Scaneer(System.in);System.out.println("do you want to enter the words(Y/N)");
    String v_option= Keyboard.nextLine();while(!v_option.equalsignorecase("N")&&!v_option.equals("Y"))
    {
        System.out.println("ERROR your option don't exist, do you want to enter words (Y/N)?");
        v_option = Keyboard.nextLine();
    }return v_option;

    String[] v_vector_words = new String[10];
    Scanner Keyboard = new Scanner(System.in);if(v_opt_user.equals("Y")){
            for(int i=0; i<10; i++){
                v_vector_words[i]}

        }else
    {
        v_vector_words[0] = "Hacienda ";
        v_vector_words[1] = "Domestico";
        v_vector_words[3] = "colombia";
        v_vector_words[4] = "telefono";
        v_vector_words[5] = "Software";
        v_vector_words[6] = "Gamers";
        v_vector_words[7] = "computador";
        v_vector_words[8] = "Lenguaje";
        v_vector_words[9] = "programacion";
    }return v_vector_words;
}}

    public static String f_user_string() {
        // description:this method returns a word with a least 4 letters
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the [" + i + "] word:");
        String v_word = keyboard.nextLine();
        while (v_word.length() < 4) {
            System.out.println("ERROR Your word should be minium 4 caharacters, input again your word");
            v_word = keyboard.nextLine();
        }
        return v_word;

    }

    public static String[]f_fill_vector(String v_option_user)

    public static String[] f_fill_vector_word() {
        // description: this method returns 10 randoms words between 1 an 10 words
        String[] v_vector = new String[10];

        for (int i = 0; i < 10; i++) {
            v_vector_word[i] = f_user_string();
        }
        return v_vector_word;
    }

public static char[] f_find_letter_to_word(char  v_letter, String v_word, char[] v_vector_word_guess ){
    //description: this method return a word that find a letter
    int pos_letter=v_word.indexOf(v_letter);
    while(pos_letter<=v_word.length()-1 && post_letter>-1){
        v_vector_word_guess[pos_letter]=v_letter;
        pos_letter=v_word.indexOf(v_letter, pos_letter+1 
        } 
        return v_vector_word_guess;
    }
}
