package Bai6;
import java.util.*;
interface Divisors {
    public ArrayList<Integer> divisors(int n);
}
class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Divisors divisots = (int a) -> {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i * i <=a; ++i) if (a % i == 0) {
                int u = a / i;
                if (u == i) arr.add(i);
                else {
                    arr.add(u); arr.add(i);
                }
            }
            return arr;
        };
        for(int x :divisots.divisors(n)) System.out.println(x);
    }
}