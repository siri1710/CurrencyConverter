Installation
-------------
You need to have Java 8 JDK installed along with maven.
Git

I have used IntelliJ
Windows OS

Cloning Git repositories
------------------------
-Go to C:\ and then create a folder
-Inside the folder, right click and choose ‘Git Bash Here’. You will see a bash window opened.
-Go to GitLab, https://github.com/siri1710/CurrencyConverter/

Inside the bash window type like this, git clone https://github.com/siri1710/CurrencyConverter.git

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
currencyconverter(Prj)
 -->target(Fld)
  -->cucumber-report(Fld)
   -->advanced-reports(Fld)
    -->cucumber-html-reports(Fld)
     -->overview-features.html(File)
when you move the mouse over the file you can see the browser options on top right corner
select chrome and the report will be opened on chrome.
