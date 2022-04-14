package QLX;

public class Oto extends PhuongTien implements Comparable<Oto> {
    private int soCho;


    public Oto() {

    }

    public Oto(String hang, String mau, String ten, int gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }
    @Override
    public int compareTo(Oto o) {
        return this.getGia() - o.getGia();
    }

    @Override
    public String toString() {
        return "Oto { Ten: " + getTen()+ ", gia = "+ getGia() + " So cho = " + soCho + '}';
    }
}
