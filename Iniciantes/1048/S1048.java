import java.util.Scanner;

public class S1048 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double 
            salario = scanner.nextDouble(),
            reajuste;
        scanner.close();

        String porcentagem;

        if (salario >= 0 && salario <= 400)
        {
            reajuste = salario * 0.15;
            porcentagem = "15 %";
        } 
        else if (salario <= 800)
        {
            reajuste = salario * 0.12;
            porcentagem = "12 %";
        }
        else if (salario <= 1200)
        {
            reajuste = salario * 0.10;
            porcentagem = "10 %";
        }
        else if (salario <= 2000)
        {
            reajuste = salario * 0.07;
            porcentagem = "7 %";
        }
        else
        {
            reajuste = salario * 0.04;
            porcentagem = "4 %";
        }

        salario += reajuste;

        System.out.format("Novo salario: %.2f%n", salario);
        System.out.format("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + porcentagem);
    }
}