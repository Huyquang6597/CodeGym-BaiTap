package QuanLyTaiLieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach implements QuanLy<Document> {
    private List<Document> documentList = new ArrayList<>();

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
    public int findByType(Document document) {
        return 0;
    }

    @Override
    public void exit() {

    }
}
