package Bai13;
import java.util.*;
@FunctionalInterface
interface IBinarySearch {
    public boolean binarySearch(ArrayList<Integer> a, int x);
}
public class Main {
    static IBinarySearch binarySearch = (ArrayList<Integer> a , int x) -> {
        boolean ans = true;
        int l = 0, r = a.size() - 1;
        while (l <= r)
        {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) return true;
            else if (a.get(mid) > x) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b=  new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(sc.nextInt());
        int m = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < m; ++i) b.add(rand.nextInt(1, 100));
        System.out.println(Arrays.toString(b.toArray()));//Cu phap in mang ra man hinh
        ArrayList<Integer> c = (ArrayList)a.clone();
//        System.out.println(Arrays.toString(c.toArray()));  //compareTo, equals, toString, clone, getClass, hashCode (6 ham)
        for (int i = 1; i <= 3; ++i)
            c.set(4-i , b.get(b.size() - i));
        System.out.println("Mang c sau khi thay the la: ");
        System.out.println(Arrays.toString(c.toArray()));
        c.sort(null);
        System.out.println("Mang c sau khi sap xep la: ");
        System.out.println(Arrays.toString(c.toArray()));
        //Nhap vao so x, kiem tra xem x co ton tai trong mang c hay khong
        int x = sc.nextInt();
        boolean isFind = binarySearch.binarySearch(c, x);
        System.out.println(isFind);
    }
}
