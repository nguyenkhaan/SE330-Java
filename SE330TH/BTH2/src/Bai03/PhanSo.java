package Bai03;
import Utlis.Helper;
public class PhanSo {
    int ts, ms;
    public PhanSo() {};
    public PhanSo(int ts, int ms)
    {
        this.ts = ts;
        this.ms = ms;
    }
    public String toString()  //override the function
    {
        return "" + ts + "/" + ms;
    }
    public void rutGon()
    {
        int gcd = Helper.gcd(ts, ms);
        ts /= gcd;
        ms /= gcd;
    }
    public PhanSo add(PhanSo b)
    {
        PhanSo res = new PhanSo();
        res.ts = ts * b.ms + b.ts * ms;
        res.ms = b.ms * ms;
        res.rutGon();
        return res;
    }
    public PhanSo minus(PhanSo b)
    {
        PhanSo res = new PhanSo();
        res.ts = ts * b.ms - b.ts * ms;
        res.ms = b.ms * ms;
        res.rutGon();
        return res;
    }
    public PhanSo multiply(PhanSo b)
    {
        PhanSo res = new PhanSo();
        res.ts = ts * b.ts;
        res.ms = b.ms * ms;
        res.rutGon();
        return res;
    }
    public PhanSo division(PhanSo b)
    {
        PhanSo res = new PhanSo();
        res.ts = ts * b.ms;
        res.ms = b.ts * ms;
        res.rutGon();
        return res;
    }
}
