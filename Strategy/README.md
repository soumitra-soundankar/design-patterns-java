## Strategy Design Pattern

***Definition*** : This defines family of algorithms, encapsulate those and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

***OO Principles*** : 
1. Encapsulate what varies.
2. Favor composition over inheritance. 
3. Program to interfaces, not implementation.

***Example*** :
There are Characters like King, Queen, Knight and Troll. Each has own preferences of weapon, each weapon has it own method to use it in fights.

Here what are families of algorithms
1. Character : there are multiple characters 
2. Weapon : there are multiple weapons

***Tips*** :
1. Make behaviour as an Interface in this case Weapon
2. Make model as an Abstract class in this case Character
3. Abstract class _HAS-A_ Interface Reference

