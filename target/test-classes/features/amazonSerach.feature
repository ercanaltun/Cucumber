@Amazonix
Feature: Amazon Search


  Scenario: Amazonda Nutella Aratma
    Given Kullanici amazon ana sayfasina gider
    Then Kullanici searchboxta nutella aratir
    And Arama sonucunun gorundugunu test eder
    And sayfayi kapatir



  Scenario: Amazonda Nutella Aratma
    Given Kullanici amazon ana sayfasina gider
    Then Kullanici searchboxta dell aratir
    And Arama sonucunda dell gorundugunu test eder
    And sayfayi kapatir
