import java.util.Scanner;

public class S1080 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int numero, maior = 0, posicao = 1;

        for (int i = 1; i <= 100; i++) 
        {
            numero = scanner.nextInt();

            if (numero > maior)
            {
                maior = numero;
                posicao = i;
            }
        }

        scanner.close();
        System.out.println(maior);
        System.out.println(posicao);
    }
}