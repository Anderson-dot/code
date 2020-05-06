import java.util.Scanner;

public class S1150 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(),
            Z, soma = 0;

        do 
        {
            Z = scanner.nextInt();
            
        } while (Z <= X);

        scanner.close();

        int count = 0;

        for (int i = X; soma <= Z; i++, count++) 
        {
            soma += i;
        }

        System.out.println(count);
    }
}