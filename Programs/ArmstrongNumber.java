public class ArmstrongNumber
{
    public static void main(String[] args) {

        System.out.println("Printing armstrong numbers upto 1000");
        printArmstrong();
    }

    private static void printArmstrong() {
        boolean ans = false;
        for(int i  =1 ; i <= 1000 ; i++)
        {
           ans = checkArmstrong(i);
           if(ans)
           {
               System.out.print(i+" "+", ");
           }

        }
    }

    private static boolean checkArmstrong(int i) {
        int sum = 0;
        int num = i;
        while(i>0)
        {
            int last = i % 10;
            sum +=last*last*last;
            i/=10;
        }
        if(num== sum)
        {
            return true;
        }
        else
            return false;
    }

}