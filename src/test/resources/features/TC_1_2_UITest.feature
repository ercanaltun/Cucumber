
@testcase1
Feature:Medunna Doktor Randevulari

  Scenario:Doktor randevu listesini ve zaman dilimlerini gorur

    Given Kullanici url adresine gider
    Then  Kullanici signin butonuna tiklar
    And   Kullanici gecerli bir username ve password girer
    And   Kullanici ana sayfada My Page sekmesine tiklar
    And   My page sekmesinden My Appointments secenegini tiklar
    And   Appointments sayfasında  randevu listesini ve zaman dilimlerini   bilgilerini gorur
    And   Sayfayi kapatir

  Scenario: Doktor patient id, start date, end date, status" bilgilerini gorebilmeli

    Given Kullanici url adresine gider
    Then  Kullanici signin butonuna tiklar
    And   Kullanici gecerli bir username ve password girer
    And   Kullanici ana sayfada My Page sekmesine tiklar
    And   My page sekmesinden My Appointments secenegini tiklar
    And   Kullanici  patient id, start date, end date, status bilgilerini gorur
    And   Sayfayi kapatir