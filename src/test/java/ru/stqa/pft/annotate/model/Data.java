package ru.stqa.pft.annotate.model;

public class Data {
  private final String text;
  private final String workEmail;
  private final String accountManagerName;
  private final String phoneNumber;

  public Data(String text, String workEmail, String accountManagerName, String phoneNumber) {
    this.text = text;
    this.workEmail = workEmail;
    this.accountManagerName = accountManagerName;
    this.phoneNumber = phoneNumber;
  }

  public String getText() {
    return text;
  }

  public String getAccountManagerName() {
    return accountManagerName;
  }

  public String getWorkEmail() {
    return workEmail;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
