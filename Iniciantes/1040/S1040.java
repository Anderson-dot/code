import java.util.*;

public class S1040 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

        double 
            n1 = (scanner.nextDouble() * 2.0),
            n2 = (scanner.nextDouble() * 3.0),
            n3 = (scanner.nextDouble() * 4.0),
            n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 10.0;
        System.out.format("Media: %.1f%n", Math.floor(media));  

        if (media >= 7) 
        {
            System.out.println("Aluno aprovado.");   
        }
        else if (media < 5) 
        {
            System.out.println("Aluno reprovado.");
        }
        else if (media >= 5 && media <= 6.9)
        {
            System.out.println("Aluno em exame.");
            double nExame = scanner.nextDouble();
            scanner.close();
            System.out.format("Nota do exame: %.1f%n", Math.floor(nExame));

            media = (media + nExame) / 2.0;

            if (media >= 5) 
            {
                System.out.println("Aluno aprovado.");
            }
            else
            {
                System.out.println("Aluno aprovado.");
            }

            System.out.format("Media final: %.1f%n", media);
        }
    }
}