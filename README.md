# Selenium_Java

<h4>WebDriver is an Interface. All the webdrivers are the Classes that implement the Interface.</h4>

<h3>Locator</h3> Locators are used to identify and interact with web elements on a web page. 

<h4>ID Locator:</h4>

Locate an element by its ID attribute.
WebElement element = driver.findElement(By.id("elementId"));

<h4>Name Locator:</h4>

Locate an element by its Name attribute.
WebElement element = driver.findElement(By.name("elementName"));

<h4>Class Name Locator:</h4>

Locate an element by its class name.
WebElement element = driver.findElement(By.className("className"));

<h4>Tag Name Locator:</h4>

Locate an element by its HTML tag name.
WebElement element = driver.findElement(By.tagName("tagName"));

<h4>Link Text Locator:</h4>

Locate a link element by its exact text.
WebElement element = driver.findElement(By.linkText("Link Text"));

<h4>Partial Link Text Locator:</h4>

Locate a link element by a partial match of its text.
WebElement element = driver.findElement(By.partialLinkText("Partial Text"));

<h4>XPath Locator:</h4>

Locate an element using XPath expression.
WebElement element = driver.findElement(By.xpath("//xpathExpression"));

<h4>CSS Selector Locator:</h4>

Locate an element using a CSS selector.
WebElement element = driver.findElement(By.cssSelector("cssSelector"));

