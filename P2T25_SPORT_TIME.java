//AUTHOR: Cesar Esteban Gaona 
//DATE: 29_10_2020
//DESCRIPTION:Records time to each lap  of training and determines the best lap 
// the average and the number of laps per training (the laps will be until the athlete gets tired / exhausted)


import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        Scanner Keyboard = new Scanner (System.in);
        double v_total laps=0 v_sum_times=0, v_best_lap=0 v_worst_lap=0;
        do{
               v_time_lap=f_time_lap();
               v_total_lap+=1;
               v_sum_times+= v_time_lap;
               if (v_total_laps==1){
                   v_best_lap= v_time_lap;
                   v_worst_lap= v_time_lap;
               }else{
                   if (v_time_lap<v_best_lap){
                       v_worst_lap= v_time_lap;
                   }
               }
            }while(f_option_continue().equalsIgnorecase("Y"));
            v_average_time= sum times/v_total_laps;
            System.out.println("---------------RESULTS-------------");
            System.out.println("total laps "+v_total_laps);
            System.out.println("sum of times (seg): "+v_sum_times");
            System.out.println("Average times (seg): "v_average_time");
            System.out.println("the best lap (seg): "+v_best_lap");
            System.out.println("the v_worst_lap (seg) : "+v_worst_lap");
        }

               }
        
    public static void f_introduction(){
        //description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_SPORT_TIME-----------------");
        System.out.println("-------------version 1.0 29-oct-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }

    public static String f_option_continue(){
        //description: show inicial  menu/information of program
        Scanner Keyboard = new Scanner (System.in);
        System.out.println("Mr/Mrs Athlete, do you want  continue? (Y/N)");
    String c_opt = Keyboard.nextLine();
    while(!v_opt.equalsIgnorecase("Y") &&  !v_opt.equals("N")){
        System.out.println("ERROR:Your option cannot be processed, Mr/Mrs Athlete, do you want continue? (Y/N)");
        v_opt= Keyboard.nextLine();
    }
    return v_opt;
}

public static double f_time_lap(){
    //description: this method returns a value  between 5 seg and 59 seg
    Scanner Keyboard = new Scanner (System.in);
        System.out.println("Mr/Mrs Athlete, Input the time lap");
        double v_time_lap= Keyboard.nextDouble();
        while (v_time_lap<5 || v_time_lap>59){
            System.out.println("ERROR your value between 5 seg  and 59 seg Mr/Mrs Athlete; Input again the time lap (seg):");
            v_time_lap= Keyboard.nextDouble(); 
        }
  return v_time_lap;
}

}



}
