package Bai14;

import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        for (int i = 0; i < h; ++i)
            arr.add(new ArrayList<>());
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < h; ++j) arr.get(i).add(0);
        }
        arr.get(0).set(0 , 1);
        for (int i = 2; i <= h; ++i)
        {
            arr.get(i-1).set(0, 1);
            for (int j = 2; j <= i; ++j) {
                int k = arr.get(i - 2).get(j - 1) + arr.get(i - 2).get(j - 2);
                arr.get(i - 1).set(j - 1, k);
            }
        }
        for (ArrayList<Integer> v : arr) {
            for (int x : v) if (x != 0) System.out.printf("%d ", x);
            System.out.println();
        }
    }
}
