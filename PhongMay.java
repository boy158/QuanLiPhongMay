package QuanLi;

import java.util.ArrayList;
import java.util.List;

class PhongMay {
    private String tenPhong;
    private List<ThietBi> danhSachThietBi;

    public PhongMay(String tenPhong) {
        this.tenPhong = tenPhong;
        danhSachThietBi = new ArrayList<>();
    }

    public void themThietBi(ThietBi thietBi) {
        danhSachThietBi.add(thietBi);
    }

    public void hienThiDanhSachThietBi() {
        System.out.println("Danh sach thiet bi trong phong " + tenPhong + ":");
        for (ThietBi thietBi : danhSachThietBi) {
            thietBi.hienThiThongTin();
        }
    }
}
