import java.util.Scanner;

public class basicsofjava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your salary is $" + salary);
        
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        if (salary > 50000) {
            System.out.println("You have a good salary");
        } else if (salary > 30000) {
            System.out.println("You have an average salary");
        } else {
            System.out.println("You need to work harder");
        }
        
        System.out.print("Enter a number for multiplication table: ");
        int num = sc.nextInt();
        
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        System.out.println("Using while loop (counting from 1 to 5):");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }
        
        System.out.println("Using do-while loop (countdown from 3):");
        int k = 3;
        do {
            System.out.println("Countdown: " + k);
            k--;
        } while (k > 0);
        
        System.out.print("Enter marks to check grade: ");
        int marks = sc.nextInt();
        
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F - Failed");
        }
        
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance");
                break;
            case 'B':
                System.out.println("Good performance");
                break;
            case 'C':
                System.out.println("Average performance");
                break;
            default:
                System.out.println("Need improvement");
        }
        
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Array elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        System.out.println("Even numbers from 2 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        
        boolean isActive = true;
        if (isActive) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Inactive");
        }
        
        int x = 15, y = 10;
        int max = (x > y) ? x : y;
        System.out.println("Maximum of " + x + " and " + y + " is: " + max);
       
    }
}