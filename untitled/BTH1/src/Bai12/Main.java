package Bai12;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BigInteger bgi = new BigInteger("123467890");
        BigInteger bi1 = new BigInteger("9876654321");
        BigInteger bi2 = new BigInteger("3");
        System.out.println(bgi.add(bi1.multiply(bi2)));
    }
}
