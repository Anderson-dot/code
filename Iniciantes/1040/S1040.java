import java.util.Scanner;

public class S1040 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double 
            n1 = (scanner.nextDouble() * 2) / 10,
            n2 = (scanner.nextDouble() * 3) / 10,
            n3 = (scanner.nextDouble() * 4) / 10,
            n4 = scanner.nextDouble() / 10,
            media = n1 + n2 + n3 + n4;

        if (media * 10 - Math.floor(media * 10) > 0.5001) //da 5% aekkKKkk
        {
            media = Math.ceil(media * 10) / 10;
        }
        else 
        {
            media = Math.floor(media * 10) / 10;
        }

        System.out.format("Media: %.1f%n", media);

        if (media < 5.0) 
        {
            System.out.println("Aluno reprovado.");
        }

        if (media >= 7.0) 
        {
            System.out.println("Aluno aprovado.");
        }
        else if (media >= 5.0) 
        {
            System.out.println("Aluno em exame.");
            double nExame = scanner.nextDouble();
            scanner.close();

            System.out.format("Nota do exame: %.1f%n", nExame);
            media = (media + nExame) / 2;

            if (media >= 5) 
            {
                System.out.println("Aluno aprovado.");
            }
            else 
            {
                System.out.println("Aluno reprovado.");
            }

            System.out.format("Media final: %.1f%n", media);
        }
    }
}