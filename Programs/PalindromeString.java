public class PalindromeString
{
    public static void main(String[] args) {
        System.out.println("Checking the palindrome String");
        String s = "nitina";
        boolean palindrome = checkPalindrome(s);
        if(palindrome)
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a palindrome");
    }

    private static boolean checkPalindrome(String s) {
        boolean isPalindrome = true;
        int first = 0 ;
        int last = s.length() -1;

        while(first<last)
        {
            if(s.charAt(first) != s.charAt(last))
            {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }
       return isPalindrome;
    }

}
