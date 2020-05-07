import java.util.Scanner;

public class S1154 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double numero, soma = 0;
        int quantidade = 0;

        do 
        {
            numero = scanner.nextDouble();

            if (numero > 0) 
            {
                soma += numero;
                quantidade++;
            }
            
        } while (numero > 0);

        scanner.close();
        System.out.format("%.2f%n", soma/quantidade);
    }
}