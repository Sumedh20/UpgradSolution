import java.util.Scanner;

public class AgeGroup
{
    public static void main(String[] args) {
        System.out.println("Enter Ram, Shyam & Ajay ages");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int sh = s.nextInt();
        int aj = s.nextInt();

        printYoungest(r,sh,aj);
    }

    private static void printYoungest(int r, int sh, int aj) {
        if(r<=sh && sh<=aj)
        {
            System.out.println("All belongs to same age group");
        }
        else if(r<=sh && r<=aj){
            System.out.println("Ram is Youngest");

        } else if (sh<=r && sh<=aj) {
            System.out.println("Shyam is youngest");

        }
        else {
            System.out.println("Ajay is youngest");
        }


    }
}
