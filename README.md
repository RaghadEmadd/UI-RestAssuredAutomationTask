# UI-RestAssuredAutomationTask

for the RestAssured project,
the scenarios include verifying GET,POST and DELETE methods as well as assertions on status codes and body of the json response.
The structure of the project is src/java-->TestCases(written in gherkin language given when then syntax, and includes assertions)
To run any of the testcases, right click on the testcases file and "run as testNG".
To view run results, inside test-output folder, you will find "emailable-report.html" view it on chrome browser and preview results successfully .
To execute negative scenarios, re-run the POST method with the same inputs and hence the assertion will fail, or try deleting an already deleted input and hence, the assertion will fail too.
There is a demo video for the restAssured API project through this link:https://github.com/user-attachments/assets/dacb086f-337d-44a3-b51e-842651cac70d



for the Eshop project,
the scenarios include locating elements on homepage screen, login screen and checkout screen and performing sendkeys methods and clicking methods as well as assertions.
The structure of the project is java-->features(written in  english language for easy understanding)
                                    -->pages(locate elements in different pages of the website)
                                    -->runner(responsible to create reports and also if you need to run specific tests or execute them in a specific order)
                                    -->stepDefinition(to call functions to be performed and link feature files with real user actions)
                                    -->utility(steps to be performed before or after test cases are executed)
To run any of the previous features, either go to the desired feature file and run from there, or go to test runner class and run the whole file to execute all the features. or you can specify tags before each feature and call it in the test runner class and add an extra tag for example) "tags= "@RegressionTest or @SmokeTest", where @smokeTest is the tag name you specified in the feature file that you want to run.

PS: the scenarios run on chromedriver and the version is handled through webdrivermanager.
I tried running allure report but all the dependencies that I tried have not been working therefore, i switched back to normal jUnit reports in the test runner, also, there is no demo as the project stopped running unexpectedly.

