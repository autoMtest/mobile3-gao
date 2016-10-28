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
 * 成交确认买入测试
 */
public class TestH03GZCJQRMR extends TestBase {
	private PageLOF mPage = PageManager.getPage(PageLOF.class);

	@BeforeClass
	public void before() {
		ViewNavigator.navigate("成交确认买入", mPage);
	}

	@Test(dataProvider = "dp", dataProviderClass = TestDataProvider.class)
	public void testGZCJQRMR(Map<String, String> param) {
		
	}
}
