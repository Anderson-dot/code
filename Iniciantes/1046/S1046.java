import java.util.Scanner;

public class S1046 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int inicio = scanner.nextInt(),
            termino = scanner.nextInt();
        scanner.close();

        if (inicio == termino) 
        {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } 
        else
        { 
            if (inicio > termino) 
            {
                termino += 24;
            }
            
            System.out.println("O JOGO DUROU " + (termino - inicio) + " HORA(S)");
        }
    }
}