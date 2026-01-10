package Utlis;

import java.util.Random;

public class Helper {
    public static int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static int random(int l, int r)
    {
        Random rand = new Random();
        return rand.nextInt(l, r); //Thuc hien random
    }
}
