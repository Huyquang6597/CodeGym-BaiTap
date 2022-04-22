package QuanLyTaiLieu;

public class Document {
    private int maTaiLieu;
    private String tenNXB;
    private int banPhatHanh;
    private static int autoId = 0;

    public Document() {
    }

    public Document (String tenNXB, int banPhatHanh) {
        this.maTaiLieu = autoId;
        autoId++;
        this.tenNXB = tenNXB;
        this.banPhatHanh = banPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getBanPhatHanh() {
        return banPhatHanh;
    }

    public void setBanPhatHanh(int banPhatHanh) {
        this.banPhatHanh = banPhatHanh;
    }

    @Override
    public String toString() {
        return  maTaiLieu + ", " + tenNXB + ", " + banPhatHanh + ";";
    }
}
