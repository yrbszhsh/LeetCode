/**
 * AddBinary
 */
import java.util.*;
public class AddBinary {

    public AddBinary () {
        
    }
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0)  {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        int p1 = a.length();
        int p2 = b.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (p1 > 0 || p2 > 0 || carry >0 ) {
            int m = (p1 <= 0? 0 : Character.getNumericValue(a.charAt(p1-1)));
            int n = (p2 <= 0? 0 : Character.getNumericValue(b.charAt(p2-1)));
            int sum = (m + n + carry) % 2;
            carry = (m + n + carry) / 2;
            result.insert(0, Character.forDigit(sum, 10));
            p1 = p1 - 1;
            p2 = p2 - 1;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String a = "111111111";
        String b = "11";
        AddBinary e = new AddBinary();
        String c = e.addBinary(a, b);
        System.out.println(c);
    }
}