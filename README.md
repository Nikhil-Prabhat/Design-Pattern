## What is Design Pattern
Design patterns are the well proven solutions of commonly occurring problems in software designs. Let’s take an example, suppose there comes a problem while development and we have 4 developers available to fix that problem. Each developer will have his own way to fix that problem and it can probably be the best solution, but we are not sure of it. Hence to fix the commonly occurring problem in software design, the solutions are already available and those are commonly used.

## Categorisation of Design Pattern
- Creational Design Pattern (Deals with the creation of object)
  - Factory Pattern
  - Builder Pattern
  - Singleton Pattern
  - Prototype Pattern

- Structural Design Pattern (Deals with the structure of code)
   - Proxy Pattern
   - Adapter Pattern
  
- Behavioral Design Pattern (Deals with the behavior of the objects, how different objects interact with each other)
  - Observer Pattern
  - Iterator Pattern
  - State Pattern

## Singleton Design Pattern
This pattern is used when we want to use the same instance of the object everytime whenever we are creating the object.

## Factory Method Design Pattern
It is used when there is a superclass and multiple subclasses and we want to get object of subclasses based on input and requirement. Then we create factory class which takes the responsibility of creating object of class based on input. 

#### Advantages
- Focus on creating objects for interface rather than implementation.
- Loose coupling, more robust code

## Abstract Factory Design Pattern
This is the extension of the above design pattern. In this design pattern, we just add one extra layer of abstraction and even the factory method that we are calling to get the objects, is not aware about how the objects are created. It is dependent on the other classes for the object creation.

## Builder Design Pattern
It is helpful while creating objects which are having  many attributes. There are many problems which this design pattern fixes :
- We have pass many arguments to create objects. We don’t need to remember any sequence
- Some parameters might be optional.
- Factory class takes all responsibility for creating objects. If the object is heavy, then all complexity is the part of the factory class.
- It is basically used to create immutable class.

So in builder pattern, we create objects step by step and finally return final object with desired values of attributes.

## Prototype Design Pattern
The concept is to copy an existing object rather than creating new instances from scratch because creating new objects may be costly. This approach saves costly resources and time, especially when object creation is a heavy process. It also comes under structural design pattern.
For example – Database Connection
This can be achieved by cloning the existing object and reusing it.
- Shallow Copy : Let’s suppose the object we want to clone is also having one object. So in this, be default, if we clone the former object, the address reference of the latter is actually stored in the  cloned object, instead of the new object. In simple words, if there is any change in the latter object, those changes will be reflected in all the cloned objects.
- Deep Copy : It is the opposite case of the above mentioned case. If the object is cloned, then, the new objects will be there with the exactly same values of the latter objects. For this, we need to add some custom logic.

## Observer Design Pattern
It is an behavioral design pattern. In this design pattern, when the subject changes its state, all the dependent objects get the notification for this. One to many relation. Kind of implementation in event  driven architecture.

## Iterator Design Pattern
The iterator design pattern provides a way to access the elements of an object without exposing its underlying implementation. Suppose if we different data structures, their traversal methods will be different. This design pattern enables us to provide the same way of traversal for even different data structures.

## Adapter Design Pattern
This comes under structural design pattern. It mainly focuses on creating a workaround feature to support two different features by utilising themselves only.
