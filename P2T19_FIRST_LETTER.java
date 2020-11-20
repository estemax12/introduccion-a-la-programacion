//AUTHOR: Cesar Esteban Gaona 
//DATE: 23_10_2020
//DESCRIPTION:create method that returns the fisrt letter of a word entered as a parameter 

import java.util.Scanner; 



public class App {
    public static void main(String[] args) throws Exception {
        Scanner Keyboard = new Scanner (System.in);
        f_menu();
        System.out.println("Input a word:");
        String word = Keyboard.nextLine();
        while(word.length()<5){
            System.out.println("ERROR: your word should have a least five (5) letters, input again you word: ");
            word= Keyboard.nextLine();
          
        }
        f_first_letter(word);
        f_final_letter(word);
        f_replace_letter(word, "@");
        f_replace_letter(word, "#");   
    }


    public static void f_menu(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_first_letter-----------------");
        System.out.println("-------------version 1.0 23-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    
    }


    public static void f_first_letter(String word){

        String first_letter = word.substring(0,1);
        System.out.println("the first letter is "+first_letter);
    }

    public static void f_final_letter(String word){
        String final_letter= word.substring(word.length()-1);
        System.out.println("the final letter is "+final_letter);
        }    

        public static void f_replace_letter (String word, String letter){
            String new_word= word.replace("a", "@");
            System.out.println("old word is: "+word+" new word is " +new_word);

     }

    }

