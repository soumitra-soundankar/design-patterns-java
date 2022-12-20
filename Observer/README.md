## Observer Design Pattern

***Definition*** : Observer defines one to many relationship between objects so that one object state gets changed, all its dependent should be notified and updated.


***OO Principles*** : 
1. Encapsulate what varies.
2. Favor composition over inheritance. 
3. Program to interfaces, not implementation.
4. Strive for loosely coupled design between objects that interact.

***Example*** :
New Paper publishing house.
There can be multiple Subscriber for a publishing house for e.g. TimeIndia has Subscribers like hotels, companies, individuals, businesses.
Subscriber are nothing but observers and Publishing house is nothing but Publisher which publishes new edition. When publishing house publishes new edition all its subscriber should be notified.

***Tips*** :
1. A Subject interface should be there which will have register, deregister, notify method
2. A Concrete implementation of Subject interface which will call notify for all Observers 
3. An Observer Interface which will have single method called update
4. Each Observer will have its concrete implementation which will implements Observer's update method to update class variables

