import java.util.Scanner;

public class StudentUtilityApp {
  public static void main(String[] args) {
    System.out.println("===== STUDENT UTILITY APP =====");
    System.out.println("1. Add two numbers");
    System.out.println("2. Check if a number is EVEN or ODD");
    System.out.println("3. Print numbers from 1 to N");
    System.out.println("4. Display day of the week");
    System.out.println("5. Exit");
    Scanner choice = new Scanner(System.in);
    System.out.print("Enter your choice of task to be carried out: ");
    int taskChoice = choice.nextInt();

    switch (taskChoice) {
      case 1:
        System.out.println("You chose to add two numbers");
        AddTwoNumbers.addition();
        break;
      default:
        System.out.println("Please enter an integer number between 1 and 5");
    }
  }
}
