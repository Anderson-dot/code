import java.util.Scanner;

public class S1019 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int segundos = scanner.nextInt();
        scanner.close();

        int horas = segundos/3600;
        segundos = segundos%3600;

        int minutos = segundos/60;
        segundos = segundos%60;

        System.out.format("%d:%d:%d%n", horas, minutos, segundos);
    }        
}