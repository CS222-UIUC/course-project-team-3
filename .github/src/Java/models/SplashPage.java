#include BucketList.java

public class SplashPage {
    private ArrayList<BucketList[]> icons;

    public SplashPage() {
        icons = new Arraylist<BucketList[3]>
    }

    public SplashPage(ArrayList<BucketList> b) {
        BucketList[] buffer = new BucketList[3];
        int count = 1;
        int kGoal = 3;
        for (int bIndex = 0; bIndex < b.length(); ++bIndex) {
            if (count == kGoal) {
                icons.add(buffer);
                buffer = new BucketList[3];
                count = 1;
            } else {
                buffer[count - 1] = b.get(bIndex);
                ++count;
            }
        }
    }

    public int getIconCount() {
        return iconCount;
    }

    public void insertIcon(BucketList b) {
        if (getIconCount() % 3 == 0) {
            icons.add(new BucketList[3]);
            BucketList[] blist = icons.get(Math.floor(getIconCount() / 3));
            blist[0] = b;
        } else if (getIconCount() % 3 == 1) {
            BucketList[] blist = icons.get(Math.floor(getIconCount() / 3));
            blist[1] = b;
        } else {
            BucketList[] blist = icons.get(Math.floor(getIconCount() / 3));
            blist[2] = b;
        }
        ++iconCount;
    }

    public void removeIcon(String name) {
        //search for the icon given name
        for (int i = 0; i < Math.floor(getIconCount() / 3)) {
            for (int j = 0; j < 2; ++j) {
                BucketList[] blist = icons.get(i);
                //remove if we find a corresponding icon
                //empty spot in array now so we need to shift
                if (blist[j].getName() == name) {}
            }
        }
    }

    //TODO: empty spot in array after a removal so shift the contents of the array and List.
    privat void removeShift(int idx) { }
}