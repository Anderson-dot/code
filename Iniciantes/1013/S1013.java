import java.util.Scanner;

public class S1013 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(),
            B = scanner.nextInt(),
            C = scanner.nextInt();
        scanner.close();

        int maior = A;

        if (maior < B) 
        {
            maior = B;
        }

        if (maior < C) 
        {
            maior = C;
        }

        System.out.println(maior + " eh o maior");
    }
}