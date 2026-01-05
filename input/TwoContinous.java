

import java.util.*;
public class TwoContinous {
    public static void main(String args[]){

        Scanner kbrd = new Scanner(System.in);

        int number=kbrd.nextInt();
        int num1;
        int num2;

       if (number > 0) {
                num1 = number / 2;
                num2 = num1 + 1;
            } 
            else {
                num2 = number / 2;
                num1 = num2 - 1;
            }
            System.out.println(num1+" "+  num2);
        }


    }
    

