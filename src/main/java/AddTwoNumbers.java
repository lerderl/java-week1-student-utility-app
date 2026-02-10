public class AddTwoNumbers {
  public static void addition() {
    System.out.print("Enter your first number: ");
    int num1 = StudentUtilityApp.choice.nextInt();
    System.out.print("Enter your second number: ");
    int num2 = StudentUtilityApp.choice.nextInt();
    int result = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    System.out.println(StudentUtilityApp.THANKS);
  }
}
