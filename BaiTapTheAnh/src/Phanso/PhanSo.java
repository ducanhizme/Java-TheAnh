package Phanso;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo (int tuSo,int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo(){

    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }

    public void congPhanSo(PhanSo ps){
        int ts = this.tuSo * ps.getMauSo() + ps.getTuSo() * this.mauSo;
        int ms = this.mauSo* ps.getMauSo();
        PhanSo psTong = new PhanSo(ts,ms);
        System.out.println("Tong: "+psTong);
    }

    public void tru(PhanSo ps){
        int ts = this.tuSo * ps.getMauSo() - ps.getTuSo() * this.mauSo;
        int ms = this.mauSo* ps.getMauSo();
        PhanSo psHieu = new PhanSo(ts,ms);
        System.out.println("Hieu : "+psHieu);
    }

    public void nhan(PhanSo ps){
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void chia(PhanSo ps){
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
    }

}
