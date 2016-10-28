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
 * ETF赎回测试
 */
public class TestE04ETFSH extends TestBase {
	private PageLOF mPage = PageManager.getPage(PageLOF.class);

	@BeforeClass
	public void before() {
		ViewNavigator.navigate("ETF赎回", mPage);
	}

	@Test(dataProvider = "dp", dataProviderClass = TestDataProvider.class)
	public void testETFSH(Map<String, String> param) {
		
	}
}
