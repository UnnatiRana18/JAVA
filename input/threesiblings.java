import java.util.*;

public class threesiblings{
    public static void main(String args[]){

        Scanner kbrd= new Scanner(System.in);

        String name1=kbrd.nextLine();
        String name2=kbrd.nextLine();
        String name3=kbrd.nextLine();

        int age1=kbrd.nextInt();
        int age2=kbrd.nextInt();
        int age3=kbrd.nextInt();

        int[]  ages={age1,age2,age3};

        int eldest = Math.max(age1, Math.max(age2,age3));
        int youngest=Math.min(age1, Math.min(age2,age3));

        System.out.println(eldest);

        if(eldest==age1 && youngest==age2){
            System.out.println(name1 + "is the eldest \n" + name3+"is the middle child\n"+name2+"is  the youngest child");

        }
        else if( eldest== age1 && youngest==age3){
            System.out.println(name1 + "is the eldest \n" + name2+"is the middle child\n"+name3+"is  the youngest child");
        }
        else if(eldest== age2 && youngest==age1){
            System.out.println(name2 + "is the eldest \n" + name3+"is the middle child\n"+name1+"is  the youngest child");
        }
        else if(eldest== age2 && youngest==age3){
                        System.out.println(name3 + "is the eldest \n" + name1+"is the middle child\n"+name3+"is  the youngest child");
        }

        else if(eldest== age3&& youngest==age1){
            System.out.println(name3 + " is the eldest \n" + name2+"is the middle child\n"+name1+"is  the youngest child");
        }
        else if(eldest== age3 && youngest==age2){
                        System.out.println(name3 + " is the eldest \n" + name1+" is the middle child\n"+name2+"is  the youngest child");
        }
        

    }
}