
import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BucketList {
    private ArrayList<String> b_List;

    @Test
    public BucketList() {
        b_List = new ArrayList<>();
        assertTrue(b_list.empty());
    }

    @Test
    public void addItem(String item) {
        int initial_size = b_list.size();
        b_List.add(item);
        int final_size = b_list.size();
        assertTrue(initial_size < final_size);
    }

    @Test
    public bool removeItem(String item) {
        int initial_size = b_list.size();
        return b_List.remove(item);
        int final_size = b_list.size();
        assertTrue(initial_size > final_size);
    }
}
