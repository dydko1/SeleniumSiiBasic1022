http://makeseleniumeasy.com/2020/04/11/problems-in-parallel-execution-with-static-webdriver/

mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/parallel/TestNG.xml
mvn clean test -Dsurefire.suiteXmlFiles=src/test/java/parallel/staticIssue/TestNG.xml
