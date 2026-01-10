package Bai02;

import java.util.Scanner;

public class Square extends Rectangle {
    public Square(double a) {
        this.w = a;
        this.h = a;
    }
    public Square() {
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh cho hinh vuong: ");
        //getClass == hoac kiem tra bang A instance of
        this.w = sc.nextDouble();
        this.h = w;
    }
    public double chuvi() {
        return w * 4;
    }
    public double dientich() {
        return w * w;
    }
}
