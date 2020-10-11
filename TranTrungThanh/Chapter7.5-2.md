>For the following questions a–c, consider the FSM that models a
 (simplified) programmable thermostat. Suppose the variables that
 define the state and the methods that transition between states are:

>```
>partOfDay : {Wake, Sleep}
>temp : {Low, High}
>// Initially "Wake" at "Low" temperature
>// Effects: Advance to next part of day
>public void advance();
>// Effects: Make current temp higher, if possible
>public void up();
>// Effects: Make current temp lower, if possible
>public void down();
>```
>
>(a) How many states are there?\
 (b) Draw and label the states (with variable values) and transitions
 (with method names). Notice that all of the methods are total,
 that is, their behaviors are defined for all possible inputs.\
 (c) A test case is simply a sequence of method calls. Provide a test
 set that satisfies Edge Coverage on your graph.


(a)
4 trạng thái: { (Wake, Low), (Wake, High), (Sleep, Low), (Sleep, High) }

(b)
Trạng thái khởi đầu: A
1. ```advance()```: A → C
2. ```advance()```: B → D
3. ```advance()```: C → A
4. ```advance()```: D → B
5. ```up()``` : A → B
6. ```up()``` : B → B
7. ```up()``` : C → D
8. ```up()``` : D → D
9. ```down()``` : A → A
10. ```down()``` : B → A
11. ```down()``` : C → C
12. ```down()``` : D → C

(c)
Bắt đầu ở trạng thái A\
-> ```down()``` - đi qua cạnh 9 đến trạng thái A\
-> ```advance()``` - đi qua cạnh 1 đến trạng thái C\
-> ```down()``` - đi qua cạnh 11 đến trạng thái C\
-> ```up()``` - đi qua cạnh 7 đến trạng thái D\
-> ```up()``` - đi qua cạnh 8 đến trạng thái D\
-> ```advance()``` - đi qua cạnh 4 đến trạng thái B\
-> ```up()``` - đi qua cạnh 6 đến trạng thái B\
-> ```down()``` - đi qua cạnh 10 đến trạng thái A\
-> ```up()``` - đi qua cạnh 5 đến trạng thái B\
-> ```advance()``` - đi qua cạnh 2 đến trạng thái D\
-> ```down()``` - đi qua cạnh 12 đến trạng thái C\
-> ```up()``` - đi qua cạnh 3 đến trạng thái A\