
@All
Feature: AutomationExercise Login

  Scenario: Kullanicinin AutomationExercise Sitesine Giris Yapmasi
    Given Kullanici automationExercise sitesine girer
    And Kulanici login butonunu tiklar
    And Kulanici Dogru email ve dogru sifre ile siteye basarili giris yapar
    And Kullanici isminin login kisminda gorundugunu test eder
    And Sayfayı kapatir