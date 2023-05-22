package QuanLi;


    class MayTinh extends ThietBi {
        private String cauHinh;
    
        public MayTinh(String ten, String loai, String cauHinh) {
            super(ten, loai);
            this.cauHinh = cauHinh;
        }
    
        @Override
        public void hienThiThongTin() {
            System.out.println("May tinh: " + ten + " - Loai: " + loai + " - Cau hinh: " + cauHinh);
        }
    }

