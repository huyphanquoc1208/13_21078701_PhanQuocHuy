package bt6;

	import java.text.DecimalFormat;

	public abstract class HangHoa {
	    protected final String maHang;
	    protected String tenHang;
	    protected double donGia;
	    protected int soLuongTon;
	    
	    public HangHoa(String maHang) {
	        this(maHang,"xxx",0.0,0);
	    }
	    
	    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
	    	if(maHang == null || maHang.trim().length() == 0) 
	    		throw new IllegalArgumentException("Ma hang ko dc trong");
	    	this.maHang = maHang;
	    	setTenHang(tenHang);
	    	setDonGia(donGia);
	    	setSoLuongTon(soLuongTon);
	    }
	    
	public void setTenHang(String tenHang) {
	    if (tenHang == null || tenHang.trim().length() == 0) {
	        throw new IllegalArgumentException("Tên hàng không được để trống");
	    }
	    this.tenHang = tenHang;
	}

	
	public String getTenHang() {
		return tenHang;
	}

	public double getDonGia() {
	    return donGia;
	}

	public void setDonGia(double donGia) {
	    if (donGia < 0) {
	        throw new IllegalArgumentException("Đơn giá phải >= 0");
	    }
	    this.donGia = donGia;
	}

	public int getSoLuongTon() {
	    return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
	    if (soLuongTon < 0) {
	        throw new IllegalArgumentException("Số lượng tồn phải >= 0");
	    }
	    this.soLuongTon = soLuongTon;
	}

	public String getMaHang() {
	    return maHang;
	}

	public abstract double getTienVAT();

	public abstract String danhGia();

	@Override
	public String toString() {
	    DecimalFormat df = new DecimalFormat("#,##0.#");
	    return String.format("%-10s %-20s %-10.1f %-10d %-10.1f %-10s", maHang, tenHang, df.format(donGia), soLuongTon, df.format(getTienVAT()), danhGia());
	}
}