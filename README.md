# Selenium Webdriver - Page Object Model

## Requirement

  1. Visit amazon.com Page
  2. Search for Book 'qa testing for beginners'
  3. Click on the 1st item in the listed results.
  4. Before Click on add to cart Add to Cart asset price from Step 3. 
  5. Click on Add to Cart.
  6. Before Click on Proceed to Checkout asset price from Step 3.
  7. Click on proceed to checkout
  8. On the checkout page assert price from Step 3.

## Implementation details

- Automated the above requirement using Selenium Webdriver, Java, Maven project and TestNG framework.

## Prerequisites to run on your local machine
- Java version 8 or higher.
- Maven installed on machine to compile and run from the command line or an IDE like Eclipse to compile and run. 
- Chrome driver and gecko driver executable files.


## How to Run

- clone the project from https://github.com/Priyanka-github-Automation/Selenium-Assignment.git to your local machine.
- **In the src/test/resources/Baseconfig.properties file, change the values of attributes "chromeDriver" and "geckoDriver" to match the path of browser drivers' executable files in your local machine.**
- To run from the command line, in the terminal, navigate to the corresponding folder and give the maven command 'mvn test'.
- To run in an IDE, import the project into your IDE, open the TestNG.xml file in the path src/test/resources and run as TestNG Suite
