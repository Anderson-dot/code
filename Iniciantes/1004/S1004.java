import java.util.Scanner;

public class S1004 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(), 
            y = scanner.nextInt();
        scanner.close();
        
        System.out.println("PROD = " + (x * y));
    }
}