import com.github.f0rk777.model.URShift;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vendin on 23.10.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans.xml"})
public class UrShiftTest {
    @Autowired
    private URShift urShift;

    @Test
    public void testOnInt() {
        urShift = new URShift();
        int i = -1;
        urShift.setI(i);
        int test1 = urShift.doUnsignedShift(i);
        Assert.assertEquals(i, 0b11111111111111111111111111111111);
        Assert.assertEquals(test1, 0b1111111111111111111111);
    }

    @Test
    public void testOnLong() {
        urShift = new URShift();
        long i = -1;
        long test1 = urShift.doUnsignedShift(i);
        Assert.assertEquals(i, (long) 0b1111111111111111111111111111111111111111111111111111111111111111L);
        Assert.assertEquals(test1, 0b111111111111111111111111111111111111111111111111111111L);
    }

    @Test
    public void testOnShort() {
        urShift = new URShift();
        short i = -1;
        int test1 = urShift.doUnsignedShift(i);
        Assert.assertEquals(i, 0b11111111111111111111111111111111);
        Assert.assertEquals(test1, 0b1111111111111111111111);
    }

    @Test
    public void testOnByte() {
        urShift = new URShift();
        byte i = -1;
        int test1 = urShift.doUnsignedShift(i);
        Assert.assertEquals(i, 0b11111111111111111111111111111111);
        Assert.assertEquals(test1, 0b1111111111111111111111);
    }


}
