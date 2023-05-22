package QuanLi;


    class MayChieu extends ThietBi {
        private String doPhanGiai;
    
        public MayChieu(String ten, String loai, String doPhanGiai) {
            super(ten, loai);
            this.doPhanGiai = doPhanGiai;
        }
    
        @Override
        public void hienThiThongTin() {
            System.out.println("May chieu: " + ten + " - Loai: " + loai + " - Do phan giai: " + doPhanGiai);
        }
    
}
