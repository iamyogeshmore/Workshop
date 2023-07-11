package workshop;

import java.util.Arrays;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        int[] arr = {6, 2, 3, 4, 43, 6, 7, 5, 6, 34, 4};
        int[] n = new int[arr.length];
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] != arr[i + 1])
            {
                n[counter] = arr[i];
                counter++;
            }
        }
        n[counter] = arr[arr.length - 1];
        System.out.println("Array without Duplicate Elements: ");
        for (int i = 0; i <= counter; i++)
        {
            System.out.println(n[i]);
        }
    }
}
