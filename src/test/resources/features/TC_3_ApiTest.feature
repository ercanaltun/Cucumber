
 Feature: Medunna Doktor Randevulari

   Scenario: Doktor Randevularini Api ile Dogrulayin

   Given Endpoint  https://www.medunna.com/physician-appointment olarak set edilir
   Then  User tum appointment datalari  icin get request yapar
   And   User gelen tum appointment bilgileri datasini deserialize eder
   And   User tum appointment bilgileri datasini validate eder