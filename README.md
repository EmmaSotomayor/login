Introduction🚀

Radar4Ai is a support tool for companies. This development focuses on using artificial intelligence to interpret NLP and process informative requests. Its main functionality is a search bar where you can ask something you don't know and someone in the company you work for does know. The artificial intelligence will then be in charge of processing this information and will send the query made to the person who understands the subject so that he or she can assist in your doubt.
Starting🚀

The purpose of this repository is to facilitate automated testing with the primary goal of contributing to regression testing. These tests are cataloged by suites linked to each feature. Packages or suites can be found in the test/java folder.

The tests were built using the Java programming language, in conjunction with a series of libraries such as Selenium, TestNG, JUnit, Surefire and MAVEN as a dependency manager.

These instructions will allow you to get a working copy of the project on your local machine for development and especially testing purposes.
Pre requirements📋
For a correct installation and execution of the tests found in this repository it is necessary to install:
J.D.K.
MAVEN
Jenkins
Display
JDK integration
MavenIntegration
The installed libraries can be seen in the POM.xml file in <dependencies> </dependencies>

Facility🔧
Both JDK and Maven involve downloading the software from their official pages. Once installed, they require a configuration in System Variables.
Regarding Jenkins it is necessary to have previously installed JDK and sometimes to have a slightly old version of JDK in the root folder. This version does not need to be set in system variables.
Running the tests⚙️
Tests are run from the command line with MAVEN
To run a single test:
mvn test -Dtest=”TestClassName”
The following syntax can be used:
mvn -Dtest=TestCircle#mytest test
patterns can be used
mvn -Dtest=TestCircle#test* test
Since Surefire Plugin 2.19 multiple methods can be selected (JUnit 4, JUnit 4.7+ and TestNG):
mvn -Dtest=TestCircle#testOne+testTwo test
To run the SUITES:
mvn -Dtest=PackageName.*Test test
 
 
 
 
Analyze end-to-end tests🔩
These tests are intended to serve as support for regression tests and retesting of features within development. Being automated and continuously integrated with Jenkins allows a solid structure for periodic retesting or every time a change in development is implemented and thus early detection of defects.

Test Criteria⌨️
The tests verify a series of acceptance criteria included in each test case. These documents can be reviewed at any time in the documentation base of

Deployment📦
The deployment of this repository and its tools can be done from any local machine and executed as soon as the code is available.
Built with🛠️
List of tools used for this framework
Selenium - Testing framework
TestNG - Testing framework
Surefire - Command line test runner
JUnit - Test framework
Maven - Dependency Manager
Jenkins - CI/CD Tool
Wiki📖
You can find much more about how to use this project in our Wiki or project documentation base.
 
 
Versioning📌
We useSemVerfor versioning. For all available versions, see thetags in this repository.
Authors✒️
Mention all those who helped raise the project from its inception
Emmanuel Ayala Sotomayor - Initial Work -
Emmanuel Ayala Sotomayor - Documentation -
Marina Gorriti and Emmanuel Ayala Sotomayor - Test cases -
