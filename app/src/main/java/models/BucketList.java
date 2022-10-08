package models;


import java.util.ArrayList;
import java.util.Objects;


@SuppressWarnings("CanBeFinal")
public class BucketList {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<String> b_List;
    private int listSize;

    public BucketList() {
        b_List = new ArrayList<>();
        listSize = 0;
    }

    public void addItem(String item) {
        b_List.add(item);
        listSize++;
    }
    public String getItem(int index) {
        return b_List.get(index);
    }
    public int getIndex(String item) {
        for (int i = 0; i < listSize; i++) {
            if (Objects.equals(b_List.get(i), item)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeItem(String item) {
        if (b_List.remove(item)) {
            listSize--;
            return true;
        }
        return false;
    }
    public int size() {

        return listSize;
    }
}