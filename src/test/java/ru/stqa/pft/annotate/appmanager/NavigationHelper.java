package ru.stqa.pft.annotate.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void checkUrl() {
    String URL = wd.getCurrentUrl();
    Assert.assertEquals(URL, "https://tzijokphfeoyihkoifga4efbqasamt.insly.com/dashboard" );
  }

  public void checkUserName() {
    Assert.assertEquals(wd.getPageSource().contains("John Sva"), true);
  }
}
