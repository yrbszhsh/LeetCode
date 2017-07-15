/**
 * NumberComplement
 */
public class NumberComplement {

    public NumberComplement () {
        
    }
    public static int findComplement(int num) {
       /* String a = Integer.toBinaryString(num);
        a = a.replace('0', '2').replace('1', '0').replace('2', '1');
        int result = Integer.parseInt(a,2);
        return result; */
        int mask = Integer.highestOneBit(num) - 1;
        num = ~num;
        System.out.println(mask);
        System.out.println(num);
        return num & mask;
        }
    public static void main(String[] args) {
        NumberComplement N = new NumberComplement();
        int r = N.findComplement(1);
        System.out.println(r);
    }
}