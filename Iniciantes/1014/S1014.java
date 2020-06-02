import java.util.Scanner;

public class S1014 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(); 
        double y = scanner.nextDouble();
        scanner.close();
        
        System.out.format("%.3f km/l%n", (x/y));
    }
}
