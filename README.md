Need help for running it? HaHa! Follow these steps:

1. Download selenium-java-2.x.x.zip from http://www.seleniumhq.org/download/ and unzip it.

2. Create a new directory. This should be your directory structure:
  - MultiplyServerTester.java
  - selenium-2.45.0/
  	- libs/
  	- selenium-java-2.45.0.jar

3. compile command: javac -classpath .:selenium-2.45.0/selenium-java-2.45.0.jar:selenium-2.45.0/libs/* MultiplyServerTester.java 

4. exec command: java -cp .:selenium-2.45.0/selenium-java-2.45.0.jar:selenium-2.45.0/libs/* org.junit.runner.JUnitCore MultiplyServerTester

Note that all jar files within libs directory should be within your classpath!

You can also import these libraries within your eclipse/IntelliJ/etc.

The steps above is one approach of using selenium. 
Another approach is using selenium-server-standalone-x.y.z.jar instead of selenium-java-2.45.0.jar!
The required jar files are already included within selenium-server-standalone-x.y.z.jar. 
So you do not need to add all the jar files within the lib folder if you follow this second approach. (But you will need to add junit-x.x.jar)

You need to make it work one way or the other! :)
