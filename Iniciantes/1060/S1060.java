import java.util.Scanner;

public class S1060 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;

        for (int i = 0; i < 6; i++)
        {
            if (scanner.nextDouble() > 0) 
            {
                positivos++;
            }
        }

        scanner.close();
        System.out.println(positivos + " valores positivos");
    }
}