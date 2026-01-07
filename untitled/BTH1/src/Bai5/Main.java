package Bai5;
import java.util.*;
interface TinhToan {
    public int tinhTong(int n);
}
public class Main {
    public static void main(String[] args) {
        TinhToan func = (int n) -> {
            if (n <= 0) return 0;
            return n * (n + 1 / 2);
        };
        Scanner sc = new Scanner(System.in);
        int ans = func.tinhTong(sc.nextInt());
        System.out.println("Ket qua bai toan: " + new Integer(ans).toString());
    }
}
