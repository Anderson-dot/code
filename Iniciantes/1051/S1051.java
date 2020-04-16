import java.util.Scanner;

public class S1051 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble(), imposto = 0;
        scanner.close();

        if (salario <= 2000)
        {
            System.out.println("Isento");
        }
        else
        {
            if (salario > 4500) 
            {
                imposto += ((salario - 4500) * 0.28);
                salario -= (salario - 4500);
            }

            if (salario > 3000) 
            {
                imposto += ((salario - 3000) * 0.18);
                salario -= (salario - 3000);
            }

            if (salario > 2000) 
            {
                imposto += ((salario - 2000) * 0.08);
                salario -= (salario - 2000);
            }

            System.out.format("R$ %.2f%n", imposto);
        }
    }
}