import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int namSinh, boolean gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien( ){

    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                "} " + super.toString();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap vao cong viec cua nhan vien: ");
        this.congViec = new Scanner(System.in).nextLine();
    }
}
