package ru.stqa.pft.annotate.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.annotate.model.Data;

public class TaskPerformingTests extends TestBase {

  @Test
  public void testTaskPerforming() throws InterruptedException {
    app.getTaskHelper().checkElements();
    app.getTaskHelper().fillCompanyName(new Data("tzijokphfeoyihkoifga4efbqasamt", null, null, null));
    app.getTaskHelper().selectCountry();
    app.getTaskHelper().checkCompanyUrl();
    app.getTaskHelper().selectCpmpanyProfile();
    app.getTaskHelper().selectNumberOfEmployees();
    app.getTaskHelper().selectDescribing();
    app.getTaskHelper().fillWorkEmailAccountManagerName(new Data(null, "te1280@qa.team", "John Sva", null));
    app.getTaskHelper().createPassword();
    app.getTaskHelper().fillPhoneNumber(new Data(null, null, null, "1234567"));
    app.getTaskHelper().agreedTermsAndConditions();
    app.getTaskHelper().agreedPrivacyPolicy();
    app.getTaskHelper().scrollToEnd();
    app.getTaskHelper().signUp();
    app.getNavigationHelper().checkUrl();
    app.getNavigationHelper().checkUserName();
  }
}
