import java.util.Scanner;

public class S1145 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(),
            Y = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= Y; i++)
	    {
            System.out.print(i);

            if (i%X == 0)
            {
                System.out.println();
            }
            else
            {
                System.out.print(" ");
            }
	    }
    }
} 