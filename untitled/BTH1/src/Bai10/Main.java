package Bai10;
import java.util.*;
interface ISumLen {
    int sumLen(String x, String y);
}
interface FirstThreeCharacter {  //default
    //public static final
    //public
    int a = 10;
    String firstThreeCharacter(String x); //default
}
interface LastThreeCharacter {
    String lastThreeCharacter(String x);
}
interface Equals {
    boolean isEquals(String x, String y);
}
interface FindKIndex {
    char findKIndex(String x);
}
interface EqualsNotSensitive {
    boolean isEquals(String x, String y);
}
interface CheckAppear{
    boolean isAppear(String x, String y);
}
interface AppearIndexies{
    ArrayList<Integer> appearIndexies(String x, String y);
}
public class Main {
    ISumLen sumLen = (String x, String y) -> {
        return x.length() + y.length();
    };
    FirstThreeCharacter firstThreeCharacter = (String x) -> {
        if (x.length() < 3) return x;
        return (x.charAt(0) + x.charAt(1) + x.charAt(2) + "");
    };
    LastThreeCharacter lastthreeCharacter = (String x) -> {
        if (x.length() < 3) return x;
        int n = x.length();
        return "" + x.charAt(--n) + x.charAt(--n) + x.charAt(--n);
    };
    Equals isEqual = (String x, String y) -> {
        return x.equals(y);
    };
    EqualsNotSensitive isEqualNotSensitive = (String x, String y) -> {
        x = x.toLowerCase();
        y = y.toLowerCase();
        return x.equals(y);
    };
    CheckAppear checkAppear = (String x, String y) -> {
        if (y.length() > x.length()) return false;
        String slideString = "";
        for (int i = 0; i < y.length(); ++i) slideString += x.charAt(i);
        if (y.equals(slideString)) return true;
        for (int i = 1; i + y.length() - 1 < x.length(); ++i)
        {
            slideString = slideString.substring(1);
            slideString += x.charAt(i + y.length() - 1);
            if (slideString.equals(y)) return true;
        }
        return false;
    };
    AppearIndexies appearIndexs = (String x, String y) -> {
        if (y.length() > x.length()) return new ArrayList<>() {};
        ArrayList<Integer> a = new ArrayList<>();
        String slideString = "";
        for (int i = 0; i < y.length() - 1; ++i) slideString += x.charAt(i);
        if (y.equals(slideString)) a.add(0);
        for (int i = 1; i + y.length() - 1 < x.length(); ++i)
        {
            slideString = slideString.substring(1);
            slideString += x.charAt(i + y.length() - 1);
            if (y.equals(slideString)) a.add(i);
        }
        return a;
    };

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println("tong do dai 2 chuoi la: " + sumLen.sumLen(x , y));
        System.out.println("3 ki tu dau cua chuoi x: " + firstThreeCharacter.firstThreeCharacter(x));
        System.out.println("3 ki tu cuoi cua chuoi x: " + lastthreeCharacter.lastThreeCharacter(x));
        System.out.println("Ket qua so sanh chuoi x va chuoi y: " + isEqual.isEquals(x ,y));
        System.out.println("Ket qua so sanh x va y (Khong phan biet hoa thuong): " + isEqualNotSensitive.isEquals(x ,y));
        System.out.println("Ket qua kiem tra su xuat hien cua y trong x: " + checkAppear.isAppear(x , y));
        ArrayList<Integer> a = appearIndexs.appearIndexies(x , y);
        for(int x1 : a) System.out.printf("%d ", x1);
    }


}
