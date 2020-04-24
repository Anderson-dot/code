import java.util.Scanner;

public class S1071 
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

        for (X++; X < Y; X += 2) 
        {
            if (X%2 == 1 || X%2 == -1) 
            {
                soma += X;
            }
            else
            {
                soma += ++X;
            }
        }

        System.out.println(soma);
    }
}