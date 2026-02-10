public class WeekdayDisplay {
  public static void displayWeekday() {
    int attempts = 1;
    do {
      System.out.print("Enter the current number day of the week: ");
      int weekdayNumber = StudentUtilityApp.choice.nextInt();
//      Switch statement to determine the week day
      switch (weekdayNumber) {
        case 1:
          System.out.println("MONDAY");
          break;
        case 2:
          System.out.println("TUESDAY");
          break;
        case 3:
          System.out.println("WEDNESDAY");
          break;
        case 4:
          System.out.println("THURSDAY");
          break;
        case 5:
          System.out.println("FRIDAY");
          break;
        case 6:
          System.out.println("SATURDAY");
          break;
        case 7:
          System.out.println("SUNDAY");
          break;
        default:
          System.out.println("Invalid day");
      };
//      Enables the user to attempt the task more than once in case an invalid day is inputted
      if (weekdayNumber < 1 || weekdayNumber > 7) {
        System.out.println("Try again");
        attempts++;
        if (attempts == 4) {
          System.out.println("Too many retries!!!");
        }
      } else {
        break;  // End do-while loop when a valid day is entered before the max number of retries is reached
      }
    } while (attempts <= 3);  // End of do-while loop
    System.out.println(StudentUtilityApp.THANKS);
  }
}
