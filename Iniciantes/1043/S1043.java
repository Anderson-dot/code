import java.util.Scanner;

public class S1043 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double
            A = scanner.nextDouble(),
            B = scanner.nextDouble(),
            C = scanner.nextDouble();
        scanner.close();

        if (A < (B + C) && B < (A + C) && C < (A + B) ) 
        {
            double perimetro = A + B + C;
            System.out.format("Perimetro = %.1f%n", perimetro);
        } 
        else 
        {
            double area = ((A + B) * C ) / 2;
            System.out.format("Area = %.1f%n", area);
        }
    }
}