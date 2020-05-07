
public class S1156 
{
    public static void main(String[] args) 
    {
        double S = 0;

        for (int i = 0, j = 1; j < 40; i++, j+=2)
        {
            S += (j / Math.pow(2, i));
        }

        System.out.format("%.2f%n", S);
    }
}