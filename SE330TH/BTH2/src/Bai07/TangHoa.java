package Bai07;
import java.util.*;
public class TangHoa implements IDichVu {
    ArrayList<double[]> a = new ArrayList<>();
    public double input()
    {
        Scanner sc = new Scanner(System.in);
        a.add(new double[2]);
        System.out.print("Nhap don gia cua dich vu tang hoa: ");
        a.get(a.size() - 1)[0] = sc.nextDouble();
        System.out.print("Nhap so luong hoa muon tang: ");
        a.get(a.size() - 1)[1] = sc.nextDouble();
        return a.get(a.size() - 1)[0] * a.get(a.size() - 1)[1];
    }
    public double tinhTien()
    {
        double ans = 0;
        for (int i = 0; i < a.size() - 1; ++i) ans += a.get(i)[0] * a.get(i)[1];
        return ans;
    }
}
