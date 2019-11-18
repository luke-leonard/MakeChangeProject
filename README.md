# Make Change

### Overview
Create a program that takes in the cost of an item and an amount payed by a costumer and return the change back. It also will tell the user if they are under and will tell the user if they have exact change.

### Concepts
- Classes
- Methods
- Arrays
- User I/O
- Formatting strings

### Technologies Used
- Eclipse
- Java
- Git
- Classes
- Methods
- Arrays

### Lessoned Learned
This lab was a good test of my ability to write flexible and efficient code. I challenged myself to go above the prompted and make code that would easily be expandable for any other denominations of coin.
  
One of the things that really helped me out was that I treated money as an integer instead of a floating point number. Even though money is measured with a decimal place, It can also be represented as an integer number of cents. By performing this operation, it made calculating the change needed as simple as division and modulus operations.

I decided to use a class just as a small packet to store each currency with a few print functions. This allowed me to store all the information I needed in one small packet and fill an array with it. That allows me to add any amount of currency by simply inputing a name and a value. 

The other benefit to this was the ability to add plural logic into my code. With a simple print statement, and a terinary operator, I can output a different string weather the change due is plural or singular and spell the plural correctly.