package Bai07;
import java.util.*;
public class Main
{
    Scanner sc = new Scanner(System.in);
    ThueXe tx = new ThueXe();
    DienThoai dt = new DienThoai();
    TangHoa th = new TangHoa();
    private void ThemDichVuThueXe()
    {
        double mon = tx.input();
        System.out.println("So tien thu duoc khi them dich vu la: "  + mon);
    }
    public void ThemDichVuDienThoai()
    {
        double mon = dt.input();
        System.out.println("So tien thu duoc khi them dich vu dien thoai: " + mon);
    }
    public void ThemDichVuTangHoa()
    {
        double mon = th.input();
        System.out.println("So tien thu duoc khi them dich vu tang hoa la: " + mon);
    }
    public void timSoTienCaoNhat()
    {
        double mon = Math.max(Math.max(tx.tinhTien() , th.tinhTien()) , tx.tinhTien());
        System.out.println("So tien lon nhat la: "  + mon);
    }
    public void tongTien()
    {
        System.out.println("So tien thu duoc la: " + (tx.tinhTien() + th.tinhTien() + tx.tinhTien()));
    }
    public void main(String[] args)
    {
        while (true)
        {
            System.out.println("1. Them dich vu thue xe: ");
            System.out.println("2. Them dich vu goi dien thoai: ");
            System.out.println("3. Them dich vu tang hoa: ");
            System.out.println("5. Dich vu co tong tien cao nhat ");
            System.out.println("6. Tinh tong tien khach san thu duoc");
            System.out.println("7. Thoat");
            int choice;
            System.out.println("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: ThemDichVuThueXe(); break;
                case 2: ThemDichVuDienThoai(); break;
                case 3: ThemDichVuTangHoa();   break;
                case 4: timSoTienCaoNhat(); break;
                case 5: tongTien(); break;
                case 6:
                    System.out.println("bye..."); return;
                default:
                    System.out.println("Nhap khong hop le..."); break;
            }
        }
    }
}
