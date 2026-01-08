package Bai8;
import java.util.*;
interface IPalidrome {
    public boolean isPalindrome(int n);
}
public class Main {
    IPalidrome palidrome = (int a) -> {
        String s = new Integer(a).toString();
        String s1 = "";
        for (int i = s.length()-1; i >= 0; --i) {
            s1 += s.charAt(i);
        }
        return s1.equals(s);
    };
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palidrome.isPalindrome(n));
    }


}
