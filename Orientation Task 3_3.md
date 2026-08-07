# Orientation Task 3-3
## Question 
Why can't a Singleton object be created from outside the Singleton class using the new operation?

## Answer 

The purpose of Singleton is the following:
- Declaring the constructor with a private access modifier restricts visibility.
- The compiler denies permission to any external class attempting to call a private constructor.
- Only code residing inside the boundaries of the Singleton class itself can execute the new operation

The reason why a Singleton object can't be created from outside the Singleton class using the new operation 
is because the purpose of Singleton is to ensure that the class has only one instance throughout the application.
Therefore It forces clients to request the object through a dedicated global gateway, typically a public static method like getInstance().

