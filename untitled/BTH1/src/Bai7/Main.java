package Bai7;
import java.util.*;
interface CountDigits {
    public int countDigits(int n);
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountDigits cnt = (int n) -> {
            int ans = 0;
            while (n >= 10) {
                ++ans;
                n /= 10;
            }
            ++ans;
            return ans;
        };
        System.out.println(cnt.countDigits(sc.nextInt()));
    }
}
