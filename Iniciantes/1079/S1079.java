import java.util.Scanner;

public class S1079 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double numero1, numero2, numero3;

        for (int i = 0; i < N; i++) 
        {
            numero1 = (scanner.nextDouble() * 2);
            numero2 = (scanner.nextDouble() * 3);
            numero3 = (scanner.nextDouble() * 5);

            System.out.format("%.1f%n", ((numero1 + numero2 + numero3) / 10));
        }

        scanner.close();
    }
}