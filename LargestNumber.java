public class LargestNumber {

    public static int findLargest(int a, int b) {
        // Leverage bitwise AND and short-circuiting for efficiency
        return a + ((b - a) & ~(-(b - a)));  // Explanation below
    }

    public static void main(String[] args) {
        int num1, num2;

        System.out.print("Enter two numbers: ");
        num1 = Integer.parseInt(System.console().readLine());
        num2 = Integer.parseInt(System.console().readLine());

        int largest = findLargest(num1, num2);

        System.out.println("The largest number is: " + largest);
    }
}