//AUTHOR: Cesar Esteban Gaona 
//DATE: 05_11_2020
//DESCRIPTION:Askthe user enter a word  of a least 6 characters by Keyboard, the software must convert that 
//word into a string  array  and then display each letter with its respective ASCII code  on the Screen

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        String v_user_word=f_user_string();
        int v_char_ascii;
        String[] v_vector_word = new String[v_user_word.length()];
        for(int i=0;i<v_user_word.length();i++){
            v_vector_word[i]= v_user_word.substring(i, i+1);
            v_char_ascii= (int) v_vector_word[i].charAt(0);
            System.out.println("v_vector_word["+i+"]="+v_vector_word[i]+"ASCII "+ v_char_ascii);
        }
    }
    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-----------------Soft_WORDS_AND_ASCII-----------");
        System.out.println("-------------version 1.0 5-NOV-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
}
public static String f_user_string(){
    //description: this method return a word with minium 6 characters
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input a word");
    String v_word= keyboard.nextLine();
    while (v_word.length()<6){
        System.out.println("ERROR Your word should be minium 6 caharacters, input again your word");
        v_word= keyboard.nextLine();
    }
    return v_word;
}
}
