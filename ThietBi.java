package QuanLi;

class ThietBi {
    protected String ten;
    protected String loai;

    public ThietBi(String ten, String loai) {
        this.ten = ten;
        this.loai = loai;
    }

    public void hienThiThongTin() {
        System.out.println(loai + ": " + ten);
    }
}
