import java.util.Scanner;

public class DigitSum
{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        System.out.println("The sum:"+calculateSum(num));
    }

    private static int calculateSum(int num) {
        int sum = 0 ;
        while(num>0)
        {
            sum +=num%10;
            num/=10;
        }
        return  sum;
    }
}
