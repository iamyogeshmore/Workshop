package workshop;

public class K_array
{
    public static void main(String[] args)
    {
        int [] a = {98,77,69,58,46,28,11,9,6,1};

        int first =0;
        int second =0;
        int third =0;

        for (int num : a)
        {
            if (num > first)
            {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first)
            {
                third = second;
                second = num;
            } else if (num > third && num < second)
            {
                third = num;
            }
        }

        System.out.println("Third largest number: " + third);


    }
}
