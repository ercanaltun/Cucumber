
@PracticeAmazon
Feature: Amazon Practice

  Scenario:Amazon Sign in Test

  Given kullanici Amazon web sitesine gider
  And sign in butonuna tiklar
  And faker kullanarak e-posta gonderir
  And gonderdigi e-postanin ekran goruntusunu alir
  Then continiue'a tiklar
  And There was a problem mesajini dogrular
  And Need help e tiklar
  And forgot your password e tiklar
  And Password assistance metnini dogrular
  And Geri gider
  And Create your account butonuna tiklar
  Then Create account metnini dogrular
  And websayfasiyi kapatir