package QuanLi;


    public class Main {
        public static void main(String[] args) {
            PhongMay phongMayA = new PhongMay("Phong May A");
    
            MayTinh mayTinh1 = new MayTinh("MT01", "May tinh", "Intel Core i5, 8GB RAM");
            MayTinh mayTinh2 = new MayTinh("MT02", "May tinh", "Intel Core i7, 16GB RAM");
    
            phongMayA.themThietBi(mayTinh1);
            phongMayA.themThietBi(mayTinh2);
    
            MayChieu mayChieu1 = new MayChieu("MC01", "May chieu", "1920x1080");
            MayChieu mayChieu2 = new MayChieu("MC02", "May chieu", "1280x720");
    
            phongMayA.themThietBi(mayChieu1);
            phongMayA.themThietBi(mayChieu2);
    
            phongMayA.hienThiDanhSachThietBi();

            PhongMay phongMayB = new PhongMay("Phòng May B");
    
            MayTinh mayTinh3 = new MayTinh("MT01", "May tinh", "Intel Core i5, 8GB RAM");
            MayTinh mayTinh4 = new MayTinh("MT02", "May tinh", "Intel Core i7, 16GB RAM");
    
            phongMayB.themThietBi(mayTinh1);
            phongMayB.themThietBi(mayTinh2);
    
            MayChieu mayChieu3 = new MayChieu("MC01", "May chieu", "1920x1080");
            MayChieu mayChieu4 = new MayChieu("MC02", "May chieu", "1280x720");
    
            phongMayB.themThietBi(mayChieu1);
            phongMayB.themThietBi(mayChieu2);
    
            phongMayB.hienThiDanhSachThietBi();
        }
    }

