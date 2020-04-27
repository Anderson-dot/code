import java.util.Scanner;

public class S1134 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int produto, 
            alcool = 0,
            gasolina = 0,
            diesel = 0;
        
        do 
        {
            produto = scanner.nextInt();

            switch (produto) 
            {
                case 1: alcool++;
                    break;
                case 2: gasolina++;
                    break;
                case 3: diesel++;
                    break;
            }

        } while (produto != 4);
        
        scanner.close();
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}