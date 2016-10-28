package mobile.test.stage03;

import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mobile.navigator.ViewNavigator;
import mobile.page.PageLOF;
import mobile.page.base.PageManager;
import mobile.test.base.TestBase;
import mobile.test.base.TestDataProvider;

/**
 * 做市卖出测试
 */
public class TestH08GZZSMC extends TestBase {
	private PageLOF mPage = PageManager.getPage(PageLOF.class);

	@BeforeClass
	public void before() {
		ViewNavigator.navigate("做市卖出", mPage);
	}

	@Test(dataProvider = "dp", dataProviderClass = TestDataProvider.class)
	public void testGZZSMC(Map<String, String> param) {
		
	}
}
