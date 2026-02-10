import java.util.Scanner;

public class AddTwoNumbers {
  public static void addition() {
    Scanner choice = new Scanner(System.in);
    System.out.print("Enter your first number: ");
    int num1 = choice.nextInt();
    System.out.print("Enter your second number: ");
    int num2 = choice.nextInt();
    int result = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
  }
}
