
public class S1098 {

    public static void main(String[] args) 
    {
        double i, j, value;

        int temp, temp2;

        //não tente entender isso no futuro
        for (i = 0, j = 1, value = 0, temp = 0, temp2 = 0; i < 2; j++)
        {
            if(temp2 == 0)
            {
                System.out.format("I=%.0f J=%.0f%n", i, j);
            }
            else
            {
                System.out.format("I=%.1f J=%.1f%n", i, j);
            }

            temp++;

            if(temp == 3)
            {
                i += 0.2;
                value += 0.2;
                j = value;
                temp = 0;
                temp2++;
            }

            if(temp2 == 5)
            {
                temp2 = 0;
            }
        }
    }
}