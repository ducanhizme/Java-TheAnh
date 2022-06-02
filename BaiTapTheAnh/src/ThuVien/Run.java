package ThuVien;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        QL ql = new QL();
        System.out.println("1.Nhap thong tin \n 2.Hien thong tin \n 3.Tim kiem theo loai 0\n0. Thoat");
        while(true){
            System.out.println("Nhap lua chon cua ban: ");
            int luaChon = new Scanner(System.in).nextInt();
            switch(luaChon){
                case 1:
                    ql.nhapThongTin();
                    break;
                case 2:
                    ql.hien();
                    break;
                case 3:
                    ql.timKiemThongTin();
                    break;
            }
            if (luaChon ==0){
                break;
            }
        }
    }
}
