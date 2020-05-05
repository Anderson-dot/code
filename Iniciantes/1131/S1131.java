import java.util.Scanner;

public class S1131 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int inter = 0, gremio = 0, empates = 0, grenais = 0, repetir;

        do 
        {
            int golsInter = scanner.nextInt(),
                golsGremio = scanner.nextInt();

            if (golsInter != golsGremio) 
            {
                if (golsInter > golsGremio)
                {
                    inter++;
                } 
                else 
                {
                    gremio++;
                }
            } 
            else
            {
                empates++;
            }
            
            do 
            {
                System.out.println("Novo grenal (1-sim 2-nao)");
                repetir = scanner.nextInt();

            } while (repetir != 1 && repetir != 2);

            grenais++;

        } while (repetir != 2);

        scanner.close();
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (!(inter == gremio && empates > 0)) 
        {
            if (inter > gremio)
            {
                System.out.println("Inter venceu mais");
            } 
            else 
            {
                System.out.println("Gremio venceu mais");
            }
        } 
        else
        {
            System.out.println("Nao houve vencedor");
        }
    }
}