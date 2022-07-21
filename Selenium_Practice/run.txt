set projectLocation=C:\Users\Yasmeen\practice\Selenium_Practice
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml