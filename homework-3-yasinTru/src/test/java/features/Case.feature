@LoginPage
Feature: Home Page

  @Check
  Scenario: Check Login Page
    Given Yasin is on Home page
    When click "Giris Yap" card in the top right
    Then should see Login Page

  @Email @Components
  Scenario: Check Email Components
    Given Yasin is on Login Page
    When click "E-Posta" radio button
    Then should see "GIRIS YAP" title
    Then should see "E-Posta" radio button
    Then should see "Telefon" radio button
    Then should see "E-Posta Adresiniz" text on Email
    Then should see "Sifreniz" text on Password
    Then should see Show Password icon
    Then should see "Beni Hatirla" remember me
    Then should see "Sifremi Unuttum" forgot password
    Then should see "GIRIS YAP" login button


  @Empty
  Scenario Outline: Empty Login
    Given Yasin is on Login Page
    When click login button
    Then should see "<emailErr>" Email Empty message
    Examples:
      | emailErr                           | passErr                   |
      | Lutfen e-posta adresinizi giriniz. | Lutfen sifrenizi giriniz. |

  @Empty @Password
  Scenario Outline: Empty Password
    Given Yasin is on Login Page
    When type Email "<email>"
    When click login button
    Then should not see Email Empty message
    Examples:
      | email         | passErr                   |
      | yasin@mail.com | Lutfen sifrenizi giriniz. |

  @Empty @Email
  Scenario Outline: Empty Email
    Given Yasin is on Login Page
    When type Password "<pass>"
    When click login button
    Then should see "<emailErr>" Email Empty message

    Examples:
      | pass       | emailErr                           |
      | 1234567890 | Lutfen e-posta adresinizi giriniz. |

  @False @Password
  Scenario Outline: False Email
    Given Yasin is on Login Page
    When type Email "<email>" and click login
    Then should see "<passErr>" Email False message
    Examples:
      | email              | passErr                                    |
      | yasin@mail.com | Lutfen gecerli bir e-posta adresi giriniz. |

  @FalseLogin
  Scenario Outline: False Login
    Given Yasin is on Login Page
    When type Email "<email>", Password "<password>" and click login

    Examples:
      | email         | password | err                                                       |
      | yasin@mail.com | 123      | Lutfen E-posta Adresinizi ya da sifrenizi Kontrol Ediniz. |