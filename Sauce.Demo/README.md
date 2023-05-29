1. mvn versions:display-dependency-updates
   [INFO] The following dependencies in Dependencies have newer versions:
   [INFO]   io.github.bonigarcia:webdrivermanager ................. 5.3.2 -> 5.3.3
   [INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.9.1
   [INFO]   org.testng:testng ..................................... 7.7.1 -> 7.8.0
2.  mvn clean -Dlogin='standard_user' -Dpassword='secret_sauce' test
   [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   [INFO] ------------------------------------------------------------------------
   [INFO] BUILD SUCCESS
   [INFO] ------------------------------------------------------------------------
   [INFO] Total time:  13.121 s
