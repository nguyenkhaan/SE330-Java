package Bai9;
import java.util.*;
interface IPrime {
    public boolean isPrime(int n);
}
public class Main {
    IPrime isPrime =  (int n) -> {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; ++i) if (n % i == 0) return false;
        return true;
    };
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime.isPrime(sc.nextInt()));
    }
}
