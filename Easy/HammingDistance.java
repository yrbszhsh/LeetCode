/**
 * HammingDistance
 */
public class HammingDistance {

    public int HammingDistance (int x, int y) {
        int xor = x^y;
        int count = 0;
        for (int i = 0; i<32; i++) {
            count += (xor >> i) & 1;
        }
        return count;
        //return Integer.bitCount(x^y);       
    }
    public static void main(String[] args) {
        HammingDistance H = new HammingDistance();
        System.out.println(H.HammingDistance(234324,235555));
    }
}