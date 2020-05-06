import java.util.Scanner;

public class S1149 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(),
            N, soma = 0;

        do 
        {
            N = scanner.nextInt();
            
        } while (N <= 0);

        scanner.close();

        for (int i = 0; i < N; i++) 
        {
            soma += A + i;
        }

        System.out.println(soma);
    }
}