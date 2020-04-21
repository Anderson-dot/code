import java.util.Scanner;

public class S1064 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) 
        {
            double numero = scanner.nextDouble();

            if (numero > 0)
            {
                positivos++;
                soma += numero;
            }
        }

        scanner.close();
        double media = soma / positivos;

        System.out.println(positivos + " valores positivos");
        System.out.format("%.1f%n", media);
    }
}