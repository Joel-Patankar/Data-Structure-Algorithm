import java.util.*;

public class input_output {
    public static void main(String args[]) {
        // CREATION OF ARRAY
        int marks[] = new int[10];

        // INPUT
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter marks of phy, math, chem :-- ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // OUTPUT
        System.out.println("old marks of phy : " + marks[0]);
        System.out.println("old marks of math : " + marks[1]);
        System.out.println("old marks of chem " + marks[2]);

        // UPDATE
        marks[1] = marks[1] + 10;
        System.out.println("new marks of math : " + marks[1]);

        // WE CAN DO CHINDI CALCULATION
        System.out.println("percentage of our three subect is :- " + (marks[0] + marks[1] + marks[2]) / 3);

        // FIND LENGTH OF ARRAY
        System.out.println("length of our varible is :--> " + marks.length);

    }
}
