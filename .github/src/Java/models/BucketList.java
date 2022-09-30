
import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BucketList {
    private ArrayList<String> b_List;
    @Test
    public BucketList() {
        b_List = new ArrayList<>();
        assertTrue(b_List.empty());
    }
    @Test
    public void addItem(String item) {
        int intial_size = b_List.size();
        b_List.add(item);
        int final_size = b_List.size();
        assertTrue(final_size > initial_size);
    }
    @Test
    public boolean removeItem(String item) {
        int intial_size = b_List.size();
        return b_List.remove(item);
        int final_size = b_List.size();
        assertTrue(final_size < initial_size);
    }

}


