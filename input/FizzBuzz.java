import java.util.*;
public class FizzBuzz {
    
    public static void main(String args[]){

        Scanner kbrd= new Scanner(System.in);

        int n =kbrd.nextInt();
        int iter;
        for(iter=1;iter<=n;iter++){
            if(iter%3==0 && iter%5==0){
                System.out.println("FizzBuzz");
            }
            else if(iter%3==0){
                System.out.println("Fizz");
            }
            else if(iter%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(iter);
            }

        }
    }
}
