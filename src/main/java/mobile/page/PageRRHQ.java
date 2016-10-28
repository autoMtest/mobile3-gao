package mobile.page;

import mobile.page.base.ElementOf;
import mobile.page.base.ElementOfs;
import mobile.page.base.PageTradeWithSelect;
import up.light.pagefactory.TestElement;

/**
 * 融资融券还券界面
 * @category Stage-02
 */
public class PageRRHQ extends PageTradeWithSelect {
	private TestElement oBtnMQHQ;	// 买券还券
	private TestElement oBtnXQHQ;	// 现券还券

	@ElementOf(ElementOfs.CODE)
	private TestElement oEditCode;	// 证券代码

	@ElementOf(ElementOfs.NAME)
	private TestElement oTextName;	// 证券名称
	
	private TestElement oEditPrice;	// 价格

	@ElementOf(ElementOfs.NUMBER)
	private TestElement oEditNum;	// 数量

	@ElementOf(ElementOfs.BUTTON_OK)
	private TestElement oBtnOK;		// 交易按钮

	/**
	 * 切换还券类型：买券还券、现券还券
	 * @param type
	 */
	public void doSwitchType(String type) {
		if ("买券还券".equals(type)) {
			oBtnMQHQ.e().click();
		} else {
			oBtnXQHQ.e().click();
		}
	}

	/**
	 * 获取价格
	 * @return
	 */
	public String doGetPrice() {
		return getValue(oEditPrice.e());
	}
	
}
