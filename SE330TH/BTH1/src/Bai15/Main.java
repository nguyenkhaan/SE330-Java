package Bai15;
import java.util.*;
interface IsPrime {
    public boolean isPrime(int n);
}
interface MatrixSolving<T> {
    int findMax(T a);
    int findMin(T a);
    ArrayList<Integer> findPrime(T a);
    int Sum(T a);
}
public class Main implements MatrixSolving<ArrayList<ArrayList<Integer>>>{
    public int findMax(ArrayList<ArrayList<Integer>> a) {
        int ans = a.get(0).get(0);
        for(int i = 0; i < a.size(); ++i)
        {
            for (int j = 0; j < a.get(i).size(); ++j) ans = Math.max(ans , a.get(i).get(j));
        }
        return ans;
    }
    public int findMin(ArrayList<ArrayList<Integer>> a) {
        int ans = a.get(0).get(0);
        for(int i = 0; i < a.size(); ++i)
        {
            for (int j = 0; j < a.get(i).size(); ++j) ans = Math.min(ans , a.get(i).get(j));
        }
        return ans;
    }
    public IsPrime isPrime = (int n) -> {
        if (n < 2) return false;
        for (int i = 2; i <= (int)Math.sqrt(n); ++i) if (n % i == 0) return false;
        return true;
    };
    public ArrayList<Integer> findPrime(ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.size(); ++i) {
            for (int j = 0; j < a.get(i).size(); ++j) if (isPrime.isPrime(a.get(i).get(j))) ans.add(a.get(i).get(j));
        }
        return ans;
    }
    public int Sum(ArrayList<ArrayList<Integer>> a) {
        int ans = 0;
        for (int i = 0; i < a.size(); ++i) {
            for (int j = 0; j < a.get(i).size(); ++j) ans += a.get(i).get(j);
        }
        return ans;
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //Nhap dong vaoc ot
        System.out.println("Nhap gia tri cho ma tran: ");
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i < m; ++i) a.add(new ArrayList<>());
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) a.get(i).add(sc.nextInt());
        }
        int ma = findMax(a);
        int mi = findMin(a);
        ArrayList<Integer> primeList = findPrime(a);
        System.out.println("Danh sach cac so nguyen to la: ");
        System.out.println(Arrays.toString(primeList.toArray()));
        int sum = Sum(a);
    }
}


/**
 * Tong ket bai thuc hanh
 * 1. Mot so ham duoc su dung voi object: clone(), hashCode(), compareTo(), equals(), getClass(), toString()
 * 2. In mang nhanh: Arrays.toString(arr)
 * 3. Interface (Phai duoc implement thi moi su dung duoc Arrow Array, mac dinh cua method interface la public, mac dinh cua thuoc tinh la public static final)
 * 4. Nen thuong xuyen su dung Arrow Function de don gian hoa code
 */