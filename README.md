# IntegrationsTesting

## Choosing of testing approach 
	
There are a bunch of ways to do integration testing, some notables are:
	
In the big-bang approach, most of the developed modules are coupled together to form 
a complete software system or major part of the system and then used for integration testing. 
This method is very effective for saving time in the integration testing process. However,
if the test cases and their results are not recorded properly, the entire integration process
will be more complicated and may prevent the testing team from achieving the goal of integration testing.(From Wikipedia)
	
The Bottom-Up approach - is the testing approach where the smallest components are tested first and afterwards used
to test the larger parts of the systems afterwards. You slowly move up a level after having tested the previous, thus the name. 
That way we will know what component level has the issues when it comes to integration. It also makes it easier to keep track of
how much of the system is tested (code coverage). 
	
The Top-Down testing approach is where the top level is tested and afterwards you move out in different branches until you reach the "bottom". 
	
Sandwich testing combines both Top-Down and Bottom-Up.
	
Personally I chose the Bottom-Up testing approach utilizing the black box technique - that way I only keep track of the input and output. 
	
## The Test
	
To test the system we need to test each element one at a time to be sure that everything.
	
Firstly the connection between the Database and Data Layer has to be tested since it's the lowest layer that is required for the remaining to work.

Secondly we move up a layer where we need to make sure the Data Layer also works with the next layer; Service. 

As the last thing we need to connect the Service Layer with the upper most layer; the User Interface Layer.

Solution can be found [here](https://github.com/MartinH5/IntegrationsTesting/blob/master/test/glarmesterIT/GlarmesterIT.java). 
