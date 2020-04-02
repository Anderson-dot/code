import java.util.Scanner;

public class S1011 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        scanner.close();

        double volume = ((4.0/3.0) * 3.14159 * Math.pow(raio, 3));

        System.out.format("VOLUME = %.3f%n", volume);
    }
}