package QLX;

public class XeMay extends PhuongTien {
    private int dungTich;

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public XeMay() {

    }

    public int getDungTich(){
        return dungTich;
    }
    public void setDungTich(){
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay { Ten: " + getTen()+ ", gia = "+ getGia() + " dungTich = " + dungTich + '}';
    }
}

