import java.util.Scanner;

public class funct1{

    public static int   SUM(int a, int b){
        int sum=a+b;
        return sum;

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = SUM(a,b);
        System.out.println("the sum is "+sum);
    }



}