import java.util.Scanner;

public class UserInput
 {
    public static void main(String[] args) 
    {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);
    // Prompt the user to enter a value
    System.out.print("Enter a value: ");
    // Read the user input as a string
    String userInput = scanner.nextLine();
    // You can now process the user input
    System.out.println("You entered: " + userInput);
    // Close the Scanner object (optional, but good practice)
    scanner.close();
  }
}
    

