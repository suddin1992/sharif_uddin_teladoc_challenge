# sharif_uddin_teladoc_challenge
(Assuming you have maven, java, eclicpse are all installed on your computer and running smoothly"
This code will be running on chrome browser. You'll need to download chromedriver and unzip the chromedriver file. 
Obtain the path of the chromedriver.exe file by rightclicking on it and clicking properties and copy the file's path. 
Paste that into String chromeExePath (inside the double quatation) variable inside the Xpath_locators.java class.
If you're on mac, just copy and paste the chromdriver path. If you are windows add ".exe" at the end of the chromedriver path inside the String chromeExePath variable.
Inside the src/main/java there is a package called "feature" and inside file called "teldadoc.feature" - right click on that file and copy it's file path from the properties.
Paste the "teladoc.feature" file path into the "feaeture" code section in "Test_Runner.java" class which is inside testRunner package which is inside src/main/java.
Double check the previous steps or else the code will not run. 
To run the code, go to "Test_Runner.java" class which is inside testRunner package. RIGHT CLICK --- GO TO RUN AS --- JUNIT TEST
This should run the code  and enjoy. 
