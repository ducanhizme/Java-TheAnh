import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int namSinh, boolean gioiTinh, String diaChi, int bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan(){
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}'
                +super.toString();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap vao bac cua cong nhan: ");
        this.bac = new Scanner(System.in).nextInt();
    }
}
