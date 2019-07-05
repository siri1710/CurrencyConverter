Installation
-------------
You need to have Java 8 JDK installed along with maven.
Git

To run the tests locally with Chrome, install ChromeDriver from below link
http://chromedriver.chromium.org/
- create the folder webdrivers in C drive (with the same name)extract the driver from zip in it C:\webdrivers\chromedriver.exe
- add its location to your system PATH.

To run the tests locally with Firefox, install GeckoDriver from below link
https://github.com/mozilla/geckodriver/releases
- Extract and place the driver in the same folder C:\webdrivers\geckodriver.exe

To run the tests locally with IE, install IEDriver from below link
https://www.seleniumhq.org/download/
- Extract and place the driver in it C:\webdrivers\IEDriverServer.exe

I have used IntelliJ

Cloning Git repositories
------------------------
-Go to C:\ and then create a folder
-Inside the folder, right click and choose ‘Git Bash Here’. You will see a bash window opened.
-Go to GitLab, https://github.com/siri1710/CurrencyConverter/

Inside the bash window type like this, git clone git@gitlab.production.smartbox.com:quality-assurance/automation-core.git

Now navigate into project folders and do a git pull to make sure you get the most up to date source
cd currencyconverter
git pull


To install all dependencies, run
--------------------------------
$ mvn clean install

To Run the tests
----------------
$ mvn test -Dbrowser={browser} where {browser} is chrome or firefox or msie


To check the report
-------------------
Go to the below path in the project
currencyconverter(Prj)-->target(Fld)-->cucumber-report(Fld)-->advanced-reports(Fld)
-->cucumber-html-reports(Fld)-->overview-features.html(File)
when you move the mouse over the file you can see the browser options on top right corner
select chrome and the report will be opened on chrome.