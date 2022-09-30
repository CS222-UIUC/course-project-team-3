package models;


import java.util.ArrayList;



public class BucketList {
    private ArrayList<String> b_List;

    public BucketList() {
        b_List = new ArrayList<>();
    }

    public void addItem(String item) {
        b_List.add(item);
    }


    public boolean removeItem(String item) {
        return b_List.remove(item);
    }
    public int size() {
        return b_List.size();
    }
}