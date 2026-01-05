import java.util.*;
public class finalscore4 {
    public static void main(String args[]){

        Scanner kbrd = new Scanner(System.in);

        int marks1=kbrd.nextInt();
        int marks2=kbrd.nextInt();
        int marks3=kbrd.nextInt();
        int marks4=kbrd.nextInt();

        int[] marks={marks1,marks2,marks3,marks4};

        Arrays.sort(marks);

        int sum = marks[1] + marks[2] + marks[3];
    int finalScore = sum / 3;

    if (sum % 3 == 2) {
        finalScore++;
    }

System.out.println(finalScore);

}
}
