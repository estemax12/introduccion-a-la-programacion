//AUTHOR: Cesar Esteban Gaona 
//DATE: 23_10_2020
//DESCRIPTION:calculates  the average  height of  a group of N children  and generated the average  


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        f_menu(); 
        int user_tot_children = f_total_children();
        double sum_height=0, average_height;
        for(int i=1; i<user_tot_children; i+=1){
            System.out.println("height by child number: "+i);
            sum_height+=f_height_child();
        }
        average_height=sum_height/user_tot_children;
        System.out.println("the average by total children "+user_tot_children+" is "+average_height);
    }

public static void f_menu(){
    //description:show inicial menu/information of program
    System.out.println("------------------------------------------------");
    System.out.println("------------------------------------------------");
    System.out.println("-------------Soft_AVERAGE_HEIGHT-----------------");
    System.out.println("-------------version 1.0 23-oct-2020------------");
    System.out.println("-------------make by Esteban Gaona--------------");
    System.out.println("-------------------------------------------------");
    System.out.println("-------------------------------------------------");
}

public static void  f_total_children(){
   //description: this method the total children than user input by Keyboard
   Scanner Keyboard = new Scanner(System.in);
   System.out.println("Input the total children:");
   int total_children = Keyboard.nextInt();
   while(total_children<=0){
       System.out.println("ERROR the total children shuld be greater  than zero, input againthe total children");
       total_children = Keyboard.nextInt();
   }
   return total_children;

}

public static void  f_height_child(){
    //description: this method will return the height by child  than user input by Keyboard 
    Scanner Keyboard = new Scanner(System.in);
    System.out.println("Input the height child");
    double height_child = Keyboard.nextDouble();
    while (height_child<=0.30 || height_child>2){
    System.out.println("ERROR the height should be between 0.30 and 2 meters, input againthe total children:");
    height_child = Keyboard.nextDouble();
    }
    return height_child;
}

}

