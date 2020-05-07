import java.util.Scanner;

public class S1153 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(),
            resultado = 1;
        scanner.close();

        for (int i = n; i > 0; i--)
        {
            resultado *= i;
        }

        System.out.println(resultado);
    }
}