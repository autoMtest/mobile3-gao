package mobile.page;

import java.util.List;

import org.openqa.selenium.WebElement;

import mobile.page.base.ElementOf;
import mobile.page.base.ElementOfs;
import mobile.page.base.PageTradeWithSelect;
import up.light.pagefactory.TestElement;
import up.light.wait.WaitUtil;

public class PageJY extends PageTradeWithSelect {
	@ElementOf(ElementOfs.CODE)
	private TestElement oEditCode;

	@ElementOf(ElementOfs.NAME)
	private TestElement oTextName;

	@ElementOf(ElementOfs.NUMBER)
	private TestElement oEditNum;

	private TestElement oEditPrice;
	private TestElement oMenuWTFS;
	private TestElement oListWTFSes;

	@ElementOf(ElementOfs.BUTTON_OK)
	private TestElement oBtnBuyorSell;

	/**
	 * 获取价格
	 * @return
	 */
	public String doGetPrice() {
		return getValue(oEditPrice.e());
	}
	
	/**
	 * 选择委托方式
	 * @param WTFS 委托方式
	 */
	public void doChoseWTFS(String WTFS){
		oMenuWTFS.e().click();
		WaitUtil.sleep(500);
		List<WebElement> es = oListWTFSes.es();
		for(int i = 0;i < es.size();i++){
			if(es.get(i).getText().equals(WTFS)){
				es.get(i).click();
				break;
			}
		}
	}
	
}
