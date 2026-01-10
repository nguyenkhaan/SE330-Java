package Bai02;

public class Main {
    //Neu muon tao nhieu project trong 1 project -> File -> New Project from existing Project
    public static void main(String[] args) {
        //Hinh chu nhat
        Rectangle r = new Rectangle();
        r.Input();
        System.out.println("Chu vi hinh chu nhat: " + r.chuvi());
        System.out.println("Dien tich hinh chu nhat: " + r.dientich());
        //Hinh vuong
        Square s = new Square();
        s.Input();
        System.out.println("Chu vi hinh vuong: " + s.chuvi());
        System.out.println("Dien tich hinh vuong: " + s.dientich());
        //Hinh tron
        Circle c = new Circle();
        c.Input();
        System.out.println("Chu vi hinh tron: " + c.chuvi());
        System.out.println("Dien tich hinh tron: " + c.dientich());
        //Hinh tam giac
        Triangle t = new Triangle();
        t.Input();
        System.out.println("Chu vi hinh tam giac: " + t.chuvi());
        System.out.println("Dien tich hinh tam giac: " + t.dientich());

    }
}
