import java.util.Arrays;

public class ArrayReverse
{
    public static void main(String[] args)
    {
        int arr[] = {1,5,6,3,8};
        System.out.println("Original Arrays:"+ Arrays.toString(arr));
        printReverse(arr);

    }

    private static void printReverse(int[] arr) {
        int[] rev = new int[arr.length];
        int last = arr.length-1;
        int i =0;
        while(i<=last)
        {
            rev[i] = arr[last];
            rev[last] = arr[i];
            last--;
            i++;
        }

        System.out.println(Arrays.toString(rev));
    }
}
