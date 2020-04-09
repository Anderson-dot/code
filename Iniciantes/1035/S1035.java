import java.util.Scanner;

public class S1035 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(),
            B = scanner.nextInt(),
            C = scanner.nextInt(),
            D = scanner.nextInt();
        scanner.close();
        
        boolean aceito = false;

        if (B > C && D > A)
        {
            if ((C + D) > (A + B))
            {
                if (C > 0 && D > 0) 
                {
                    if (A%2 == 0) 
                    {
                        aceito = true;
                    }
                }
            }
        }

        if (aceito) 
        {
            System.out.println("Valores nao aceitos");
        }
        else
        {
            System.out.println("Valores aceitos");
        }
    }
}