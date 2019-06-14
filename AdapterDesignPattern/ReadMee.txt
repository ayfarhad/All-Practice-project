Adapter design pattern to use to communicate two different Interface when we no need all method of those interface.
Suppose College Interface and School interface are there and they contain some method. Those two method have different 
implementation class. Now we have a requirement that we no need all method of college Interface but we need to all method of school interface.

Solution:
	We can create a class of schoolImplementation. if we want to implement both then we need to implement all method of College interface which is not required at all. Thats why Adapter design pattern comes to the picture.
	