public class PrintNumbers {
  public static void print() {
    System.out.print("Enter your desired number: ");
    int desiredNumber = StudentUtilityApp.choice.nextInt();
    System.out.println();
    System.out.println("---NUMBER LIST FROM 1 TO " + desiredNumber + "---");
    for (int num = 1; num <= desiredNumber; num++) {
      System.out.println(num);
    }
    System.out.println();
    System.out.println(StudentUtilityApp.THANKS);
  }
}
