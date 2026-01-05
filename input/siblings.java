import java.util.*;
public class siblings {
    public static void main(String args[]){

        Scanner kbrd = new Scanner(System.in);
        
        String name1=kbrd.nextLine();
        String name2=kbrd.nextLine();
        int sibling1=kbrd.nextInt();
        int sibling2=kbrd.nextInt();

        if(sibling1==sibling2){
            System.out.println(name1+" and "+name2+ " are twins");
        }
        else if(sibling1>sibling2){
            System.out.println(name1+" is older than "+name2);
        }
        else{
            System.out.println(name2+" is older than "+name1);
        }
    }
    
}
