package Bai06;
import Utlis.Helper;
public class Attacker extends Robot {
    private int P = 0;
    public Attacker() {
        this.M = 50;
        //
        P = Helper.random(20, 30);
    }

    @Override  //Annotation
    public void exeInformation() {
    //super.exeInformation(); Run the code from parent, don't need
        System.out.println("Loai robot: Attacker");
        System.out.println("Trong luong: " + M);
        System.out.println("Chi so suc manh: " + P);
    }
    @Override
    public double getEnergy(double S)
    {
        return M * S + P*P*S;
    }
}
