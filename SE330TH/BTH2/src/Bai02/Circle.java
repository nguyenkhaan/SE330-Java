package Bai02;
import java.util.*;
import Interface.IShape;
import Interface.IO;
public class Circle implements IShape,IO {
    double R;
    public void Input() {
        System.out.println("Nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
    }
    public void Output() {

    }
    public double chuvi()
    {
        return R * 2 * Math.PI;
    }
    public double dientich() {
        return R*R*Math.PI;
    }
}
