import java.util.Scanner;

public class S1114 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String senha;

        do 
        {
            senha = scanner.nextLine();

            if (!senha.equals("2002")) 
            {
                System.out.println("Senha Invalida");
            }

        } while (!senha.equals("2002"));

        scanner.close();
        System.out.println("Acesso Permitido");
    }
}