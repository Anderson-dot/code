import java.util.Scanner;

public class S1009 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double 
            salarioFixo = scanner.nextDouble(),
            vendasMes = scanner.nextDouble();
        scanner.close();

        salarioFixo += vendasMes * 0.15;

        System.out.format("TOTAL = R$ %.2f%n", salarioFixo);
    }
}