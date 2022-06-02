package ThuVien;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private  int ngayPhatHanh;

    public Bao(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(){}

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                "} " + super.toString();
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhap vao ngay phat hanh: ");
        this.ngayPhatHanh = new Scanner(System.in).nextInt();
    }


}
