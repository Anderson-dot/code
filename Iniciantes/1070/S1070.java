import java.util.Scanner;

public class S1070 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        //testando a declaração do for
        for (int numero = scanner.nextInt(), impares = 0; impares < 6; numero += 2)
        {            
            if (numero%2 == 1)
            {
                System.out.println(numero);
                impares++;
            }
            else
            {
                System.out.println(++numero);
                impares++;
            }
        }

        scanner.close();
    }
}