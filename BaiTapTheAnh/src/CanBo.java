import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;
    // ham khoi tao co tham so
    public CanBo(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public CanBo(){}

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        String temp ="";
        if(this.gioiTinh){
            temp = "Nu";
        }else{
            temp ="nam";
        }

        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh=" + temp +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void nhapThongTin(){
        System.out.println("Nhap vao ho ten: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhap vao nam sinh: ");
        this.namSinh = new Scanner(System.in).nextInt();
        System.out.println("Nhap vao gioi tinh: (0/1)");
        int luaChonGioiTinh = new Scanner(System.in).nextInt();
        if(luaChonGioiTinh ==1){
            this.gioiTinh = true;
        }else{
            this.gioiTinh= false;
        }
        System.out.println("Nhap vao dia chi: ");
        this.diaChi = new Scanner(System.in).nextLine();
    }
}
