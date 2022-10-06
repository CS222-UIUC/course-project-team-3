import src.Java.models.SplashPage
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testSplashPage {
    @Test
    public void testSplashPageInitialization() {
        SplashPage t = new SplashPage();
        ArrayList<BucketList> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(new BucketList());
        }
        SplashPage t2 = new SplashPage(l);
        assert t.getNumIcons() == 0;
        assert t2.getNumICons() == 4;
    }
}