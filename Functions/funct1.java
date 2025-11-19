import java.util.Scanner;

public class funct1{

    public static int   SUM(int a, int b){
        int sum=a+b;
        return sum;

    }

    public static int MUL(int a , int b){
        int mul=a*b;
        return mul;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = SUM(a,b);
        System.out.printf("the sum is %d \n",sum);

        int mul=MUL(a,b);
        System.out.printf("the product is %d", mul);
    }



}