import java.util.Scanner;

public class S1160 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(),
            PA, PB;
        
        double G1, G2;

        for (int i = 0; i < T; i++) 
        {
            PA = scanner.nextInt();
            PB = scanner.nextInt();
            G1 = scanner.nextDouble();
            G2 = scanner.nextDouble();

            int anos = 0;

            while (PA <= PB && anos < 101)
            {
                PA += (int) ((PA * G1)/100);
                PB += (int) ((PB * G2)/100);

                anos++;
            }

            if (anos > 100)
            {
                System.out.println("Mais de 1 seculo.");
            }
            else
            {
                System.out.println(anos + " anos.");
            }

            anos = 0;
        }

        scanner.close();
    }
}