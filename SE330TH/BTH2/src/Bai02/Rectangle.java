package Bai02;
import Interface.IShape;
import Interface.IO;

import java.util.Scanner;

public class Rectangle implements IO, IShape {
    double w,h;
    public double chuvi()
    {
        return (w+h) * 2;
    }
    public double dientich()
    {
        return w * h;
    }
    public void Input()
    {
        System.out.println("Nhap chieu dai & chieu rong cho hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        w = sc.nextDouble();
        h = sc.nextDouble();
    }
    public void Output()
    {

    }
}
