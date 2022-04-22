package QuanLyTaiLieu;

public class Magazine extends Document{
    private int soPhatHanh;
    private int thangPhatHanh;

    public Magazine() {
    }

    public Magazine(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public Magazine(int maTaiLieu, String tenNXB, int banPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(tenNXB, banPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tap chi: " + super.toString() + ", " + soPhatHanh + ";";
    }
}
