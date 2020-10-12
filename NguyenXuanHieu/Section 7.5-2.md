# Section 7.5-2

# For the following questions a{c, consider the FSM that models a (simplified) programmable thermostat. Suppose the variables that define the state and the methods that transition between states are:
partOfDay : {Wake, Sleep}

temp : {Low, High}

// Initially "Wake" at "Low" temperature

// Effects: Advance to next part of day

public void advance();

// Effects: Make current temp higher, if possible

public void up();

// Effects: Make current temp lower, if possible

public void down();

a, How many states are there?

- có 4 trạng thái ở đây, đó là sự pha trộn của partOfDay và temp: 
    
    + {wake, low}
    + {wake, high}
    + {sleep, low}
    + {sleep, high}
     
b, Draw and label the states (with variable values) and transitions (with method names).
Notice that all of the methods are total.

c, A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.