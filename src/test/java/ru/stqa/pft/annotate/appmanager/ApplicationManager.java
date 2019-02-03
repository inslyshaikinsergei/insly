package ru.stqa.pft.annotate.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private TaskHelper taskHelper;

  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("https://insly.com/");
    taskHelper = new TaskHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.signup();
  }

  public void stop() {
    wd.quit();
  }

  public TaskHelper getTaskHelper() {
    return taskHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
