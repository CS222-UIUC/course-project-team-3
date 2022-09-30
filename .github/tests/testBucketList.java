import src.Java.models.BucketList.java; // dont know if this is correct, just copied from the video

public class testBucketList {
    BucketList test = new BucketList();
    test.addItem("Fly");
    test.addItem("Travel");
    test.addItem("Code");
    assert (test.b_length == 3);
}