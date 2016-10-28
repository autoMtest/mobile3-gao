package mobile.page;

import mobile.page.base.ElementOf;
import mobile.page.base.ElementOfs;
import mobile.page.base.PageTradeWithSelect;
import up.light.pagefactory.TestElement;

/**
 * 融资融券还款界面
 * @category Stage-02
 */
public class PageRRHK extends PageTradeWithSelect {
	private TestElement oBtnMQHK;	// 卖券还款
	private TestElement oBtnXJHK;	// 现金还款

	@ElementOf(ElementOfs.CODE)
	private TestElement oEditCode;	// 证券代码

	@ElementOf(ElementOfs.NAME)
	private TestElement oTextName;	// 证券名称
	
	private TestElement oEditPrice;	// 价格

	@ElementOf(ElementOfs.NUMBER)
	private TestElement oEditNum;	// 数量

	@ElementOf(ElementOfs.BUTTON_OK)
	private TestElement oBtnOK;		// 交易按钮

	private TestElement oEditMoney;	// 还款金额
	private TestElement oTextKHZJ;	// 可还资金
	private TestElement oTextXHKE;	// 需还款额

	/**
	 * 切换还款类型：卖券还款、现金还款
	 * @param type
	 */
	public void doSwitchType(String type) {
		if ("卖券还款".equals(type)) {
			oBtnMQHK.e().click();
		} else {
			oBtnXJHK.e().click();
		}
	}

	/**
	 * 获取价格
	 * @return
	 */
	public String doGetPrice() {
		return getValue(oEditPrice.e());
	}

	/**
	 * 输入还款金额
	 * @param money
	 */
	public void doInputMoney(String money) {
		getKeyboard().doInput(oEditMoney.e(), money);
	}

	/**
	 * 获取可还资金数值
	 * @return
	 */
	public String doGetKHZJ() {
		return getText(oTextKHZJ.e()).replace(",", "");
	}

	/**
	 * 获取需还款额数值
	 * @return
	 */
	public String doGetXHKE() {
		return getText(oTextXHKE.e()).replace(",", "");
	}

}
