Feature: US01

  Scenario: TC01 Test

  Given http:webdriveruniversity.com adresine gidin
  And Login Portal a kadar asagi inin
  And Login Portal a tiklayin
  And Diger window'a gecin
  And username ve password kutularina deger yazdirin
  And login butonuna basin
  And Popup'ta cikan yazinin validation failed oldugunu test edin
  And Ok diyerek Popup'i kapatin
  And Ilk sayfaya geri donun
  And Ilk sayfaya donuldugunu test edin