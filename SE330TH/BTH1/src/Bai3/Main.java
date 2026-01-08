package Bai3;
import java.util.*;
interface AMuA {
    public int calc(int a);  //khonh duoc phep khai bao method static vu static dung chung, ma moi class implement cair ing
    //vay thi cachung la cai nao ?????
    //Proprtyu -> method, method: non-static
}
class Main {
    public static void main(String[] args) {
        AMuA func = (int a) -> {
            int res = 1;
            for (int  i =0; i < a; ++i) res *= a;
            return res;
        };
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int  i =1; i <= n; ++i)
        {
            ans += func.calc(i);
        }
        System.out.println("Ket qua bai toan la: " + new Integer(ans).toString());
    }
}