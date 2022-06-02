package ThuVien;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(){}

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                "} " + super.toString();
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhap vao ten tac gia: ");
        this.tenTacGia = new Scanner(System.in).nextLine();
        System.out.println("Nhap vao so trang: ");
        this.soTrang = new Scanner(System.in).nextInt();
    }




}
