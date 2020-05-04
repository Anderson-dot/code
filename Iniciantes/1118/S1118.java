import java.util.Scanner;

public class S1118 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int repetir;
        double nota1 = 0, nota2 = 0;
        boolean validacao1 = false, validacao2 = false;

        do 
        {
            do 
            {
                if (!validacao1) 
                {
                    nota1 = scanner.nextDouble();

                    if (nota1 >= 0 && nota1 <= 10) 
                    {
                        validacao1 = true;
                    }
                    else
                    {
                        System.out.println("nota invalida");
                    }
                }

                if (!validacao2) 
                {
                    nota2 = scanner.nextDouble();

                    if (nota2 >= 0 && nota2 <= 10) 
                    {
                        validacao2 = true;
                    }
                    else
                    {
                        System.out.println("nota invalida");
                    }
                }

            } while (!(validacao1 && validacao2));

            validacao1 = false;
            validacao2 = false;
            System.out.format("media = %.2f%n", ((nota1+nota2)/2));
            
            do 
            {
                System.out.println("novo calculo (1-sim 2-nao)");
                repetir = scanner.nextInt();

            } while (repetir != 1 && repetir != 2);

        } while (repetir != 2);

        scanner.close();
    }
}