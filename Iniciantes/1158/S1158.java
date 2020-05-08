import java.util.Scanner;

public class S1158
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(),
            X, Y, soma = 0;

        for (int i = 0; i < N; i++) 
        {
            X = scanner.nextInt();
            Y = scanner.nextInt();

            if (X%2 == 0)
            {
                X++;
            }

            for (int j = X, count = 0; count < Y; j += 2, count++) 
            {
                soma += j;
            }

            System.out.println(soma);
            soma = 0;
        }

        scanner.close();
    }
}