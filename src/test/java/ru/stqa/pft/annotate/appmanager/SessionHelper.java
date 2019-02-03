package ru.stqa.pft.annotate.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void signup() {
    click(By.xpath("//*[@id='menu-item-14']/a/span"));
  }
}
