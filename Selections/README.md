## Chapter 3: Selections
###### Introduction to Java Programming and Data Structures by Y. Daniel Liang
### Key Notes
###### Selection statements are used for alternative courses of action: one-way if statements, two-way if-else statements, nested if statements, multi-way if-else statements, switch statements, and conditional operators. if statements make control decisions based on Boolean expressions. Based on the true or false evaluation, if statements take a possible course.
###### A boolean-type variable stores a true or false value. The relational operators (<, <=, ==, !=, >, >=) yield a Boolean value. Boolean operators (&&, !!, !, ^) operate with Boolean values and variables.
###### && and || are referred to as short-circuit/lazy AND operator and short-circuit/lazy OR operator respectively. When evaluating x && y, Java evaluates x first and y second if x is true. When evaluating x || y, Java evaluates y if x is false.
###### Switch statements have expression types: char, byte, short, int, or String. The break keyword in a switch statement is optional, but it's normally used at the end of each case in order to skip the remainder of the switch statement. If the break statement is not present, the next case statement will be executed.

    switch (switch-expression) {
      case value1: conditional statement; break;
      case value2: conditional statement; break;
      case value3: conditional statement; break;
      case value4: conditional statement; break;
      case value5: conditional statement;
    }

###### The symbols ? and : appearing together is a conditional operator or ternary operator because it uses three operands.
    boolean-expression ? expression1 : expression2
    If boolean-expression is true, the result is expression1. Otherwise, expression2
    
    max = (num1 > num2) ? num1 : num2;
    
###### Operators are evaluated in order of parentheses, operator precedence, and operator associativity. All binary operators except assignment operators are left associative; assignment operators are right associative.
    Precedence:
        var++ and var-- (Postfix)
        +, - (Unary plus and minus, ++var and --var (Prefix)
        (type)(Casting)
        !(Not)
        *, /, % (Multiplication, division, remainder)
        +, - (Binary addition and subtraction)
        <, <=, >, >= (Relational)
        ==, != (Equality)
        ^ (Exclusive OR)
        && (AND)
        || (OR)
        =, +=, -=, *=, /=, %= (Assignment operators)
