## Chapter 4: Mathematical Functions, Characters, and Strings
###### Introduction to Java Programming and Data Structures by Y. Daniel Liang
### Key Notes
###### Java provides the mathematical methods sin, cos, tan, asin, acos, atan, toRadians, toDegrees, exp, log, log10, pow, sqrt, ceil, floor, rint, round, min, max, abs, and random in the Math class for performing mathematical functions.
##### Trigonometric Methods in the Math Class
    Method                    Description
    -------------------       -------------------
    sin(radians)              Returns the trig sine of an angle in radians
    cos(radians)              Returns the trig cosine of an angle in radians
    tan(radians)              Returns the trig tangent of an angle ini radians
    toRadians(degree)         Returns the angle in radians for the angle in degrees
    toDegrees(radians)        Returns the angle in degrees for the angle in radians
    asin(a)                   Returns the angle in radians for the inverse of sin
    acos(a)                   Returns the angle in radians for the inverse of cos
    atan(a)                   Returns the angle in radians for the inverse of tan
    For example,
    
    Math.toDegrees(Math.PI / 2) returns 90.0
    Math.toRadians(30) returns 0.5236 (same as π/6)
    Math.sin(0) returns 0.0
    Math.sin(Math.toRadians(270)) returns -1.0
    Math.sin(Math.PI / 6) returns 0.5
    Math.sin(Math.PI / 2) returns 1.0
    Math.cos(0) returns 1.0)
    Math.cos(Math.PI / 6) returns 0.866
    Math.cos(Math.PI / 2) returns 0
    Math.asin(0.5) returns 0.523598333 (same as π/6)
    Math.acos(0.5) returns 1.0472 (same as π/3)
    Math.atan(1.0) returns 0.785398 (same as π/4)
    
##### Exponent Methods in the Math Class
    Method                    Description
    -------------------       -------------------
    exp(x)                    Returns e raised to power of x(e^x)
    log(x)                    Returns the natural logarithm of x (In(x) = logₑ(x))
    log10(x)                  Returns the base 10 logarithm of x (log₁₀(x))
    pow(a, b)                 Returns a raised to the power of b (a^b)
    sqrt(x)                   Returns the square root of x (√x) for x >= 0
    For example,
    
    e^3.5 is Math.exp(3.5), which returns 33.11545
    ln(3.5) is Math.log(3.5), which returns 1.25276
    log₁₀(3.5) is Math.log10(3.5), which returns 0.544
    2^3 is Math.pow(2, 3), which returns 8.0
    3^2 is Math.pow(3, 2), which returns 9.0
    4.5^2.5 is Math.pow(4.5, 2.5), which returns 42.9567
    √4 is Math.sqrt(4), which returns 2.0
    √10.5 is Math.sqrt(10.5), which returns 3.24
    
##### Rounding Methods in the Math Class
    Method                    Description
    -------------------       -------------------
    ceil(x)                   x is rounded up to its nearest integer. This integer is returned as a double value
    floor(x)                  x is rounded down to its nearest integer. This integer is returned as a double value
    rint(x)                   x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double value
    round(x)                  Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double.
    For example,
    
    Math.ceil(2.1) returns 3.0
    Math.ceil(2.0) returns 2.0
    Math.ceil(-2.0) returns -2.0
    Math.floor(2.1) returns 2.0
    Math.floor(2.1) returns 2.0
    Math.floor(-2.0) returns -2.0
    Math.floor(-2.1) returns -3.0
    Math.rint(2.1) returns 2.0
    Math.rint(-2.0) returns -2.0
    Math.rint(-2.1) returns -2.0
    Math.rint(2.5) returns 2.0
    Math.rint(4.5) returns 4.0
    Math.rint(-2.5) returns -2.0
    Math.round(2.6f) returns 3    // Returns int
    Math.round(2.0) returns 2     // Returns long
    Math.round(-2.0f) returns -2  // Returns long
    Math.round(-2.6) returns -3   // Returns long
    Math.round(-2.4) returns -2   // Returns long
    
##### min, max, and abs Methods
    min and max methods return the minimum and maximum numbers of two numbers (int, long, float, double). The abs method returns the absolute value of the number.
    For example,
    
    max(4.4, 5.0) returns 5.0 and min(3, 2) returns 2
    Math.max(2, 3) returns 3
    Math.min(2.5, 4.6) returns 2.5
    Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns 4.6
    Math.abs(-2) returns 2
    Math.abs(-2.1) returns 2.1
    
##### random Method
    The random() method generates a random double value greater than or equal to 0.0 and less than 1.0. (0 <= Math.random() <= 1.0).
    It can be used to generate  random numbers in any range. For example,
    
    (int)(Math.random() * 10)       Returns a random integer between 0 and 9
    50 + (int)(Math.random() * 50)  Returns a random integer between 50 and 99
    a + Math.random() * b           Returns a random number between a + b, excluding a and b
    
###### The character type char represents a single character. Characters can be compared based on their Unicode using the relational operators.
###### An escape sequence consists of a blackslash (\) followed by a character or a combination of digits. The character \ is the escape character. The characters ' ', \t, \f, \r, and \n are known as the whitespace characters.
    \b  Backspace
    \t  Tab
    \n  Linefeed
    \f  Formfeed
    \r  Carriage Return
    \\  Backslash
    \"  Double Quote

##### Character Class Methods
    Method                          Description
    -------------------             -------------------
    isDigit(ch)                     Returns true if the specified character is a digit
    isLetter(ch)                    Returns true if the specified character is a letter
    isLetterOrDigit(ch)             Returns true i the specified char is a letter or digit
    isLowerCase(ch)                 Returns true if the specified char is a lowercase letter
    isUpperCase(ch)                 Returns true if the specified char is a uppercase letter
    toLowerCase(ch)                 Returns the lowercase of the specified char
    toUpperCase(ch)                 Returns the uppercase of the specified char
    For example,
    Code                                                                Displays
    -------------------                                                 -------------------
    System.out.println("isDigit('a') is " + Character.isDigit('a'));    isDigit('a') is false
    System.out.println("isLetter('a') is " + Character.isLetter('a'));  isLetter('a') is true
    System.out.println("isLowerCase('a') is "
      + Character.isLowerCase('a'));                                    isLowerCase('a') is true
    System.out.println("isUpperCase('a') is " 
      + Character.isUpperCase('a'));                                    isUpperCase('a') is true
    System.out.println("toLowerCase('T') is "
      + Character.toLowerCase('T'));                                    toLowerCase('T') is t
    System.out.println("toUpperCase('q') is "
      + Character.toUpperCase('q'));                                    toUpperCase('t') is Q

###### A string is a sequence of characters. Its value is enclosed in matching double quotes ("). Characters are enclosed in single quotes (').
###### Strings are objects. A method that can only be invoked from a specific object is called an instance method. A noninstance method is called a static method, which can be invokved without using an object (i.e. all methods defined in the Math class are static methods).
###### The syntax to invoke an instance method is referenceVariable.methodName(arguments). The syntax to invoke a static method is ClassName.methodName(arguments). For example, Math.pow(2, 2.5).

##### Simple Methods for String Objects
    length()                        Returns the number of characters in this string
    charAt(index)                   Returns the character at the specified index from this string
    concat(s1)                      Returns a new string that concatenates this string with string s1
    toUpperCase()                   Returns a new string with all letters in uppercase
    toLowerCase()                   Returns a new string with all letters in lowercase
    trim()                          Returns a new string with whitespace characters trimmed on both side


##### Get String Length
    String message = "Welcome to Java";
    System.out.println("The length of the " + message + " is " 
      + message.length());                                              The length of Welcome to Java is 15      
[Note: "Welcome to Java".length() is correct and returns 15. "" denotes an empty string and "".length() is 0.]*

##### Get Characters from String
    s.charAt(index) retrieves a specific character in a string s, where index is between 0 and s.length()-1
    
    0  1  2  3  4  5  6  7  8  9  10  11  12  13  14 -- Indices
    W  e  l  c  o  m  e     t  o      J    a   v   a -- message
    ↑                                              ↑
    message.charAt(0)   message.length() is 15     message.charAt(14) 
    
##### Concatenate Strings
    String s3 = s1.concat(s2);
    String s3 = s1 + 2;
    String myString = message + " and " + "HTML";
    
    The + operator can concatenate a number with a string, where the number is converted to a string. 
    At least one operand must be a string for concatenation to take place.
    For example,
    
    String message = "Welcome " + "to " + "Java";     // Three strings are concatenated
    String s = "Chapter" + 2;                         // String Chapter is concatenated with number 2
    String s1 = "Supplement" + 'B';                   // String Supplement is concatenated with char B
    
    If neither operand is a string, the plus sign + is the addition operator that adds two numbers.
    The += operator can also be used for string concatenation.
    For example,
    
    message += " and Java is fun";                    // Displays "Welcome to Java and Java is fun"
    
    If i = 1 and j = 2,
    System.out.println("i + j is " + i + j);          // Displays "i + j is 12"
    System.out.println("i + j is " + (i + j);         // Displays "i + j is 3"
    
##### Convert Strings
    "Welcome".toLowerCase()   returns a new string welcome
    "Welcome".toUpperCase()   returns a new string WELCOME
    "\t Good Night \n".trim() returns a new string Good Night // trim() eliminates whitespace characters

##### Read a String from Console
###### To read a string from the console invoke the next() method on a Scanner object. The next() method reads a string that ends with a whitespace character. Use nextLine() method to read an entire line of text that ends with the *Enter* key pressed. Methods next(), nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble() are token-based input. nextLine() method is line-based input.

For example,
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three words separated by spaces: ");
    String s1 = input.next();
    String s2 = input.next();
    String s3 = input.next();
    System.out.println("s1 is " + s1);
    System.out.println("s2 is " + s2);
    System.out.println("s3 is " + s3);
    
    Displays
    Enter three words separated by spaces:
    s1 is Welcome
    s2 is to
    s3 is Java
    ------------------------------------------
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a line: ");
    String s = input.nextLine();
    System.out.println("The line entered is " + s);
    
    Displays
    Enter a line: Welcome to Java
    The line entered is Welcome to Java

##### Read a Character from Console
To read a character from the console, use the nextLine() method to read a string and then invoke charAt(0) method on the string to return a character.
For example,

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    System.out.println("The character entered is " + ch);

##### Comparing Strings
    Method                          Description
    -------------------             -------------------
    equals(s1)                      Returns true if this string is equal to string s1
    equalsIgnoreCase(s1)            Returns true i this string is equal to string s1; it is case insensitive
    compareTo(s1)                   Returns an int greater than 0, equal to 0, or less than 0 indicating this string is greater, equal, or less than s1
    compareToIgnoreCase(s1)         Same as compareTo except that the comparison is case insensitive
    startsWith(prefix)              Returns true if this string starts with the specified prefix
    endsWith(suffix)                Returns true if this string ends with the specified suffix
    contains(s1)                    Returns true if s1 is a substring in this string
Note: The == operator only checks whether string1 and string2 refer to the same object, not whether they have the same contents. Use the equals method instead.
Note: If s1 is abc and s2 is abg, s1.compareTo(s2) returns -4. The values are compared lexicographically. The first two characters (a vs. a) from s1 and s2 are compared and because they're equal, the second characters (b vs. b) are compared. Because they're equal, the third characters (c vs. g) are compared. c is 4 less than g, so the comparison returns -4.
Note: The equals method returns true if two strings are equal and false if they're not. compareTo returns 0, a positive int, or negative int depending on whether one string is equal to, greater, or less than the other string.

##### Obtaining Substrings
    Method                          Description
    -------------------             -------------------
    substring(beginIndex)           Returns this string's substring that begins with the character at the specified beginIndex and extends
                                    to the end of the string
    substring(beginIndex, endIndex) Returns this string's substring that begins at the specified beginIndex and extends to the character at
                                    at index endIndex - 1. Note the character at endIndex is not part of the substring.
    For example,
    
    String message = "Welcome to Java";
    String message = message.substring(0, 11) + "HTML";
    The string message now becomes Welcome to HTML
    
    0  1  2  3  4  5  6  7  8  9  10  11  12  13  14 -- Indices
    W  e  l  c  o  m  e     t  o      J    a   v   a -- message
    ↑______________________________↑  ↑____________↑
        message.substring(0, 11)          message.substring(11)

##### Finding a Character or Substring in a String
    Method                          Description
    -------------------             -------------------
    index Of (ch)                   Returns the index of the first occurence of ch in the string. Returns -1 if not matched
    indexOf(ch, fromIndex)          Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if not matched
    indexOf(s)                      Returns the index of the first occurrence of string s in this string. Returns -1 if not matched
    indexOf(s, from Index)          Returns the index of the first occurrence of string s in this string after fromIndex. Returns -1 if not matched
    lastIndexOf(ch)                 Returns the index of the last occurrence of ch in the string. Returns -1 if not matched
    lastIndexOf(ch, fromIndex)      Returns the index of the last occurrence of ch before fromIndex in this string. Returns -1 if not matched
    lastIndexOf(s)                  Returns the index of the last occurrence of string S. Returns -1 if not matched
    lastIndexOf(s, fromIndex)       Returns the index of the last occurrence of string s before fromIndex. Returns -1 if not matched
    For example,
    
    [indexOf]
    "Welcome to Java".indexOf('W')        returns 0
    "Welcome to Java".indexOf('o')        returns 4
    "Welcome to Java".indexOf('o', 5)     returns 9
    "Welcome to Java".indexOf("come")     returns 3
    "Welcome to Java".indexOf("Java", 5") returns 11
    "Welcome to Java".indexOf("java", 5") returns -1
    
    [lastIndexOf]
    "Welcome to Java".lastIndexOf('W')        returns 0
    "Welcome to Java".lastIndexOf('o')        returns 9
    "Welcome to Java".lastIndexOf('o', 5)     returns 4
    "Welcome to Java".lastIndexOf("come")     returns 3
    "Welcome to Java".lastIndexOf("Java", 5)  returns -1
    "Welcome to Java".lastIndexOf("Java")     returns 11
    
##### Finding a Character or Substring in a String
Convert a numeric string into a number. Integer:
    int intValue = Integer.parseInt(intString);
    
    intString is a numeric string such as "123"
Double:
    double doubleValue = Double.parseDouble(doubleString)
    
    doubleString is a numeric string such as "123.45"
If the string is not a numeric string, the conversion causes a runtime error.
Convert a number into a string; simply use the string concatenating operator +
    String s = number + "";

##### Formatting Console Output
The f in printf stands for formatted.
    System.out.printf(format, item1, item2, . . ., itemk);
    
    where format is a string that may consist of substrings and format specifiers.
A format specifier specifies how an item should be formatted. An item may be a numeric value, character, Boolean value, or a string.
    Frequently Used Format Specifiers
    Format Specifier      Output                                Example
    ----------------      -----------------------------------   ------------------
    %b                    A Boolean value                       True or false
    %c                    A character                           'a'
    %d                    A decimal integer                     200
    %f                    A floating-point number               45.460000
    %e                    A number in std. scientific notation  4.556000e+01
    %s                    A string                              "Java is cool"
    For example,
    
    int count = 5;
    double amount = 45.56;
    System.out.printf("count is %d and amount is %f", count, amount);
    
    Note: Items must match the format specifiers in order, in number, and in exact type.
    
    Examples of Specifying Width and Precision
    Example               Output
    --------------------  -------------------------------------------------------------------------------------------
    %5c                   Output the character and add four spaces before the character item, because the width is 5.
    %6b                   Output the Boolean value and add one space before the false value and two spaces before the
                          true value.
     %5d                  Output the integer item with width 5. If the number of digits in the item is < 5, add spaces
                          before the number. If the number of digits in the item is > 5, the width is auto increased.
     %10.2f               Output the floating-point item with width 10 including a decimal point and two digits after
                          the point. Thus there are seven digits allocated before the decimal point. If the number of
                          digits before the decimal point in the item is < 7, add spaces before the number. If the
                          number of digits before the decimal point in the item is > 7, the width is auto increased.
     %10.2e               Out the floating-point item with width 10 including a decimal point, two digits after the
                          point and the exponent part. If the displayed number in scientific notation has width < 10,
                          add spaces before the number.
     %12s                 Output the string with width 12 characters. If the string item has fewer than 12 characters
                          add spaces before the string. If the string item has more than 12 characters, the width is
                          auto increased.
Adding a comma in front of a number specifier displays a number with a comma. For example,
    System.out.printf("%,8d %,10.1f\n", 12345678, 2345678.263);
    
    displays:
    
    12,345,678 12,345,678.3
Add a 0 in front of a number specifier to pad a number with leading zeros rather than space. For example,
    System.out.printf("%08d %08.1f\n", 1234, 5.63);
    
    displays:
    
    00001234 000005.6
By default, output is right justified. A minus sign (-) in the format specifier will specify that the item is left justified. For example,
    System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
    System.out.printf("%-8d%-8s%-8.1f \n", 1234, "Java", 5.63);
    
    displays:
    <-----8-----><-----8-----><-----8----->
     [][][][]1234 [][][][]Java [][][][]5.6
     1234[][][][] Java[][][][] 5.6[][][][]
 Items must match the format specifiers in exact type. The item for the format specifier %f or %e must be a floating-point type value such as 40.0 not 40. Int cannot match %f or %e. %.2f can specify a floating-point value with two digits after the decimal point. However %0.2f is incorrect.
To output a literal use %%.
