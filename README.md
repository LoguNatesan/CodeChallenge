# CodeChallenge
Code Test for JAVA programmer

Section-A:
(Qn 1)

	- Implemented sing() method inside Bird.java class

(Qn 1a)
	- Added JUnit test case for each method in Animal & Bird class to test specific action and to ensure 100% unit test coverage. 
	- Implemented test case for Main Solution class.
	- For JUnit Test cases, used ByteArrayOutputStream & PrintStream library to read output from console and comparing with expected output with 	assertEquals method
	
(Qn 1b)
For code maintainability
	- Updated Animal class as interface & Added Walk() method inside Bird class
	- Since there may be new animals like Fish which cannot Walk, Sing or Fly. This will break the class hierarchy 
