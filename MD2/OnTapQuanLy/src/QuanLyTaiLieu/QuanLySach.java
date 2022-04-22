package QuanLyTaiLieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements QuanLy<Document> {
    private List<Document> documentList = new ArrayList<>();


    public QuanLySach(){
    }

    @Override
    public void add(Document document) {
        documentList.add(document);
    }

    @Override
    public void delete(int id) {
        if (findById(id) != -1) {
            documentList.remove(findById(id));
        } else {
            System.out.println("Khong co!");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < documentList.size(); i++) {
            System.out.println(documentList.get(i));
        }
        System.out.println("===========================");
    }
    public void displayBook(){
        for (Document t : documentList){
            if (t instanceof Book){
                System.out.println(t);
            }
        }
    }
    public void displayMagazine(){
        for (Document t : documentList){
            if (t instanceof Magazine){
                System.out.println(t);
            }
        }
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < documentList.size(); i++) {
            if (documentList.get(i).getMaTaiLieu() == id) {
                return i;
            }
        }
        return 1;
    }

//    @Override
//    public int findByName(String name) {
//        for (int i = 0 ; i < documentList.size(); i++){
//            if (documentList.get(i).getTenNXB().equals(name)){
//                System.out.println(documentList.get(i));
//                return i;
//            }
//        }
//        return -1;
//    }

    @Override
    public int findByType(Document document , int id) {
        return 0;
    }

    @Override
    public void exit() {

    }
}
