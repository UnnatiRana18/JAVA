import java.util.*;
public class TypeOfTriangle {
    
    
    public static void main(String args[]){

    Scanner kbrd = new Scanner(System.in);

    int a=kbrd.nextInt();
    int b=kbrd.nextInt();
    int c=kbrd.nextInt();

    int[] lenghts={a,b,c};

    if(a == b && b == c){
        System.out.println("Equilateral: 3 equal sides");
    }
    else if(a==b || a==c || b==c){
        System.out.println("Isosceles: 2 equal sides");
    }
    else{
        System.out.println("scalene");
    }
}
}
