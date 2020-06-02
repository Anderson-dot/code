import java.util.Scanner;

public class S1017 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt(), 
            velocidade = scanner.nextInt();
        scanner.close();

        System.out.format("%.3f%n", ((tempo * velocidade) / 12.0));
    }
}
