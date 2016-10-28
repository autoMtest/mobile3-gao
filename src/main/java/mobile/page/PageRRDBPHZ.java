package mobile.page;

import mobile.page.base.ElementOf;
import mobile.page.base.ElementOfs;
import mobile.page.base.PageTradeWithSelect;
import up.light.pagefactory.TestElement;
import up.light.utils.ArgumentUtil;
import up.light.wait.WaitUtil;

public class PageRRDBPHZ extends PageTradeWithSelect {
	private TestElement oBtnPT2XY;	// 普通转信用
	private TestElement oBtnXY2PT;	// 信用转普通

	@ElementOf(ElementOfs.CODE)
	private TestElement oEditCode;	// 股票买卖界面编辑框

	@ElementOf(ElementOfs.NAME)
	private TestElement oTextName;	// 股票名称

	@ElementOf(ElementOfs.NUMBER)
	private TestElement oEditNum;	// 划转数量输入框

	@ElementOf(ElementOfs.BUTTON_OK)
	private TestElement oBtnSubmit;	// 划转提交按钮

	private TestElement oImgLoad;	// 加载浮层


	public void doSwithTo(String type) {
		WaitUtil.untilGone(driver, oImgLoad, WaitUtil.WAIT_LONG);
		TestElement e = null;
		
		if ("普通转信用".equals(type)) {
			e = oBtnPT2XY;
		} else if ("信用转普通".equals(type)) {
			e = oBtnXY2PT;
		}

		ArgumentUtil.notNull(e, "unsupport type: " + type);
		e.e().click();
		WaitUtil.sleep(500);
		WaitUtil.untilGone(driver, oImgLoad, WaitUtil.WAIT_LONG);
	}
}
