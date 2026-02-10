public class IsNumberEvenOrOdd {
  public static void evenOrOdd() {
    System.out.print("Enter the number to you want to check: ");
    int numChoice = StudentUtilityApp.choice.nextInt();
    String result = numChoice % 2 == 0 ? "EVEN" : "ODD";
    System.out.println(numChoice + " is: " + result);
    System.out.println(StudentUtilityApp.THANKS);
  }
}
