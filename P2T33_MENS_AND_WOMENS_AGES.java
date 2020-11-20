//AUTHOR: Cesar Esteban Gaona 
//DATE: 09_11_2020
//DESCRIPTION: create two arrangements (VECTORS) with 100 

public class App {
    public static void main(String[] args) throws Exception {
        f_introduction();
        int[] v_men= f_fill_vector_ages();
        int[] v_women= f_fill_vector_ages();
        int[] v_totales={0,0,0,0,0,0};
        //int v_total_17=0, v_total_women_17=0;
        //int v_total_men_18_59=0, v_total_women_18_59=0;
        //int v_total_60=0, v_total_women_60=0;
        for (int i=0; i<v_men.length;i++){
            if (v_women[i]<18){
                v_totales[1]=v_totales[1]+1;
            }else if (v_women[i]<60){
                v_totales[3]=v_totales[3]+1;
            }else{
                v_totales[5]=v_totales[5]+1;
            }
            v_totales[7]=v_totales[7]+v_women[i];
            }
            if (v_men[i]<18){
                v_totales[0]=v_totales[0]+1;
            }else if (v_men[i]<60){
                v_totales[2]=v_totales[2]+1;
            }else{
                v_totales[4]=v_totales[4]+1;
            }
            v_totales[6]=v_totales[6]+v_men[i];
        }
        System.out.println("men "+v_totales[0]+" and women "+v_totales[1]+"are under the age of 18");
        System.out.println("men "+v_totales[2]+" and women "+v_totales[3]+"are equal to or over 18 but under 60");
        System.out.println("men "+v_totales[4]+" and women "+v_totales[5]+"equal or over 60 years of age");
        System.out.println("average age of women "+v_totales[7]/v_women.length)+"and men: "+(v_totales[6]/v_men.length));
        for(int i=0;i<v_women.length;i++){
            System.out.println("["+i+"]="+v_women[i]);
        }    
        System.out.println("----Ages of men----");
        for(int i=0;i<v_men.length;i++){
            System.out.println("["+i+"]="+v_men[i]);
        }   



        
    

        public static void f_introduction() {
        // description:show inicial menu/information of program
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("-------------Soft_MENS_AND_WOMEN_AGES-----------");
        System.out.println("-------------version 1.0 09-nov-2020------------");
        System.out.println("-------------make by Esteban Gaona--------------");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        }


        public static int[] f_fill_vector_ages(){
            //description:this method returns 100 randoms numbers  between 1 an 100 ages people
            int[] v_vector = new int[10];
            for(int i=0; i<10; i++){
                v_vector[i]=(int) (Math.random()*99)+1;
            }
            return v_vector;
        }





    }
