package Bai06;

public class Robot implements IRobot {
    double M;
    public void exeInformation() {}
    public double getEnergy(double S) { return 0; }
    public int compareTo(Robot a , double s)
    {
        if (getEnergy(s) > a.getEnergy(s)) return 1;
        else if (getEnergy(s) < a.getEnergy(s)) return -1;
        return 0;
    }
}
