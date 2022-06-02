package ThuVien;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(){
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                "} " + super.toString();
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap vao so phat hanh: ");
        this.soPhatHanh = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao thang phat hanh: ");
        this.thangPhatHanh = new Scanner(System.in).nextInt();
    }
}
