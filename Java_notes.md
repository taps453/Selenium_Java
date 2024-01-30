- Why Java is platform Independent.
- Source code ==> Byte code

### Access Modifiers: 
#### These modifiers control the scope of class and methods.

##### 1- Access Modifiers: 
- default
- public
- protected
- private.

##### 2- Non-access Modifiers: 
- final
- abstract
- static
- transient
- synchronized
- volatile
- native.


#### Data type - 
 
#####1- Primitive Data Type  
- boolean, 
- byte 
- char 
- short
- int 
- long 
- float
- double 

#####2- Non-Primitive DataType 
- String
- array

<hr>

- Identifiers are used for identification purposes. 
- Java Identifiers can be a class name, method name, variable name, or label. 


#### Types of Variables in Java
- (Ex -> int age = 20)[ data type variable name = value]

- Local Variables - declared inside the body of the method
- Instance Variables - variable declared inside the body but outside the 					          	                   method
- Static Variables - A variable which is declared as static is called 					 			         static variable . It cannot be local.

<hr>

## Properties file
- Properties class in java which store the key value pair.
- It's a subclass of HashTable.
- used to store project configuration data/settings.

### setProperty() - used to write the properties file
### getProperty() - used to read the properties file

<hr>

#### Collections ( java.util )

List --> ArrayList , LinkedList , Vector , Stack
Set --> HashSet , LinkedHashSet


## OOPS
- Class
- Object
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

### Constructor - It's a block of code similar to a method.it's called when an 			   	          instance of object is created.

#### Default Constructor - Every time an object is created using new() keyword, 						  	                       at least one constructor is called. It's called 						  	 			           default constructor.

#### Parameterized Constructor - 

- It name should be same as Class name.
- It must have no explicit return type.
- it cannot be abstract, static, final.


#### Static keyword
- static keyword used for memory management
- Static variable /methods / block are belong to the class not class object.
- Constructor can't be static.

#### This Keyword
- this is a reference variable refer to the current object.
- this can be used to invoke current class constructor.

<hr>

#### Inheritance
- Child object acquires all the properties and behaviours of parent object.
- code reusability and Method overriding.
- extends Keyword
- Inheritance represents "IS-A relationship"

#### Types
- Single level
- Multi-level
- Hierarchical Inheritance

##### Multiple Inheritance is not possible in Java.


#### Method Overloading (Compile time polymorphism)
- class has multiple method with same name but different in parameters.
- By changing the number of parameters
- By changing the type of parameters

#### Method Overriding ( Run time polymorphism)
- If child class has the same method as declared in the parent class, then it is known as method overriding.
- child method must have the same name/same parameter as in the parent class.


#### Super Keyword in Java
- super keyword is a reference variable which is used to refer immediate parent class object / class instance variable.
- It can be used to invoke immediate parent class method.
- super() can be used to invoke immediate parent class constructor.

#### Final keyword in java
- final keyword in java is used to restrict the user. 
- Variable,method and class can be defined final.

##### Final variable - Value of final variable can't be change.
##### Final Method - Final method can't be overridden in any child class.
##### Final class  - Final Class can't be overridden in java.


#### Abstract Class
- Class which is declared with the abstract keyword is known as an abstract class. It can have abstract and non abstract methods.
- Abstract methods are the Methods without implementation.
- Abstraction is a process of hiding the implementation details and showing only functionality to the user. Abstraction lets you focus on what the object does instead of how it does it.
- Abstract Class needs to be extended and its method implemented. Abstract class cannot be instantiated.


#### Interface
- Interface is used to achieve the 100% Abstraction in Java. In Interface, only abstract method are allowed.
- All Variables declared in Interface should be Constant. i.e public static final
- You can't create the Object of Interface.
- An Interface is declared by using the interface keyword.


#### Encapsulation 
- Encapsulation in Java is a process of wrapping code and data together into a single unit.
- User can create a fully encapsulated class in java by making all the data member of the class private. And use "setter" and "getter" method to set and get the data in it.



#### String
- In java, String is an object that represents a sequence of characters.

##### String Comparison
- By equals() method
- By comparison operator(==) - It compare reference instead of value.

##### String concatenation 
- By + operator
- By concat() method

##### String Buffer Class:-
- StringBuffer class is a mutable class, unlike the String class which is immutable. StringBuffer class is used to create mutable strings.
- It's preferred in (appending, inserting, deleting, modifying)

##### String Buffer Class Methods
- append()
- insert()
- replace()
- delete()
- reverse()

#### String Class Methods
- String CharAt() - return a Char value at the given index number.
- String concat() - combines specified string at the end of given string.
- String contains() - It search the sequence of char in string. (True/Flase)
- String endWith() - check if given string ends with given suffix. (True/False)
- String equals()  
- String indexOf() 
- String lastIndexOf()  
- String length()  
- String replace()
- String split()
- String startWith()
- String substring() - method return a part of the string.
- String toCharArray() - method convert string into character array.
- String toLowerCase()
- String toUpperCase()
- String trim() - it eliminates leading and trailing spaces.



<hr>

#### Exception handling
- It's a mechanism to handle the runtime errors so that normal flow of the application can be maintained.
- Exception is an event that disrupts the normal flow of the program.

##### Try
- try keyword is used to specify a block where we should place exception code.
The try block must be followed by either catch or finally.

##### Catch
- catch block is used to handle the exception.

- Java try block is used to enclose the code that might throw an exception.

- Zero division exception
- Null pointer exception

##### Multi Catch
- Application perform different tasks at the occurrence of different exceptions, use java multi catch block.


##### Finally 
- Java finally block is followed by try block and always executed whenever the exception occur or not.
- Finally block is used to execute important code such as closing connection, stream e.t.c


