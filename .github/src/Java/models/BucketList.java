
import java.util.ArrayList;

public class BucketList {
    private ArrayList<String> b_List;
    public BucketList() {
        b_List = new ArrayList<>();
    }
    public void addItem(String item) {
        b_List.add(item);
    }
    public bool removeItem(String item) {
        return b_List.remove(item);
    }
}
