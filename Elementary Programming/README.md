## Chapter 2: Elementary Programming
###### Introduction to Java Programming and Data Structures by Y. Daniel Liang
### Key Notes

### Software Development Life Cycle
    SDLC is a multistage process that includes requirements specification, analysis, design, implementation, testing, deployment, 
    and maintenance. At any stage, it may be necessary to go back to a previous stage to correct issues that might prevent the 
    software from functioning as expected.
    
    Stage 1: Requirements Specification
    Understand the problem the sotware will address. Document in detail what the software system needs to do. Interaction between 
    users and developers is close in this phase. Study the problem carefully to identify system needs.
    
    Stage 2: System Analysis
    Analyze the data flow. Identify the systems' input and output (it helps to identify what the output is first, to figure out
    what input data is needed to produce the output.)
    
    Stage 3: System Design
    Create a process for obtaining the output from the input. Break through abstraction to break the problem into manageable 
    components and design strategies for implementing the components. Each component can be viewed as a subsystem that performs
    a specific function of the system. The essense of system analysis and design is input, process, output (IPO).
    
    Stage 4: Implementation
    Translate the system design into programs. Separate programs are written for each component then integrated to work together. 
    Code, self-test, and debug.
    
    Stage 5: Testing
    Ensure the code meets the requirements specification and is without bugs.
    
    Stage 6: Deployment
    Make the software available for use. Depending on the type of software, it may be installed on each user's machine or 
    installed on a server accessible on the Internet.
    
    Stage 7: Maintenance
    Update and improve the product in its ever-evolving environment. Periodic upgrades and fixes on new bug discoveries. 
    Incorporate changes.

##### Identifiers
###### Identifiers are names for naming elements (i.e. variables, constants, methods, classes, and packages). An identifier is a sequence of characters (letters, digits, underscores and dollar signs). It must start with a letter or underscore, not a digit. It cannot be a reserved word, and it can be any length.

##### Variables
###### Variables are used to store data in a program. Declaring a variable tells the compiler what type of data a variable can hold. A variable must be assigned a value before it can be used in a method.
     variable = expression;
###### In Java, the equal sign is the assignment operator.
###### A constant represents permanent data that never changes and is declared with the keyword final.

##### Numeric Data Types and Operations
###### Java provides four integer types:
     byte  || Range: -2^7 to 2^7 - 1 (-128 to 127)                                   || Storage Size: 8-bit signed
     short || Range: -2^15 to 2^15 - 1 (-32768 to 32767)                             || Storage Size: 16-bit signed
     int   || Range: -2^31 to 2^31 - 1 (-2147483648 to 2147483647)                   || Storage Size: 32-bit signed
     long  || Range: -2^63 to 2^63 - 1 (-9223372036854775808 to 9223372036854775807) || Storage Size: 64-bit signed
###### Java provides two floating-point types:
     float  || Negative Range: -3.4028235E + 38 to -1.4E - 45          || Positive Range: 1.4E - 45 to 3.4028235E + 38
     double || Negative Range: -1.7976931348623157E+308 to -4.9E - 324 || Positive Range: 4.9E - 324 to 1.7976931348623157E + 308
###### Java provides operators for performing numeric operations: addition (+), subtraction (-), multiplication (* ), division (/), and remainder (%)
###### Integer arithmetic yields integer results.
###### Java provides augmented assignment operators (+=), (-=), (* =), (/=), (%=). Increment operator (++) and decrement operator (--) increment or decrement a variable by 1.
##### Numeric Type Conversions
     System.out.println((int)1.7);      //This will display 1
     System.out.println((double)1 / 2); //This will display 0.5 because 1 is cast to 1.0 first, then the division is executed.
     System.out.println(1 / 2);         //This displays 0 because both 1 and 2 are integers
###### If an integer and a floating point number are involved in a binary operation, Java auto converts the integer to a floating-point value. A value can be converted from one type to another using the (type)value notation. This is known as casting.
###### Casting a variable of a type with a small range to a type with a large range is known as widening a type, whereas casting a variable of a large range type to a smaller range is known as narrowing a type. Widening a type can be performed without explicit casting, but narrowing a type must be performed explicitly.
