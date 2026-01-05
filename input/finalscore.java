import java.util.*;
public class finalscore {
    public static void main(String args[]){

        Scanner kbrd = new Scanner(System.in);

        System.out.printf("enter 3 marks");
        int marks1=kbrd.nextInt();
        int marks2=kbrd.nextInt();
        int marks3=kbrd.nextInt();

        int[] marks={marks1,marks2,marks3};

        Arrays.sort(marks);
       
        //double res=((marks[2]+marks[1])/2.0);
        //int finalScore = (int) Math.ceil(res);

        int sum = marks[1]+marks[2];

        int finalScore;
        if (sum % 2 == 0) {
            finalScore = sum / 2;
        } else {
            finalScore = (sum / 2) + 1;
        }

        System.out.println(finalScore);

    }
    
}
