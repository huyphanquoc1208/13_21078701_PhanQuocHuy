package bt6;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang) {
        super(maHang);
        this.thoiGianBaoHanh = 0;
        this.congSuat = 0.0;
    }

    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, donGia, soLuongTon);
        setThoiGianBaoHanh(thoiGianBaoHanh);
        setCongSuat(congSuat);
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        if (thoiGianBaoHanh < 0) {
            throw new IllegalArgumentException("Thời gian bảo hành phải >= 0");
        }
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if (congSuat < 0) {
            throw new IllegalArgumentException("Công suất phải >= 0");
        }
        this.congSuat = congSuat;
    }

    @Override
    public double getTienVAT() {
        return donGia * 0.1;
    }

    @Override
    public String danhGia() {
        return soLuongTon < 3 ? "Bán được" : "";
    }
}

