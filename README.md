# Re-try-Operation

This is an implementation of a re[try-catch] Operation.
Some times, a block of code is throwing an exception, and we need to re try this block.
The first idea is to call the operation that failed, in the catch block.
What if the block fails again...? We could surround the whole idea in a while loop.
This is a basic approach. However, in order to make it more generic the idea of creating a method came up.

#### Example of Use:
Imagine two threads running in parallel. 
The first is raising a server url, and the second needs the verification that the server is up and running in order to continue.

#### What is used:
* Functional Interface, lambda expressions can be used (Java SE 8).
* Time Api, for the time tracking of the operation that is retried (Java SE 8).
