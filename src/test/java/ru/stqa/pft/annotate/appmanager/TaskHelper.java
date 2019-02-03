package ru.stqa.pft.annotate.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import ru.stqa.pft.annotate.model.Data;

public class TaskHelper extends HelperBase {

  public TaskHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillCompanyName(Data data) {
    type(By.xpath("//*[@id='broker_name']"), data.getText());
  }

  public void checkElements() {
    if (!wd.findElements(By.xpath("//*[@id='field_broker_admin_email']")).isEmpty()) {
      click(By.xpath("//*[@id='field_broker_admin_email']"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_broker_admin_name']")).isEmpty()) {
      click(By.xpath("//*[@id='field_broker_admin_name']"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_broker_person_password'][1]")).isEmpty()) {
      click(By.xpath("//*[@id='field_broker_person_password'][1]"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_broker_person_password'][2]")).isEmpty()) {
      click(By.xpath("//*[@id='field_broker_person_password'][2]"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_broker_admin_phone']")).isEmpty()) {
      click(By.xpath("//*[@id='field_broker_admin_phone']"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[1]/span")).isEmpty()) {
      click(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[1]/span"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[2]/span")).isEmpty()) {
      click(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[2]/span"));
    }
    if (!wd.findElements(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[3]/span")).isEmpty()) {
      click(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[3]/span"));
    }
  }

  public void selectCountry() throws InterruptedException {
    click(By.xpath("//*[@id='broker_address_country']/option[2]"));
    Thread.sleep(3000);
  }

  public void checkCompanyUrl() {
    String text = wd.findElement(By.xpath("//*[@id='broker_tag']")).getAttribute("value");
    Assert.assertTrue(text.equals("tzijokphfeoyihkoifga4efbqasamt"));
  }

  public void selectCpmpanyProfile() {
    click(By.xpath("//*[@id='prop_company_profile']/option[2]"));
  }

  public void selectNumberOfEmployees() {
    click(By.xpath("//*[@id='prop_company_no_employees']/option[2]"));
  }

  public void selectDescribing() {
    click(By.xpath("//*[@id='prop_company_person_description']/option[2]"));
  }

  public void fillWorkEmailAccountManagerName(Data data) {
    type(By.xpath("//*[@id='broker_admin_email']"), data.getWorkEmail());
    type(By.xpath("//*[@id='broker_admin_name']"), data.getAccountManagerName());
  }

  public void createPassword() {
    click(By.xpath("//*[@id='field_broker_person_password']/td[2]/div/a"));
    click(By.xpath("/html/body/div[2]/div[3]/div/button"));
  }

  public void fillPhoneNumber(Data data) {
    type(By.xpath("//*[@id='broker_admin_phone']"), data.getPhoneNumber());
  }

  public void agreedTermsAndConditions() {
    click(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[1]/a"));
    click(By.xpath("//button[contains(text(), 'I agree')]"));
  }

  public void agreedPrivacyPolicy() {
    click(By.xpath("//*[@id='field_terms']/td[2]/div/div/label[2]/a"));
  }

  public void scrollToEnd() {
    click(By.xpath("//div[contains(text(), 'Revision')]"));
    click(By.xpath("/html/body/div[2]/div[1]/a"));
  }

  public void signUp() throws InterruptedException {
    click(By.xpath("//button[contains(text(), 'Sign Up')]"));
    Thread.sleep(180000);
  }
}
