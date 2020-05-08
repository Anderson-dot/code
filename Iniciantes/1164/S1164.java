import java.util.Scanner;

public class S1164
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X, soma = 0;

        for (int N = scanner.nextInt(); N > 0; N--) 
        {
            X = scanner.nextInt();

            for (int i = 1; i < X; i++) 
            {
                if (X%i == 0)
                {
                    soma += i;
                }
            }

            if (X == soma)
            {
                System.out.println(X + " eh perfeito");
            }
            else
            {
                System.out.println(X + " nao eh perfeito");
            }

            soma = 0;
        }

        scanner.close();
    }
}