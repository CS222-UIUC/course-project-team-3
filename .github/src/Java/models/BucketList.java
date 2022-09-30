
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BucketList {
    private ArrayList<String> b_List;
    private int b_length;

    @Test
    public BucketList() {
        b_List = new ArrayList<>();
        b_length = 0;
        assertTrue(b_list.empty());
    }

    @Test
    public void addItem(String item) {
        int initial_size = b_list.size();
        b_List.add(item);
        b_length++;
        int final_size = b_list.size();
        assertTrue(initial_size < final_size);
    }

    @Test
    public bool removeItem(String item) {
        int initial_size = b_list.size();
        b_length--;
        return b_List.remove(item);
        int final_size = b_list.size();
        assertTrue(initial_size > final_size);
    }
}
