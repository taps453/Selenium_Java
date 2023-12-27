<h3>TestNG</h3>
It's a Test Automation Framework, which used to manage and execute the Test Cases.
<hr>
<h3>Advantages</h3>
1- Report Generation
2- Batch Test Execution
3- Execute Specfic Tests only
4- SetUp and Execute Test Pre-requisites
5- Easy to Code Test Vases,TestNG used own Validators.
6- Great Exception Handling
7- Test Parallel Execution
8- Test Order Execution
9- Easy to automate DataDriven Test Cases
10- Easy to integrate with Jenkins
<hr>

<h3>TestNG Annotations</h3>
- It's a line of code that can control how the method below then will execute.
- It's preceded by @ symbols.

1- BeforeSuite - method will run before all tests in this suite.
2- AfterSuite - method will run after all tests in this suite have run.
3- BeforeTest - method will run before any test method belonging to the class inside the <test> tag is run.
4- AfterTest - method will run after all the test methods belonging to the class inside the <test> tag have run.
5- @BeforeGroups - method run before the methods that belong to this grp.
6- @AfterGroups - method run after last method of the grp is invoked.
7- @BeforeMethod - run before each test method
8- @AfterMethod - run after each test method
9- @DataProvider - it provide the data toa test method.
10- @Listeners  - Defines Listners on a test class.
11- @Parameters  - describe how to pass parameters to a @Test method
12- @Test - mark a method as part of the test.
<hr>

<h3>Execution order</h3> ==> [ BeforeSuite -> BeforeTest -> BeforeClass -> BeforeMethod -> Test -> AfterMethod -> AfterClass -> AfterTest -> AfterSuite ]

<hr>
<h3>TestND XML - (Testing.xml) </h3>==> it allows user to configure a test suite and execute it from the command line.

<hr>
<h3>Assertons </h3> 
1- assertEqual(String actual , String expected)
2- assertEqual(String actual , String expected , String message)
3- assertEqual(boolean actual , boolean expected)
4- assertTure(condition , message)
5- assertFalse(condition)
6- assertFalse(condition , message)

<h3>TestCase Grouping </h3>
1. Grouping categorise the test cases based on the requirement.
2. @Test(groups = {"groupname"}) 
3. user can maintain the excution of groups via testing.xml file
4. <include> - it will include the test cases.
5. <exclude> - it will exclude the test cases

<h3>Test Parameterization</h3>
To pass multiple data to the application at runtime. It's also called Data Driven testing.


<h3>Type of Parameterization</h3>
1- with the help of "Parameters annotation and TestNG XML file".
ex. @Parameters({"username","password"})

2- with the help  of "DataProvider annotaions".
 - Data provider is annotation in TestNG. It return the dataset in form of 2D array.
 - array[1][2] - 1 represent dataset and 2 array contain the parameter.

<hr>

<h3>TestNG Listners</h3> Listners implements the interface in TestNG and report the real time events when test starts, fail, passes e.t.c

<h4>Types - </h4>
1-ITestListners - we can use this listners to analyse test methods, perform logging.

[
onTestStart, 
onTestSuccess, 
onTestFailure, 
onTestSkipped
]
<hr>

<h3>Run multiple Test suite in TestNG -</h3>

create a new xml file and put all xmls file in to the new file.

<suite-file path="xml1_path "></suite-file>
<suite-file path="xml2_path "></suite-file>
<suite-file path="xml3_path "></suite-file>
<hr>

<h3>Reporting in TestNG - </h3>
under test output ==> index.html
