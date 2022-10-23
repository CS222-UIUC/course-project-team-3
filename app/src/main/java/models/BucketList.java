package models;


import java.util.ArrayList;
import java.util.Objects;


@SuppressWarnings("CanBeFinal")
public class BucketList {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<String> b_List;
    private int listSize;
    private ArrayList<Boolean> complete;

    public BucketList() {
        b_List = new ArrayList<>();
        listSize = 0;
        complete = new ArrayList<Boolean>();
    }

    public void addItem(String item) {
        b_List.add(item);
        listSize++;
        complete.add(false);
    }
    public String getItem(int index) {
        return b_List.get(index);
    }
    // new
    public Boolean getComplete(int index) {
        return complete.get(index);
    }
    public Boolean markComplete(int index) {
        if (complete.get(index).equals(false)) {
            complete.set(index, true);
        } else {
            complete.set(index, false);
        }
        return complete.get(index);
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