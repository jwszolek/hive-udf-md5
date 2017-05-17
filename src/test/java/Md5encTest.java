import com.jwszol.Md5enc;
import org.apache.hadoop.io.Text;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jwszol on 17/05/17.
 */
public class Md5encTest {

    @Test
    public void testMD5(){
        Md5enc md5enc = new Md5enc();
        Assert.assertEquals(md5enc.evaluate(new Text("test123")),new Text("cc03e747a6afbbcbf8be7668acfebee5"));

    }

}
