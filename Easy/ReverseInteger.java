/**
 * ReverseInteger
 */
import java.util.*;
public class ReverseInteger {

    public ReverseInteger () {

    }
    public int reverse(int x) {
        String s = String.valueOf(x);
        String temp;
        if (s.charAt(0) == '-') {
            temp = "-";
            s = s.replace("-","");
            temp += new StringBuilder(s).reverse().toString();
        }
        else {
            temp = new StringBuilder(s).reverse().toString();
        }
        double result = Double.parseDouble(temp);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        int temp = r.reverse(-2147483648);

        System.err.println(temp);
    }
}