package Bai06;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Nhap thong tin cho cac be Robot
        int A,B,C;
        System.out.println("Nhap so luong Pedion, Attacker va Carrier: ");
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        System.out.println("Nhap quang duong di chuyen: ");
        double s = sc.nextDouble();
        //Initialize the robots army
        ArrayList<Robot> r = new ArrayList<>();
        for (int i = 0; i < A; i++) r.add(new Pedion());
        for (int i = 0; i < B; ++i) r.add(new Attacker());
        for (int i = 0; i < C; ++i) r.add(new Carrier());
        //Xuat thong tin tat ca robot

        r.sort((Robot a , Robot b) -> {
            return Double.compare(b.getEnergy(s) , a.getEnergy(s));   //Sap xep tang dan
        });
        for (int i = 0; i < r.size(); ++i) r.get(i).exeInformation();
        System.out.println();
        //TIm robot tieu thu nang luong nhieu nhat
        r.get(0).exeInformation();
        //Sap xep danh sach robot theo thu tu tang dan
        System.out.println("DANH SACH ROBOT SAU KHI SAP XEP TANG DAN");
        for (int i = 0; i < r.size(); ++i) r.get(i).exeInformation();
    }
}
