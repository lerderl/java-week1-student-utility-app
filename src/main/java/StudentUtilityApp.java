import java.util.Scanner;

public class StudentUtilityApp {
  public static String THANKS = "Thank you for using the app";
  public static Scanner choice = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("===== STUDENT UTILITY APP =====");
//    The menu section
    System.out.println("1. Add two numbers");
    System.out.println("2. Check if a number is EVEN or ODD");
    System.out.println("3. Print numbers from 1 to N");
    System.out.println("4. Display day of the week");
    System.out.println("5. Exit");
//    Choice of task to carry out
    System.out.print("Enter your choice of task to be carried out: ");
    int taskChoice = choice.nextInt();

    switch (taskChoice) {
      case 1:
        System.out.println("You chose to add two numbers");
        AddTwoNumbers.addition(); // addition method call
        break;
      case 2:
        System.out.println("You chose to check if a number is EVEN or ODD");
        IsNumberEvenOrOdd.evenOrOdd();  //  method to check is number is even or odd call
        break;
      case 3:
        System.out.println("You chose to print a list of numbers from 1 to any desired integer number you choose, N");
        PrintNumbers.print(); //  print numbers method call
        break;
      case 4:
        System.out.println("You chose to display the day of the week");
        WeekdayDisplay.displayWeekday();  //  weekday display method call
        break;
      case 5:
        System.out.println(THANKS);
        break;
      default:
        System.out.println("Please enter an integer number between 1 and 5");
    }
  }
}
