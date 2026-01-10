package Bai08;

public class MachDien {
    double dienTro = 0;
    String name = "";
    void output()
    {
        System.out.println("Name: " + name + "\tDien tro: " + dienTro);
    }
    public MachDien() {}
    public MachDien(String name, double dienTro)
    {
        //Create a new Mach Dien   //Enter a name to save
        this.name = name;
        this.dienTro = dienTro;
    }
    public double series(MachDien a)
    {
        return a.dienTro + dienTro;
    }
    public double parallel(MachDien a)
    {
        return (a.dienTro + dienTro) * 1.0 / (dienTro * a.dienTro);
    }
}
