package QuanLyTaiLieu;

public class Book extends Document {
    private String tenTacGia;
    private int soTrang;

    public Book() {
    }

    public Book(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Book(int maTaiLieu, String tenNXB, int banPhatHanh, String tenTacGia, int soTrang) {
        super(tenNXB, banPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach: " + super.toString() + ", " + soTrang + ";";
    }
}
