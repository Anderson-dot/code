import java.util.Scanner;

public class S1165
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(),
            divisores = 0, X;

        for (int i = 0; i < N; i++) 
        {
            X = scanner.nextInt();

            for (int j = 1; j <= X; j++) 
            {
                if (X%j == 0)
                {
                    divisores++;
                }
            }

            if (divisores == 2)
            {
                System.out.println(X + " eh primo");
            }
            else
            {
                System.out.println(X + " nao eh primo");
            }

            divisores = 0;
        }

        scanner.close();
    }
}