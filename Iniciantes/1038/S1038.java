import java.util.Scanner;

public class S1038 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt(),
            quantidade = scanner.nextInt();
        double valor = 0;
        scanner.close();

        switch (codigo) 
        {
            case 1:
                valor = quantidade * 4.00;
                break;
            case 2:
                valor = quantidade * 4.50;
                break;
            case 3:
                valor = quantidade * 5.00;
                break;
            case 4:
                valor = quantidade * 2.00;
                break;
            case 5:
                valor = quantidade * 1.50;
                break;
        }

        System.out.format("Total: R$ %.2f%n", valor);
    }
}