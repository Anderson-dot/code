import java.util.Scanner;

public class S1036 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double
            A = scanner.nextDouble(),
            B = scanner.nextDouble(),
            C = scanner.nextDouble();
        scanner.close();

        double delta = (Math.pow(B, 2) - (4 * A * C));

        if (delta < 0 || A == 0) 
        {
            System.out.println("Impossivel calcular");
        } 
        else 
        {
            double r1 = ((B * -1) + Math.sqrt(delta)) / (2 * A);
            double r2 = ((B * -1) - Math.sqrt(delta)) / (2 * A);

            System.out.format("R1 = %.5f%n", r1);
            System.out.format("R2 = %.5f%n", r2);
        }
    }
}