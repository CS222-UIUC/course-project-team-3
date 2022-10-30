package models;

import java.util.ArrayList;
import java.lang.Math;

public class SplashPage {
    private ArrayList<BucketList[]> icons;
    private int iconCount = 0;

    public SplashPage(ArrayList<BucketList> b) {
        BucketList[] buffer = new BucketList[3]; //create array buffers to push into list
        int count = 1;
        int kGoal = 3;
        for (int bIndex = 0; bIndex < b.size(); ++bIndex) {
            if (count == kGoal) { //reset buffer, could be done with modulo
                icons.add(buffer);
                buffer = new BucketList[3];
                count = 1;
            } else {
                buffer[count - 1] = b.get(bIndex);
                ++iconCount;
                ++count;
            }
        }
    }

    public int getIconCount() {
        return iconCount;
    }

    public void insertIcon(BucketList b) {
        /* cast to int to avoid double arg error */
        BucketList[] blist = icons.get((int)(Math.floor(getIconCount() / 3)));
        if (getIconCount() % 3 == 0) {
            icons.add(new BucketList[3]);
            blist[0] = b;
        } else if (getIconCount() % 3 == 1) {
            blist[1] = b;
        } else {
            blist[2] = b;
        }
        ++iconCount;
    }

    public BucketList getIcon(int idx) {
        int row = idx / 3;
        int col = idx % 3 - 1;
        if (col == -1) col = 2;
        return icons.get(row)[col];
    }

    public void removeIcon(String name) {
        for (int i = 0; i < Math.floor(getIconCount() / 3); i++) {
            for (int j = 0; j < 3; ++i) {
                if ((icons.get(i))[j].getName() == name) {
                    _deleteShift((i * 3) + j); //pass in the index from which we need to start shifting
                }
            }
        }
    }

    private void _deleteShift(int idx) { //every elem becomes the element after it, until we get to the last element
        BucketList temp  = getIcon(idx);
        for (int i = idx; i < getIconCount(); ++i) {
            //shift over each element
        }
        //pop back last elem
    }
}
