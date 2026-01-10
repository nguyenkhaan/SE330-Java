package Bai06;
import Utlis.Helper;
public class Pedion extends Robot {
    private int F = 0;
    public Pedion()
    {
        this.M = 20;
        this.F = Helper.random(1, 5);
    }

    @Override
    public void exeInformation() {
        System.out.println("Loai robot: Pedion");
        System.out.println("Trong luong: " + M);
        System.out.println("Do linh hoat: " + F);
    }
    @Override
    public double getEnergy(double S)
    {
        return M * S + (F + 1) * S / 2;
    }
}
