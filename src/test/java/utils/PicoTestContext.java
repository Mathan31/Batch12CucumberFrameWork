package utils;

import pages.PageObjectManager;

public class PicoTestContext {
	
	private BrowserBase browserBase;
	private PageObjectManager pageObjectManager;
	
	public PicoTestContext() {
		browserBase = new BrowserBase();
		pageObjectManager = new PageObjectManager(browserBase.invokeBrowser());
	}

	public BrowserBase getBrowserBase() {
		return browserBase;
	}


	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
