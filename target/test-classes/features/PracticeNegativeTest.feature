@medunna
Feature: medunna login negative test

  Scenario Outline:Negative login test

  Given kullanici "https://medunna.com/" sayfasina gider
  And login olmak icin signin e tiklar
  And username icin "<username>" kullanici adini gonderir
  And password icin "<password>" parolasini gonderir
  And signine tiklar
  And Authentication information not correct uyarisini dogrular

    Examples:
      | username | password |
      | username | password |