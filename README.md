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
Clean Lifecycle:
clean: Deletes the target directory and any other generated files.
Default Lifecycle:

validate: Validates the project structure.
compile: Compiles the source code.
test: Runs unit tests.
package: Packages compiled code into a distributable format (e.g., JAR, WAR).
verify: Runs checks on the package to ensure its integrity.
install: Installs the package into the local repository.
deploy: Copies the final package to a remote repository for sharing with other developers or projects.
