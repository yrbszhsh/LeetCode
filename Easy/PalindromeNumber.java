/**
 * PalindromeNumber
 */
public class PalindromeNumber {

    public PalindromeNumber () {
        
    }
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x%10 == 0)) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return (temp == x || temp/10 == x);
    }
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        boolean x = p.isPalindrome(10);
        System.out.println(x);
    }
}