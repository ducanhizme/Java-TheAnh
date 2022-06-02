package ThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QL {
    private ArrayList<TaiLieu> dstl ;

    public QL(){
        this.dstl = new ArrayList<>();
    }

    public void nhapThongTin(){
        System.out.println("1.Sach\n2.Tap Chi\n3.Bao\n0.Thoat");
        while(true){
            System.out.println("Nhap lua chon de nhap thong tin: ");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon){
                case 1:
                    Sach sach = new Sach();
                    sach.nhap();
                    this.dstl.add(sach);
                    break;
                case 2:
                    TapChi tapChi = new TapChi();
                    tapChi.nhap();
                    this.dstl.add(tapChi);
                    break;
                case 3:
                    Bao bao = new Bao();
                    bao.nhap();
                    this.dstl.add(bao);
                    break;
            }
            if(luaChon==0){
                break;
            }
        }
    }

    public void hien(){
        for (TaiLieu e:this.dstl) {
            System.out.println(e);
        }
    }



    public void timKiemThongTin(){
        System.out.println("1.Tim kiem sach\n2.Tim kiem tap chi\n3.Tim kiem bao\n0.Thoat");
        while (true){
            System.out.println("Nhap vao lua chon cua ban: ");
            int luaChon = new Scanner(System.in).nextInt();
            switch (luaChon){
                case 1:
                    System.out.println("Nhap vao ten tac gia de tim kiem: ");
                    String ten = new Scanner(System.in).nextLine();
                    for(TaiLieu e : this.dstl){
                        if(e instanceof Sach) {
                            if (((Sach) e).getTenTacGia().equalsIgnoreCase(ten)) {
                                System.out.println(e);
                            }

                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhap vao thang phat hanh de tim kiem tap chi: ");
                    int thang = new Scanner(System.in).nextInt();
                    for (TaiLieu e: this.dstl){
                        if (e instanceof TapChi){
                            if(((TapChi)e).getThangPhatHanh() == thang){
                                System.out.println(e);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ngay phat hanh de tim bao: ");
                    int ngay = new Scanner(System.in).nextInt();
                    for (TaiLieu e : this.dstl){
                        if(e instanceof Bao){
                            if(((Bao)e).getNgayPhatHanh() == ngay){
                                System.out.println(e);
                            }
                        }
                    }
                    break;
            }
            if (luaChon ==0){
                break;
            }
        }
    }
}
