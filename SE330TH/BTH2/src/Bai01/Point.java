package Bai01;
import java.util.*;
import Interface.IO;
public class Point implements IO {
    double x,y;
    public void Input()
    {
        System.out.println("Nhap thong tin cho diem");
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    public void Output()
    {
        System.out.println("Hoanh do: " + x + "Tung do: " + y);
    }
    public double Len(Point a)
    {
        return Math.sqrt((a.x - x) * (a.x - x) + (a.y - y) * (a.y - y));
        //Co the truy cap duoc vi cung package
    }
    //ItejjiIDEA chi co the nhan dien duoc code trong 1 khaong khong gian thoi, khong phai vo dich
    //Khong nen di chuyen du lieu code ra khoi thu muc src. Co the bi loi outside of the directory
}
