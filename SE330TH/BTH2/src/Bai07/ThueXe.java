package Bai07;
import java.util.*;
public class ThueXe implements IDichVu {

    int N = 12;
    int m = 0; //So luogn dich vu hien co
    ArrayList<double[]> a = new ArrayList();
    public double input() {
        Scanner sc = new Scanner(System.in);
        a.add(new double[2]);
        System.out.print("Nhap don gia thu xe");
        a.get(a.size() - 1)[0] = sc.nextDouble();
        System.out.print("Nhap so gio thue xe");
        a.get(a.size() - 1)[1] = sc.nextDouble();
        return a.get(a.size() - 1)[0] * a.get(a.size() - 1)[1] * (a.get(a.size() - 1)[1] >= 6? 0.95 : 1);
    }
    public double tinhTien()
    {
        double ans = 0;
        int hours = 0;
        for (int i = 0; i < N; ++i)
        {
            ans += a.get(i)[0] * a.get(i)[1] * (a.get(i)[1] >= 6? 0.95 : 1);
            hours += a.get(i)[1];
        }
        //Moi phan tu la 1 mang
        if (hours >= 72) ans *= 0.98;
        return ans;
    }


}
