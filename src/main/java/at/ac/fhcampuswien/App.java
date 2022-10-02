package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int hexNumber = 0xface;
        int number = 012;
        float floatLength = 80L;
        float floatMath = 44e-1f;
        float floatF =  5.5f;
        double  euler = 8.88e1;
        double doubleExample = 99.9;
        char letter = 'Z';

        // sum
        int sum = hexNumber + number + (int) euler + (int) floatLength + (int) floatMath +(int) floatF +(int) doubleExample + letter;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        num1 = input.nextInt();

        num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = input.nextInt();

        System.out.print("y: ");
        y = input.nextInt();

        // swap
        x = x + y;
        y= x - y;
        x =x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);


    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
         Scanner input = new Scanner(System.in);
         int number1;
         int number2;

         System.out.print("n1: ");
         number1 = input.nextInt();

         System.out.print("n2: ");
         number2 = input.nextInt();

         if(number1 > number2) {
             System.out.println("n1 > n2");
         } else if(number1 < number2) {
             System.out.println("n2 > n1");
         } else {
             System.out.println("n1 == n2");
         }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int revenue;

        System.out.print("Enter annual Revenue: ");
        revenue = input.nextInt();

        if(revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if(revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if(revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if(revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int commission;

        System.out.print("Enter CommissionClass: ");
        commission = input.nextInt();

        switch (commission) {
            case 1 :
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2 :
                System.out.println("Your Commission Rate was set to 0.02" );
                break;
            case 3 :
                System.out.println("Your Commission Rate was set to 0.03" );
                break;
            case 4 :
                System.out.println("Your Commission Rate was set to 0.04" );
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
       Scanner input = new Scanner(System.in);
       int year;

       System.out.print("Year: ");
       year = input.nextInt();

       if((year % 4) == 0) {
           if (year % 100 == 0 && (year % 400) != 0 ) {
               System.out.println("Not a Leapyear");
           } else {
               System.out.println("Leapyear");
           }
       } else {
           System.out.println("Not a Leapyear");
       }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Number: ");
        number = input.nextInt();

        int reversed = 0; // reversed number
        int lastDigit;   // remainder is last the last digit

        while(number > 0){

            lastDigit = number % 10;
            // (*) to add the lastdigit to the end of reversed number
            reversed = (reversed * 10) + lastDigit;

            number = number / 10;

        }
        System.out.println(reversed);


    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}