package Bai01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
@FunctionalInterface
interface comparator {
    public int compare(int a , int b);
}
public class Main {
    ArrayList<Integer> a = new ArrayList<>();
    ArrayList<Integer> b = new ArrayList<>();
    ArrayList<Integer> c = new ArrayList<>();
    int m = 50; //Kich thuoc mang b
    public void readFileA() throws IOException
    {
        try (FileInputStream in = new FileInputStream("BTH3_1/src/Bai01/a"))
        {
            int c = in.read();
            while (c != -1)
            {
                if (c >= '0' && c <= '9') a.add(c - '0');
                c = in.read();
            }
        }
        //Interface         //Khai bao ham              //Dinh nghia lambda
        //Ben trong ham sort la 1 anonymous class
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b)
            {
                return a.compareTo(b);
            }
        });
        System.out.println("Mang a sau khi sap xep la: " + a);
        c = (ArrayList)a.clone();
    } //Sap xep theo thu tu giam dan
    public void writeFileB() throws IOException
    {
        Random r = new Random();
        try (FileOutputStream out = new FileOutputStream("BTH3_1/src/Bai01/b");)
        {
            for (int i = 0; i < m; ++i) b.add(r.nextInt(1, 100));
            String s = "";
            for (int x : b) s += x + " ";
            for (int i = 0; i < s.length(); ++i) out.write((int)s.charAt(i));
        }
    }
    public void writeFileC() throws IOException
    {
        System.out.println("Mang c la: " + c);
        //toString(), equals, compareTo(), hashCode(), clone() (hen xui)
        try (FileOutputStream out = new FileOutputStream("BTH3_1/src/Bai01/c");)
        {
            c.set(0 , b.get(b.size() - 1));
            c.set(1 , b.get(b.size() - 2));
            c.set(2 , b.get(b.size() - 3));
            c.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b)
                {
                    return a.compareTo(b);
                }
            });
            String s  ="";
            for (int x : c) s += x + " ";
            for (int i = 0; i < s.length(); ++i) out.write((int)s.charAt(i));
        }

    }
    public void main(String[] args) throws IOException
    {
        //Read information to get Array a
        readFileA();
        //Write information to array B
        writeFileB();
        writeFileC();
    }
}
