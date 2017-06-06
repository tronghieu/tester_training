import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * ${CLASS}
 * Created by luuhieu on 6/2/17.
 */
public class ShopProfilesTest extends BaseTestCase {

    private ShopProfilesPage page;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        page = PageFactory.initElements(driver, ShopProfilesPage.class);
        page.get();
    }

    @Test
    public void loginSuccess() throws Exception {
        super.loginSuccess();
    }
}
