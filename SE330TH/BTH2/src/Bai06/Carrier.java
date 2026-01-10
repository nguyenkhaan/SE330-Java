package Bai06;
import Utlis.Helper;
public class Carrier extends Robot {
    private int E = 0;
    public Carrier()
    {
        this.M = 30;
        this.E = Helper.random(50, 100);
    }
    public void exeInformation()
    {
        System.out.println("Loai robot: Carrier");
        System.out.println("Trong luong: " + M);
        System.out.println("Nang luong: " + E);
    }
    public double getEnergy(double S)
    {
        return M * S + 4*E*S;
    }
}
