import java.util.*;

public class threesiblingsnew {
    public static void main(String args[]) {
        Scanner kbrd = new Scanner(System.in);

        System.out.println("Enter 3 names:");
        String name1 = kbrd.nextLine();
        String name2 = kbrd.nextLine();
        String name3 = kbrd.nextLine();

        System.out.println("Enter their 3 ages:");
        int age1 = kbrd.nextInt();
        int age2 = kbrd.nextInt();
        int age3 = kbrd.nextInt();

        // Using >= to handle siblings of the same age
        if (age1 >= age2 && age1 >= age3) {
            if (age2 >= age3) {
                printResult(name1, name2, name3);
            } else {
                printResult(name1, name3, name2);
            }
        } else if (age2 >= age1 && age2 >= age3) {
            if (age1 >= age3) {
                printResult(name2, name1, name3);
            } else {
                printResult(name2, name3, name1);
            }
        } else {
            // age3 must be the eldest
            if (age1 >= age2) {
                printResult(name3, name1, name2);
            } else {
                printResult(name3, name2, name1);
            }
        }
        kbrd.close();
    }

    // Helper method to keep the code clean
    public static void printResult(String e, String m, String y) {
        System.out.println(e + " is the eldest\n" + m + " is the middle child\n" + y + " is the youngest child");
    }
}