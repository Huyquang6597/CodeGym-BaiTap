package QuanLyTaiLieu;

public class Document {
    private int maTaiLieu;
    private String tenNXB;
    private int banPhatHanh;

    public Document() {
    }

    public Document(int maTaiLieu, String tenNXB, int banPhatHanh) {
        this.maTaiLieu = maTaiLieu;
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
        return "Tai lieu{" + "Ma tai lieu: " + maTaiLieu + ", Ten NXB: " + tenNXB + '\'' + ", So ban phat hanh: " + banPhatHanh + '}';
    }
}
