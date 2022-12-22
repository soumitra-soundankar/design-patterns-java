## Decorator Design Pattern

***Definition*** : Attach additional responsibilities to an object dynamically. Decorator provide a flexible alternative to subclassing excluding functionality.

***OO Principles*** : 
1. Encapsulate what varies.
2. Favor composition over inheritance. 
3. Program to interfaces, not implementation.
4. Strive for loosely coupled design between objects that interact.
5. ***Class Should be open for extension but closed for modification.***

***Example*** :
Laptop, consider you are assembling a laptop. All laptop has basic things like processor, ram, display, ports and Operating System.
On top of that some laptops has additional addons like graphics card, touch display, backlit, tablet mode, some laptop runs on a windows and some are on linux and so on.
So all addons are nothing but the decorators for a laptop.

***Tips*** :
1. We can have a base component and decorator base component as an interface or an abstract class.
2. Multiple variation of base component will inherit base component and implement default methods.
3. Decorator component should inherit base component and Decorator component should have base component reference.
4. Each decorator should handle previous state for an object before assigning new state.

***Disadvantages*** :
1. May result into multiple small object and overuse of those can be complex.