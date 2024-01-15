# Selenium_Java

<h4>WebDriver is an Interface. All the webdrivers are the Classes that implement the Interface.</h4>
<hr>
<h3>Locator</h3> Locators are used to identify and interact with web elements on a web page. 

<h4>ID Locator:</h4>
Locate an element by its ID attribute.

```java
WebElement element = driver.findElement(By.id("elementId"));
```

<h4>Name Locator:</h4>
Locate an element by its Name attribute.

```java
WebElement element = driver.findElement(By.name("elementName"));
```

<h4>Class Name Locator:</h4>
Locate an element by its class name.

```java
WebElement element = driver.findElement(By.className("className"));
```

<h4>Tag Name Locator:</h4>
Locate an element by its HTML tag name.

```java
WebElement element = driver.findElement(By.tagName("tagName"));
```

<h4>Link Text Locator:</h4>
Locate a link element by its exact text.

```java
WebElement element = driver.findElement(By.linkText("Link Text"));
```

<h4>Partial Link Text Locator:</h4>
Locate a link element by a partial match of its text.

```java
WebElement element = driver.findElement(By.partialLinkText("Partial Text"));
```

<h4>XPath Locator:</h4>
Locate an element using XPath expression.

```java
WebElement element = driver.findElement(By.xpath("//xpathExpression"));
```

<h4>CSS Selector Locator:</h4>
Locate an element using a CSS selector.

```java
WebElement element = driver.findElement(By.cssSelector("cssSelector"));
```


<hr>
<h3>Maven Setup</h3>

Make sure you have Maven installed. You can download it from [Maven official website](https://maven.apache.org/download.cgi).

<h4>mvn clean:</h4>

Cleans the project by deleting the target directory and its contents.
```bash
mvn clean
```

<h4>mvn compile:</h4>

Compiles the source code of the project.
```bash
mvn compile
```

<h4>mvn test:</h4>

Runs the tests for the project.
```bash
mvn test
```
<h4>mvn package:</h4>

Packages the compiled code into a distributable format, such as a JAR or WAR file.
```bash
mvn package
```

<h4>mvn install:</h4>

Installs the project artifacts into the local Maven repository. This makes them available for other projects that depend on them.
```bash
mvn install
```
<h4>mvn deploy:</h4>

Deploys the project artifacts to a remote repository. Typically used for releasing artifacts to a central repository.
```bash
mvn deploy
```

<h4>mvn clean install:</h4>

Cleans the project and then installs the project artifacts.
```bash
mvn clean install
```

<h4>mvn clean package:</h4>

Cleans the project and then packages the compiled code.
```bash
mvn clean package
```

<h4>mvn clean test:</h4>

Cleans the project and then runs the tests.
```bash
mvn clean test
```

<h4>mvn clean deploy:</h4>

Cleans the project and then deploys the project artifacts.
```bash
mvn clean deploy
```

<h4>mvn archetype:generate:</h4>

Generates a new project from a Maven archetype (a project template).
```bash
mvn archetype:generate
```

<h4>mvn dependency:tree:</h4>

Displays the dependency tree for the project, showing all dependencies and their versions.
```bash
mvn dependency:tree
```

<hr>
<h3>Maven LifeCycle</h3>

<h4>Clean Lifecycle:</h4>
<p><b>clean:</b></p> Deletes the target directory and any other generated files.

<h4>Default Lifecycle:</h4>

<p><b>validate:</b> Validates the project structure.</p>
<p><b>compile:</b>Compiles the source code.</p>
<p><b>test:</b> Runs unit tests.</p>
<p><b>package:</b> Packages compiled code into a distributable format (e.g., JAR, WAR).</p>
<p><b>verify:</b> Runs checks on the package to ensure its integrity.</p>
<p><b>install:</b>Installs the package into the local repository.</p>
<p><b>deploy:</b> Copies the final package to a remote repository for sharing with other developers or projects.</p>







Xpath - XML path, It's a syntax or language for finding any element on 	the web page using XML path expression.

1. Absolute xpath - 
- direct way to find the element in HTML DOM.
- Begin with (/) slash. dtsrt from root location.

ex- /html/body/div/div/div/a/img

2. Relative xpath -
- it start from the middle of HTmL DOM.
- start with (//), It can search the element anywhere at the webpage

ex- xpath = //tagname[@attribute = "value"]
//span[@class = "hmsprite"] or //*[@class="hmsprie"]/div[3]/div[2]/a

==================================================================================================================================
CSS Selector - It,s a combination of element selector and a selector value. It can locate web element having no ID, Class or Name.

for ID - <HTML tag><#><value of ID attribute>
1- input#login1

for Class - <HTML tag><.><value of class attribute>
1- "em.eye-icon" or ".eye-icon"

for Attribute - <HTML tag><[attribute = value of attribute]>
1- "input[title='Sign in']"

------------------------------------------------------------------------------------------------------------------------------------
Create combined xPath - 

1- //input[@type='text' and @name='firstname']

text() function - it help us to find the element based on the text present in  the element.[case sensitive]

syntax - //HTMLTAG[text() = 'value']


Parent child -
//div[@id='navbar-collapse']/ul/li/a[text() ='Features']
//div[@id='navbar-collapse']//a[text()='Features']


Wildcard search in XPath:- *
1- //*[@id='value']

Contains() - find the element with partial values / Dynamic Elements.
syntax - //htmlTag[contains(text(),'value']

ex- //div[contains(text(),'2019') and contains(@id,'last_trade')]

--------------------------------------------------------------------------------------------------------------------------------------
Starts-with() - //htmltag[starts-with(@attribute,'value')]
Ends-with() - //htmltag[ends-with(@attribute,'value')]


Farward Axis - 
Reverse Axis -













