import java.util.Scanner;

public class S1004 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt(), 
            Y = scanner.nextInt();
        scanner.close();
        
        System.out.println("PROD = " + (X * Y));
    }
}
