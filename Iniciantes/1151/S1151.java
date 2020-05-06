import java.util.Scanner;

public class S1151 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(), 
            anterior = 0,
            atual = 1,
            proximo;
        scanner.close();

        if (N > 1) 
        {
            System.out.print(anterior + " " + atual + " ");
        }
        else
        {
            System.out.println("0");
        }


        for (int i = 2; i < N; i++) 
        {
            proximo = anterior + atual;
            System.out.print(proximo);

            anterior = atual;
            atual = proximo;

            if (i != (N - 1))
            {
                System.out.print(" ");
            }
            else
            {
                System.out.println();
            }
        }
    }
}