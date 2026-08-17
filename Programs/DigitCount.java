
public class DigitCount
{
    public static void main(String[] args) {
        int[] numbers = {4,5,4,4,6,8};
        int reps = countDigits(numbers);
        System.out.println("Total count:"+reps);
    }

    private static int countDigits(int[] numbers) {
        int count= 0 ;
        for(int i = 0 ; i< numbers.length ; i++)
        {
            if(numbers[i]==4)
                count++;
        }
        return count;
    }
}
