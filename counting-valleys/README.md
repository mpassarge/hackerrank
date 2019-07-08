#Counting Valleys

A hiker takes __n__ number of steps in a hike. Each step they either go uphill(U) or downhill(D). Find out how many valleys the hiker has traversed.

Write a method that takes n(the number of steps taken), and s(a String representing the direction of each step)

Example:

__Input__ 8, "UDDDUDUU"

__Output__ 1

[Problem Statement](counting-valleys.pdf)

## What did I learn?

* Sometimes overthinking the solution wastes time. 
    * I spent about 30 to 40 minutes trying to solve this solution with a Stack
    but realized that a Stack is LIFO(Last In First Out), which would only work if
    I added these array items in backwards. 
* Read documentation before trying to implement a different Data Structure
    * (Same as above)