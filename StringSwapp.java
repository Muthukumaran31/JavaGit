public class StringSwapp
 {
    public static void main(String[] args)
    {
        String a="Muthu";
        String b="Raj";
        System.out.println("Before Swapping " +a+ " & " +b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swapping " +a+ " & "  +b);

    }
    
}
