package Bai02;
import java.util.*;
import Interface.IO;
import Interface.IShape;
public class Triangle implements IO, IShape {
    public double a,b,c;
    public void Input() {
        System.out.println("Nhap thong tin cho hinh tam giac: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
    public void Output() {

    }
    public double chuvi() {
        return a + b + c;
    }
    public double dientich() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
