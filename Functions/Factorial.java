import java.util.*;
public class Factorial{

public static int FACT(int n){
if(n==0||n==1){
    return 1;
}
else{
    int fact=1;
    for(int i=2;i<=n;i++){
         fact=fact*i;
    }
    return fact;
}
}

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=FACT(n);
    System.out.println("Factorial of "+n+" is: "+fact);

}
}