package Bai2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Chu vi duong tron la: " +  Math.round(Math.PI * 2 * a * 100) / 100.0);
    }
}
