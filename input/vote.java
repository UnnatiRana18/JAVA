

import java.util.*;
public class vote {
    public static void main(String args[]){
        Scanner kbrd = new Scanner(System.in);
        int age= kbrd.nextInt();
    if(age>=18){
        System.out.println("You are a Major, You are eligible to vote");
        }
        else{
            System.out.println("You are a Minor, You are not eligible to vote");
        }
    }
    
}
