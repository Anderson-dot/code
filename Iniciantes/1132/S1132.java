import java.util.Scanner;

public class S1132 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(),
            Y = scanner.nextInt(),
            soma = 0;
        scanner.close();

        if (X > Y) 
        {
            int aux = X;
            X = Y;
            Y = aux;
        }

        for (int i = X; i <= Y; i++) 
        {
            if (i%13 != 0) 
            {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}