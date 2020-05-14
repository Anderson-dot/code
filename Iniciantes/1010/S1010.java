import java.util.Scanner;

public class S1010 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt(); //cod não usado 
        int valor1 = scanner.nextInt();
        double preco1 = scanner.nextDouble();

        scanner.nextInt(); //cod não usado
        int valor2 = scanner.nextInt();
        double preco2 = scanner.nextDouble(),

        pagar = (valor1 * preco1) + (valor2 * preco2);
        scanner.close();

        System.out.format("VALOR A PAGAR: R$ %.2f%n", pagar);
    }
}
