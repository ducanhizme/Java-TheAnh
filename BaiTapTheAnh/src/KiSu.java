import java.util.Scanner;

public class KiSu extends CanBo{
    private String nganhDaoTao;

    public KiSu(String hoTen, int namSinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KiSu(){

    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                "} " + super.toString();
    }

    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Nhap vao nganh dao tao cua ki su: ");
        this.nganhDaoTao = new Scanner(System.in).nextLine();
    }

}
