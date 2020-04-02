import java.util.Scanner;

public class S1008 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int funcionarios = scanner.nextInt(),
            horasTrabalhadas = scanner.nextInt();

        double salario = scanner.nextDouble();
        scanner.close();

        salario *= horasTrabalhadas;

        System.out.println("NUMBER = " + funcionarios);
        System.out.format("SALARY = U$ %.2f%n", salario);
    }
}