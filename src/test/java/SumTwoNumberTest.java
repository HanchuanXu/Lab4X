import org.junit.Assert;
import org.junit.Test;
public class SumTwoNumberTest {
    @Test
    public void testTwoSum(){
        SumTwoNumber sumTwoNumber = new SumTwoNumber();
        Assert.assertEquals("Hello",3,sumTwoNumber.sum(1,2));
//        int[] nums1 = new int[]{2, 7, 11, 15};
//        int target1 = 9;
//        Assert.assertArrayEquals(new int[]{2,1},sumTwoNumber.twoSum(nums1,target1));
    }

}