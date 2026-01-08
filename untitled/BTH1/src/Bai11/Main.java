package Bai11;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        a.set(2006 , Calendar.OCTOBER , 18);
        b.set(2006 , Calendar.JANUARY , 19);
        //So sanh hai ngay -> before, after, compareTo
        System.out.println(a.before(b));
        System.out.println(a.after(b));
        System.out.println(a.compareTo(b));
        //Lui va tien lich
        // Ngay tiep theo cua a
        Calendar c = (Calendar)a.clone();  //Clone a de khong lam thay doi bien goc
        //Ngay tiep theo cua a la
        c.add(Calendar.DAY_OF_MONTH , 1);
        c.add(Calendar.DAY_OF_MONTH , -1);
        System.out.println("Ngay moi la: " + c.toString());
        System.out.println("Ngay phia truoc la: " + c.toString());

    }
}
/**MOT SO HAM MA OBJ NAO CUNG CO
 * Chi co cac instance khai bao ra bang new moi goi la object, cac bien nguyen thuy khong phai la object
 * 1. compareTo(obj b): So sanh thu tu sap xep (tu dien) giua 2 object
 * 2. equals(obj c): So sanh ket qua bang nhau logic
 * 3. toString(): Chuyen thanh chuoi
 * 4. hashCode(): Tao ma hash
 * 5. getClass(): lay class -> So sanh: a.getClass() == ClassName.class (so sanh chat che), so sanh khong chat che: a instance of className (lien quan den subclass)
 * 6. clone() //Hen xui -> copy noi dung object nay sang 1 object khac (Copy noi dung logic)
*/