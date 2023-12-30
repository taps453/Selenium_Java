<h3>TestNG</h3>
It's a Test Automation Framework, which used to manage and execute the Test Cases.
<hr>
<h3>Advantages</h3>
<li>Report Generation</li>
<li>Batch Test Execution</li>
<li>Execute Specfic Tests only</li>
<li> SetUp and Execute Test Pre-requisites</li>
<li>Easy to Code Test Vases,TestNG used own Validators.</li>
<li>Great Exception Handling</li>
<li>Test Parallel Execution</li>
<li>Test Order Execution</li>
<li>Easy to automate DataDriven Test Cases</li>
<li>Easy to integrate with Jenkins</li>
<hr>

<h3>TestNG Annotations</h3>
<li> It's a line of code that can control how the method below then will execute.</li>
<li>It's preceded by @ symbols.</li>

<li>BeforeSuite - method will run before all tests in this suite.</li>
<li>AfterSuite - method will run after all tests in this suite have run.</li>
<li>BeforeTest - method will run before any test method belonging to the class inside the <test> tag is run.</li>
<li>AfterTest - method will run after all the test methods belonging to the class inside the <test> tag have run.</li>
<li>@BeforeGroups - method run before the methods that belong to this grp.</li>
<li>@AfterGroups - method run after last method of the grp is invoked.</li>
<li>@BeforeMethod - run before each test method</li>
<li>@AfterMethod - run after each test method</li>
<li>@DataProvider - it provide the data toa test method.</li>
<li>@Listeners  - Defines Listners on a test class.</li>
<li>@Parameters  - describe how to pass parameters to a @Test method</li>
<li>@Test - mark a method as part of the test.</li>
<hr>

<h3>Execution order</h3>  [ BeforeSuite -> BeforeTest -> BeforeClass -> BeforeMethod -> Test -> AfterMethod -> AfterClass -> AfterTest -> AfterSuite ]

<hr>
<h3>TestND XML - (Testing.xml) </h3> it allows user to configure a test suite and execute it from the command line.

<hr>
<h3>Assertons </h3> 
<li>assertEqual(String actual , String expected)</li>
<li> assertEqual(String actual , String expected , String message)</li>
<li>assertEqual(boolean actual , boolean expected)</li>
<li>assertTure(condition , message)</li>
<li>assertFalse(condition)</li>
<li>assertFalse(condition , message)</li>

<h3>TestCase Grouping </h3>
 <li>Grouping categorise the test cases based on the requirement.</li>
 <li>@Test(groups = {"groupname"}) </li>
 <li>user can maintain the excution of groups via testing.xml file</li>
 <li><include> - it will include the test cases.</li>
 <li><exclude> - it will exclude the test cases</li>

<h3>Test Parameterization</h3>
To pass multiple data to the application at runtime. It's also called Data Driven testing.


<h3>Type of Parameterization</h3>
1- with the help of "Parameters annotation and TestNG XML file".
<p>ex. @Parameters({"username","password"})</p>

2- with the help  of "DataProvider annotaions".
 - Data provider is annotation in TestNG. It return the dataset in form of 2D array.
 - array[1][2] - 1 represent dataset and 2 array contain the parameter.

<hr>

<h3>TestNG Listners</h3> Listners implements the interface in TestNG and report the real time events when test starts, fail, passes e.t.c

<h4>Types - </h4>
1- ITestListners - we can use this listners to analyse test methods, perform logging.

<ul>
<li>onTestStart</li>
<li>onTestSuccess</li>
<li>onTestFailure</li>
<li>onTestSkipped</li>
</ul
<hr>

<h3>Run multiple Test suite in TestNG -</h3>

<p>create a new xml file and put all xmls file in to the new file.</p>

1. <suite-file path="xml1_path "></suite-file>
2. <suite-file path="xml2_path "></suite-file>
3. <suite-file path="xml3_path "></suite-file>
 
<hr>

<h3>Reporting in TestNG - </h3>
under test output ==> index.html
