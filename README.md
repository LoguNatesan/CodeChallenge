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

(Qn 2)
	- (2a) Added a new extended child class 'Duck' (is a bird) with overridden method for Sing() to say 'Quack Quack' specific to Duck class. 
	- (2b) Duck can access swim method from Bird class
	- (2c) Added a new extended child class 'Chicken' (is a bird) with overridden method for Sing() to say 'Cluck Cluck' specific to Chicken class
	- (2d) Added a new overridden method for Fly() to say 'I cannot fly' specific to Chicken class
	- Added JUNIT test case for solution

(Qn 3)
	- (3a) Added a new extended child class 'Rooster' (is a bird) with overridden method for Sing() to say 'Cock-a-doodle-doo' specific to Rooster class
	- (3b) Rooster & Chicken are of same Bird class but different gender (state). Included static final for gender (male or female) and the value cannot be changed throughout the program.
	- (3c) Included member variable 'type' to differentiate between Chicken & Rooster while instantiating type must be given (either Chicken or Rooster) and appropriate sound will be displayed in console. This is done without using inheritance
	
(Qn 4)
	- (4a, 4b, 4c, 4d) Using Class & Object concept, three different parrot objects (differnet objects can be passed via constructor) can be created. For future addition of parrots, new objects can be created by passing the state value through the constructor.

Section-B:
(Qn 1)
	- Added a new interface Fish implements Animal class with overridden methods fly, swim, walk and sing
	
(Qn 2)
	- Added two new classes Shark & ClownFish implemented from Fish class with individual state & behaviours
	
(Qn 3)
	- Added new class Dolphin implemented from Animal class(and not from Fish class) 
	- Without using inheritance, created Fish object inside Dolphin class and objects are passed while instantiating Dolphin class
	
Section-D:
(Qn 1 & 2)
	- Created ButterFly class implemented from Animal class with overridden methods fly, swim, walk and sing
	- Added public function to set as butterfly or Caterpillar and based on input methods fly & walk can be customized for butterfly or caterpillar since behaviour changes over time. 