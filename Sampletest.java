import java.util.Scanner;

public class Sampletest 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of star =");
        int numRow =scan.nextInt();
        for(int star=1;star<=numRow;star++)
        {
            for(int delta=1;delta<=star;delta++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
        scan.close();
    }

}