package Bai03;
import java.util.*;
public class Main {
    public static int[] input()
    {
        Scanner sc = new Scanner(System.in);
        int p,q;
        while (true)
        {
            System.out.println("Nhap tu so mau so cho phan so 1: ");
            p = sc.nextInt();
            q = sc.nextInt();
            if (q == 0) System.out.println("Mau so khong duoc bang 0");
            else break;
        }
        return new int[] {p, q};
    }
    public static void main(String[] args) {
        int[] a = new int[2];
        //Enter the first fraction
        a = input();
        PhanSo ps1 = new PhanSo(a[0], a[1]);
        //Enter the second fraction
        a = input();
        PhanSo ps2 = new PhanSo(a[0], a[1]);
        //Sum
        System.out.println("Tong: " + ps1.add(ps2));
        //Minus
        System.out.println("Hieu: " + ps1.minus(ps2));
        //Multiply
        System.out.println("Nhan: " + ps1.multiply(ps2));
        //Division
        System.out.println("Chia: " + ps1.division(ps2));


    }


}
