
public class S1155 
{
    public static void main(String[] args) 
    {
        double S = 1;

        for (int i = 2; i <= 100; i++)
        {
            S += (1.0 / i);
        }
        
        System.out.format("%.2f%n", S);
    }
}