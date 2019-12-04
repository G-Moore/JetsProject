
## Jets Project

### Overview
 
* Provides users with the ability to view information and engage in aerial combat and logistics procedures. Information can be viewed about the jets via a startup menu. 

* Jet information can be displayed through several menu options.

* Input is offered for a user to create a jet in addition the list that is offered.  


### Concepts

* Welcome users and offer instructions to continue.  The user may input a quit to exit. 

* The program will continuously run a nine option menu until the quit option is chosen. Users will be given the ability to input a list of jets with specified information required. The jets will be split into three categories fighter, cargo and unspecified. The User will be given the ability to add a jet with user input information specific to the jet and remove any jet from the list. The user will be able to engage in various tasks for types of jets with the categories via menu options 7, 8 being developed.

	* First will print out a list of all Jets including all fields of the Jets.
	* Second option will calculate the flight time that all Jets are capable of. 
	* Third option will print out the fastest jets speed in mach and proceeded by all fields of the specified Jet.
	* Fourth option will print out the Jet with the longest range proceeded by all fields of the specified Jet.
	* Fifth option adds user input Jet.
	* Sixth option user selects any Jet number to remove.
	* Seventh option under development.
	* Eighth option under development.
	* Ninth option exits the menu and quits the program entirely.


### Technologies Used

* BufferReader : input fields from txt file.
* arrayList : instantiate and provide jets data from txt file.
* String.split : use regex to search txt file for comma separated values. 
* For each : move through each array field to access data.
* Encapsulation : set fields with strict access modifiers.
* Getters and setters : for providing information to Jets variables.
* @Override : generate toString.
* Methods : minimize code run in main.
