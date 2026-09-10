LAB: Testing Objects
1.	What does printing an object with no toString() show, and why?
a.	It will print the memory address/hash, because this is Java’s default unless toString() gets an override.
2.	Record what your three fields printed as defaults. Which are primitive types and which are reference types?
a.	null – 0 – null. These are Primitive types
3.	How do constructors change the way objects are initialized compared with the previous section?
a.	Allows a collection of data variables to have values to start with or  to have variables that could be changed later on.
4.	What changed between the original object printout and this printout? Why is @Override useful?
a.	This printout no longer shows the memory address. It is more useful to use our toString() method that we overrode over the default one that only shows the memory address/hash.
5.	Why are private fields with getters and setters generally preferred over public fields? Give one example of a rule that could be enforced inside a setter.
a.	Private fields are preferred more because it is a common safe practice regarding security. This is so no one can mess with the original code. We don’t want hackers to go in and change anything for things like bank account information. 


Reflection.txt Section (pushed through Github from eclipse but just in case)
1.	Why do we use @Override with toString()?
a.	We use @Override to turn the default toString() method within Java into something different that does something different like in this case print out the class details to the programmer/user. 
2.	What changed after you added the no-argument constructor? What changed after adding the parameterized constructor
a.	The no-argument constructor was like the default of any object that was created, while the parameterized constructor were ones that could be input from the user. 
