import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * ${CLASS}
 * Created by luuhieu on 6/2/17.
 */
public class ShopProfilesTest extends BaseTestCase {
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void loginSuccess() throws Exception {
        Assert.assertTrue(driver.getTitle().contains("Danh sách vận đơn"));
    }
}
