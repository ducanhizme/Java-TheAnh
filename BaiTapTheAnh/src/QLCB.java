import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList<CanBo> qlcb = new ArrayList<CanBo>();

    public QLCB(){

    }
    public void nhapThongTinCanBo(){
        while (true){
            System.out.println("Nhap: ");
            System.out.println("1.Cong nhan");
            System.out.println("2.ki su");
            System.out.println("3.Nhan vien");
            System.out.println("0.Thoat");
            System.out.println("Lua chon cua ban: ");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon){
                case 1:
                    CongNhan cn = new CongNhan();
                    cn.nhapThongTin();
                    this.qlcb.add(cn);
                    break;
                case 2:
                    KiSu ks = new KiSu();
                    ks.nhapThongTin();
                    this.qlcb.add(ks);
                    break;
                case 3:
                    NhanVien nv = new NhanVien();
                    nv.nhapThongTin();
                    this.qlcb.add(nv);
                    break;
            }
            if(luaChon == 0){
                break;
            }

        }
    }

    public void hienThongTin(){
        for (CanBo e:qlcb) {
            System.out.println(e);
        }
    }

    public void timKiemThongTin(){
        System.out.println("Nhap vao ten ban muon tim kiem: ");
        String tenMuonTimKiem = new Scanner(System.in).nextLine();
        for(CanBo e: qlcb){
            if(e.getHoTen().equalsIgnoreCase(tenMuonTimKiem)){
                System.out.println(e);
            }
        }
    }
}
