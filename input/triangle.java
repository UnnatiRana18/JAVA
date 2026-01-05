import java.util.*;
public class triangle {
    public static void main(String args[]){

    Scanner kbrd = new Scanner(System.in);

    int a=kbrd.nextInt();
    int b=kbrd.nextInt();
    int c=kbrd.nextInt();

    int[] lenghts={a,b,c};

    Arrays.sort(lenghts);

    if(lenghts[0]+lenghts[1]>lenghts[2]){
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
    
    
}
}
