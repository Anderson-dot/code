import java.util.Scanner;

public class S1020 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();
        scanner.close();

        int anos = dias/365;
        dias = dias%365;

        int meses = dias/30;
        dias = dias%30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}