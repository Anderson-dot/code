import java.util.Scanner;

public class S1065 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;

        for (int i = 0; i < 5; i++) 
        {
            if (scanner.nextInt() % 2 == 0) 
            {
                pares++;
            }
        }

        scanner.close();
        System.out.println(pares + " valores pares");
    }
}