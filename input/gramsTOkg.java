import java.util.*;
public class gramsTOkg {
    public static void main(String args[]){
        Scanner kbrd= new Scanner(System.in);

        System.out.println("enter weigt in grams");

        int weight= kbrd.nextInt();

        int kg;
        int grams;

        kg=weight/1000;
        grams=weight%1000;

        System.out.println(kg+" kilos "+grams+" Grams");


    }
    
}
