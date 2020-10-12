2. For the following questions a–c, consider the FSM that models a
(simplified) programmable thermostat. Suppose the variables that
define the state and the methods that transition between states are:
(a) How many states are there?
(b) Draw and label the states (with variable values) and transitions
(with method names). Notice that all of the methods are total,
that is, their behaviors are defined for all possible inputs.
(c) A test case is simply a sequence of method calls. Provide a test
set that satisfies Edge Coverage on your graph.

(a)
There are 4 states.

(b)
 
      1 <----> 2
      ∧^      ^∧
      | \    / |
      |  \  /  |
      |   \/   |
      |   /\   |
      |  /  \  |
      v V    V v
      3 <----> 4
 
(1) : (Wake, Low)
(2) : (Wake, High)
(3) : (Sleep, Low)
(4) : (Sleep, High)

(c)
The test case is: [1,2,1,4,1,3,2,4,3,4,2,3,1].

