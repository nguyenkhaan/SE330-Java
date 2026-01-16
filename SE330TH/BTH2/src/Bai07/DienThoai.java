package Bai07;
import java.util.*;
public class DienThoai implements  IDichVu
{
    ArrayList<double[]> a = new ArrayList<>();  //Day phai la KDL tong quat

    public double input()
    {
        a.add(new double[2]);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap don gia cuoc goi: ");
        a.get(a.size() - 1)[0] = sc.nextDouble();
        System.out.print("Nhap so phut goi: ");
        a.get(a.size() - 1)[1] = sc.nextDouble();
        return a.get(a.size() - 1)[0] * a.get(a.size() - 1)[1];
    }
    public double tinhTien()
    {
        double ans = 0;
        for(int i = 0; i < a.size(); ++i)
        {
            ans += a.get(i)[0] * a.get(i)[1];
        }
        if (ans >= 300000) ans = (300000) + (ans - 300000) * 0.8;
        return ans;
    }
}
