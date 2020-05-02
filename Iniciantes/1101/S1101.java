import java.util.Scanner;

public class S1101 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int M, N, soma = 0;
        
        do 
        {
            M = scanner.nextInt();
            N = scanner.nextInt();

            if (M > 0 && N > 0) 
            {
                if (M > N) 
                {
                    int aux = M;
                    M = N;
                    N = aux;
                }

                for (int i = M; i <= N; i++) 
                {
                    System.out.print(i + " ");
                    soma += i;
                }

                System.out.println("Sum=" + soma);
                soma = 0;
            }

        } while (!(M <= 0 || N <= 0));

        scanner.close();
    }
}