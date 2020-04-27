import java.util.Scanner;

public class S1117 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double 
            nota1 = 0, 
            nota2 = 0, 
            media;

        boolean 
            validacao1 = false, 
            validacao2 = false; 

        do
        {
            if (!validacao1)
            {
                nota1 = scanner.nextDouble();

                if ( nota1 < 0 || nota1 > 10)
                { 
                    System.out.println("nota invalida");
                }
                else
                {
                    validacao1 = true;
                }
            } 

            if (!validacao2)
            {
                nota2 = scanner.nextDouble();

                if ( nota2 < 0 || nota2 > 10)
                { 
                    System.out.println("nota invalida");
                }
                else
                {
                    validacao2 = true;
                }
            }

        } while (!(validacao1 && validacao2));

        scanner.close();
        media = (nota1 + nota2) / 2;
        System.out.format("media = %.2f%n", media);
    }
}