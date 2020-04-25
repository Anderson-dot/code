import java.util.Scanner;

public class S1094 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(),
            coelhos = 0, ratos = 0, sapos = 0, 
            quantidade;

        String animal;

        for (int i = 0; i < N; i++) 
        {
            quantidade = scanner.nextInt();
            animal = scanner.next();

            switch (animal.toUpperCase()) 
            {
                case "C": coelhos += quantidade;
                    break;
                case "R": ratos += quantidade;
                    break;
                case "S": sapos += quantidade;
                    break;
            }
        }

        scanner.close();
        int quantidadeTotal = (coelhos + ratos + sapos);

        System.out.println("Total: " + quantidadeTotal + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.format("Percentual de coelhos: %.2f", (double) (coelhos * 100)/quantidadeTotal);
        System.out.println(" %");
        System.out.format("Percentual de ratos: %.2f", (double) (ratos * 100)/quantidadeTotal);
        System.out.println(" %");
        System.out.format("Percentual de sapos: %.2f", (double) (sapos * 100)/quantidadeTotal);
        System.out.println(" %");
    }
}