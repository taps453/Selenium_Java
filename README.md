### Selenium_Java

- WebDriver is an Interface. All the webdrivers are the Classes that implement the Interface.

#### Locator 
- Locators are used to identify and interact with web elements on a web page. 

##### ID Locator
- Locate an element by its ID attribute.

```java
WebElement element = driver.findElement(By.id("elementId"));
```

##### Name Locator
- Locate an element by its Name attribute.

```java
WebElement element = driver.findElement(By.name("elementName"));
```

##### Class Name Locator
- Locate an element by its class name.

```java
WebElement element = driver.findElement(By.className("className"));
```

##### Tag Name Locator
- Locate an element by its HTML tag name.

```java
WebElement element = driver.findElement(By.tagName("tagName"));
```

##### Link Text Locator
- Locate a link element by its exact text.

```java
WebElement element = driver.findElement(By.linkText("Link Text"));
```

##### Partial Link Text Locator
- Locate a link element by a partial match of its text.

```java
WebElement element = driver.findElement(By.partialLinkText("Partial Text"));
```

##### XPath Locator
- Locate an element using XPath expression.

```java
WebElement element = driver.findElement(By.xpath("//xpathExpression"));
```

##### CSS Selector Locator
- Locate an element using a CSS selector.

```java
WebElement element = driver.findElement(By.cssSelector("cssSelector"));
```



### Maven Setup

- Make sure you have Maven installed. You can download it from [Maven official website](https://maven.apache.org/download.cgi).

#### mvn clean

- Cleans the project by deleting the target directory and its contents.
  
```bash
mvn clean
```

#### mvn compile

- Compiles the source code of the project.
  
```bash
mvn compile
```

#### mvn test

- Runs the tests for the project.
  
```bash
mvn test
```

#### mvn package

- Packages the compiled code into a distributable format, such as a JAR or WAR file.
  
```bash
mvn package
```

#### mvn install

- Installs the project artifacts into the local Maven repository. This makes them available for other projects that depend on them.
- 
```bash
mvn install
```

#### mvn deploy

- Deploys the project artifacts to a remote repository. Typically used for releasing artifacts to a central repository.
  
```bash

mvn deploy
```

#### mvn clean install

- Cleans the project and then installs the project artifacts.

```bash
mvn clean install
```

##### mvn clean package

- Cleans the project and then packages the compiled code.

```bash
mvn clean package
```

#### mvn clean test

- Cleans the project and then runs the tests.

```bash
mvn clean test
```

#### mvn clean deploy

- Cleans the project and then deploys the project artifacts.

```bash
mvn clean deploy
```

#### mvn archetype:generate

- Generates a new project from a Maven archetype (a project template).

```bash
mvn archetype:generate
```

#### mvn dependency:tree

- Displays the dependency tree for the project, showing all dependencies and their versions.

```bash
mvn dependency:tree
```


### Maven LifeCycle

#### Clean Lifecycle
- Clean Deletes the target directory and any other generated files.

#### Default Lifecycle

##### validate: 
- Validates the project structure.
##### compile: 
- Compiles the source code.
##### test: 
- Runs unit tests.
##### package: 
- Packages compiled code into a distributable format (e.g., JAR, WAR).
##### verify: 
- Runs checks on the package to ensure its integrity.
##### install:
- Installs the package into the local repository.
##### deploy: 
- Copies the final package to a remote repository for sharing with other developers or projects.







### Xpath - XML path
- It's a syntax or language for finding any element on 	the web page using XML path expression.

#### 1. Absolute xpath - 
- Direct way to find the element in HTML DOM.
- Begin with (/) slash. dtsrt from root location.

- Ex- /html/body/div/div/div/a/img

#### 2. Relative xpath -
- It start from the middle of HTmL DOM.
- Start with (//), It can search the element anywhere at the webpage

- Ex- xpath = //tagname[@attribute = "value"]
- //span[@class = "hmsprite"] or //*[@class="hmsprie"]/div[3]/div[2]/a


### CSS Selector 
- It,s a combination of element selector and a selector value. It can locate web element having no ID, Class or Name.

#### For ID 
- <HTML tag><#><value of ID attribute>
- 1- input#login1

#### For Class 
- <HTML tag><.><value of class attribute>
- 1- "em.eye-icon" or ".eye-icon"

#### For Attribute 
- <HTML tag><[attribute = value of attribute]>
- 1- "input[title='Sign in']"


#### Create combined xPath - 

- 1- //input[@type='text' and @name='firstname']

#### text() function 
- It help us to find the element based on the text present in  the element.[case sensitive]

- Syntax - //HTMLTAG[text() = 'value']


#### Parent child -
- //div[@id='navbar-collapse']/ul/li/a[text() ='Features']
- //div[@id='navbar-collapse']//a[text()='Features']


#### Wildcard search in XPath:- *
- 1- //*[@id='value']

#### Contains() 
- find the element with partial values / Dynamic Elements.
- Syntax - //htmlTag[contains(text(),'value']

- Ex- //div[contains(text(),'2019') and contains(@id,'last_trade')]


#### Starts-with() 
- //htmltag[starts-with(@attribute,'value')]
##### Ends-with() 
- //htmltag[ends-with(@attribute,'value')]


#### Farward Axis 
#### Reverse Axis 




