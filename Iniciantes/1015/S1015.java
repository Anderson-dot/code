import java.util.Scanner;

public class S1015 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double
            x1 = scanner.nextDouble(),
            y1 = scanner.nextDouble(),
            x2 = scanner.nextDouble(),
            y2 = scanner.nextDouble();
        scanner.close();

        double result = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        System.out.format("%.4f%n", result);
    }
}