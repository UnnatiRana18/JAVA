import java.util.*;
public class ThreeContinous {
    public static void main(String args[]){

    Scanner kbrd = new Scanner(System.in);

        int number=kbrd.nextInt();
        int num1;
        int num2;
        int num3;

        if((number%3)!=0){
            System.out.println("Not possible");
        }
        else{
            num2=number/3;
            num1=num2-1;
            num3=num2+1;
        
            System.out.println(num1+" "+num2+" "+num3);
        }

    }
    
}
