package Bai07;

public interface IDichVu {
    default double tinhTien()
    {
        return 0;
    }
    default double input() {
        return 0;
    }
    default int findMax() {
        return 0;
    }
}
