#include BucketList.java

public class SplashPage {
    private ArrayList<BucketList[]> icons;

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
}