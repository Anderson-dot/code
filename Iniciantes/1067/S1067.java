import java.util.Scanner;

public class S1067 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= numero; i += 2) 
        {
            System.out.println(i);
        }
    }
}