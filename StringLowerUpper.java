public class StringLowerUpper {

    public static void main(String[] args) {
        String str = "Welcome To Automation";
        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        System.out.println("Lowercase characters: " + lowercaseCount);
        System.out.println("Uppercase characters: " + uppercaseCount);
    }
}