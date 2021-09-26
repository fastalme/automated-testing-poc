
# Automated Testing Frameworks PoC

This is a Proof Of Concept project that works as an example of automated testing frameworks. 
It uses [Junit],[Selenium Webdriver] and [Cucumber] to show how these frameworks are configured and work together.

This project is tag-increment oriented, so each git tag represents a step (increment) in the project maturity as follows:

* step00-basic-selenium-script-and-basic-test
* step01-full-selenium-script
* step02-junit-selenium-tests
* step03-bdd-with-cucumber

## Steps (tags) descriptions

### 1) step01-basic-selenium-script-and-basic-test
Java (Maven based) basic project. It only has the respective JUnit and Selenium dependencies. It shows a basic Selenium sample script in `SeleniumBasicScript` class. It also shows a basic JUnit test class called `JUnitBasicTest`. 

### 2) step02-full-selenium-script
Here we can see a more mature Selenium script. It is implemented in the `SeleniumFullScript` class. It shows how we can use the Selenium API to interact with various HTML components. The web form used in this test is this [practice form].

### 3) step03-junit-selenium-tests
This next step shows how we integrate on a JUnit test the respective Selenium API routines, so we can run these automated interactions as a formal tests. This is useful to Continuous Integration environments. 

### 4) step04-bdd-with-cucumber
Finally, at this point there are 3 cucumber feature examples that shows how these user-defined features are integrated with the Selenium API and could be run as user acceptance tests. The web form used in this test is deployed [here]. The only difference between these three features is the way we pass *parameters* to the feature executions as follows:

| Feature | Class | Description |
| ------- | ----- | ----------- |
| `NoParamsSearchFeature` | `NoParamsStepDefinition` | Example that shows how we implement *non-parametrized* features. |
| `OutlineParamsSearchFeature` | `OutlineParamsStepDefinition` | Example that shows how we implement *outline* params in the features. Note that the entire feature is initialized with each parameter value. |
| `DataTableParamsSearchFeature` | `DataTableParamsStepDefinition` | Example that shows how we implement *data table* params in the features. Note that the feature is initialized only 1 time, no matter how much parametrized values we have.  |

[Junit]: https://junit.org/junit5/
[Selenium Webdriver]: https://www.selenium.dev/documentation/webdriver/
[Cucumber]: https://cucumber.io/
[practice form]: https://demoqa.com/automation-practice-form
[here]: http://automationpractice.com/index.php