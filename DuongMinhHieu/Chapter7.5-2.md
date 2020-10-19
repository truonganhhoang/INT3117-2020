# For the following questions a–c, consider the FSM that models a (simplified) programmable thermostat. Suppose the variables that define the state and the methods that transition between states are:
* (a) How many states are there?
* (b) Draw and label the states (with variable values) and transitions (with method names). Notice that all of the methods are total, that is, their behaviors are defined for all possible inputs.
* (c) A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.

* (a) Ta có 2 biến: `partOfDay: {Wake, Sleep}` và `temp: {Low, High}`, mỗi biến có 2 giá trị và các biến này định nghĩa trạng thái nên ta có tất cả 2*2 = 4 trạng thái.

* (b) Link: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (c) Tập kiểm thử thỏa mãn bao phủ cạnh là:
t1 = up(), advance(), down(), advance(), advance(), up(), advance(), down().