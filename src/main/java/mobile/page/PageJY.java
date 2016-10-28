package mobile.page;

import mobile.page.base.ElementOf;
import mobile.page.base.ElementOfs;
import mobile.page.base.PageTradeWithSelect;
import up.light.pagefactory.TestElement;

public class PageJY extends PageTradeWithSelect {
	@ElementOf(ElementOfs.CODE)
	private TestElement oEditCode;

	@ElementOf(ElementOfs.NAME)
	private TestElement oTextName;

	@ElementOf(ElementOfs.NUMBER)
	private TestElement oEditNum;

	private TestElement oEditPrice;

	@ElementOf(ElementOfs.CODE)
	private TestElement oBtnBuyorSell;

	/**
	 * 获取价格
	 * @return
	 */
	public String doGetPrice() {
		return getValue(oEditPrice.e());
	}
}
