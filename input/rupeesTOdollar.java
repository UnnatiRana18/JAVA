import java.util.*;
public class rupeesTOdollar {
    public static void main(String args[]){

        Scanner kbrd=new Scanner(System.in);

        int rupees = kbrd.nextInt();
        double unit=kbrd.nextDouble();

        double total_dollars;
        total_dollars=rupees/unit;

        int dollar=(int)total_dollars;
        int cents=(int)((total_dollars-dollar)*100);

        int r= cents%5;
       

        if(r==1){
            cents=cents-1;
        }
        else if(r==2){
            cents=cents-2;
        }
        else if(r==3){
            cents=cents+2;
        }
        else if(r==4){
            cents=cents+1;
        }
        System.out.println(dollar+" Dollars and "+ cents +" Cents");
    }
    
}
