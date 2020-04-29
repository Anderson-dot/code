import java.util.Scanner;

public class S1133 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(),
            Y = scanner.nextInt();
        scanner.close();

        if (X > Y) 
        {
            int aux = X;
            X = Y;
            Y = aux;
        }

        for (int i = ++X; i < Y; i++) 
        {
            if (i%5 == 2 || i%5 == 3) 
            {
                System.out.println(i);
            }
        }
    }
}