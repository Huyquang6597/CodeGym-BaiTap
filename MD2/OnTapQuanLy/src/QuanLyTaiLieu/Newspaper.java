package QuanLyTaiLieu;

public class Newspaper extends Document{
    private int ngayPhatHanh;

    public Newspaper() {
    }

    public Newspaper(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Newspaper(int maTaiLieu, String tenNXB, int banPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNXB, banPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString() + "Bao {" + "ngayPhatHanh=" + ngayPhatHanh + '}';
    }
}
