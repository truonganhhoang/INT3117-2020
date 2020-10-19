Dùng máy hữu hạn trạng thái **Memory Seat**, hoàn thiện bộ kiểm thử cho CACC

* **a**
* Chuyển đổi: 1 -> 2
* Thuộc tính: Button2 ^ (Gear = Park v ignition = off)
* Giá trị cho trước: Gear = Park, Button1

Test Case Value|P|Post-state
-|-|-
Button2 ^ (Gear != Park ^ ignition = on)|T|infeasible
Button1 ^ (Gear = Park ^ ignition = on)|T|infeasible
Button2 ^ (Gear != Park ^ ignition = on)|F|1
Button1 ^ (Gear = Park ^ ignition = on)|F|1
Button2 ^ (Gear = Park ^ ignition = on)|T|2
Button2 ^ (Gear != Park ^ ignition = on)|T|2
Button1 ^ (Gear = Park ^ ignition = on)|F|1
Button1 ^ (Gear != Park ^ ignition = on)|F|1
Button2 ^ (Gear = Park ^ ignition = on)|T|2
Button2 ^ (Gear = Park ^ ignition = off)|T|2
Button1 ^ (Gear = Park ^ ignition = on)|T|1
Button1 ^ (Gear = Park ^ ignition = off)|T|1

* **b**
* Chuyển đổi: 1 -> 3
* Thuộc tính: sideMirrors ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1

Test Case Value|P|Post-state
-|-|-
sideMirrors ^ ignition = off|T|infeasible
ignition = off|T|infeasible
sideMirrors ^ ignition = off|F|1
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|1
ignition = off|F|1

* **c**
* Chuyển đổi: 1 -> 3
* Thuộc tính: seatBottom ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1

Test Case Value|P|Post-state
-|-|-
seatBottom ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBottom ^ ignition = off|F|1
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|1
ignition = off|F|1

* **d**
* Chuyển đổi: 1 -> 3
* Thuộc tính: lumbar ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1

Test Case Value|P|Post-state
-|-|-
lumbar ^ ignition = off|T|infeasible
ignition = off|F|infeasible
lumbar ^ ignition = off|T|1
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|F|infeasible
ignition = on|T|1
ignition = off|F|1

* **e**
* Chuyển đổi: 1 -> 3
* Thuộc tính: seatBack ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1

Test Case Value|P|Post-state
-|-|-
seatBack ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBack ^ ignition = off|F|1
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|1
ignition = off|F|1

* **f**
* Chuyển đổi: 2 -> 1
* Thuộc tính: Button1 ^ (Gear = Park v ignition = off)
* Giá trị cho trước: Gear = Park, Button2

Test Case Value|P|Post-state
-|-|-
Button1 ^ (Gear = Park ^ ignition = on)|T|infeasible
Button2 ^ (Gear != Park ^ ignition = on)|F|infeasible
Button1 ^ (Gear != Park ^ ignition = on)|F|2
Button2 ^ (Gear != Park ^ ignition = on)|F|2
Button1 ^ (Gear = Park ^ ignition = on)|T|1
Button1 ^ (Gear != Park ^ ignition = off)|T|1
Button1 ^ (Gear = Park ^ ignition = on)|F|2
Button1 ^ (Gear != Park ^ ignition = on)|F|2
Button1 ^ (Gear = Park ^ ignition = on)|T|1
Button1 ^ (Gear = Park ^ ignition = off)|T|1
Button1 ^ (Gear = Park ^ ignition = on)|F|2
Button1 ^ (Gear = Park ^ ignition = off)|F|2

* **g**
* Chuyển đổi: 2 -> 3
* Thuộc tính: sideMirrors ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2

Test Case Value|P|Post-state
-|-|-
sideMirrors ^ ignition = off|T|infeasible
ignition = off|T|infeasible
sideMirrors ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|2
ignition = off|F|2

* **h**
* Chuyển đổi: 2 -> 3
* Thuộc tính: seatBottom ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2

Test Case Value|P|Post-state
-|-|-
seatBottom ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBottom ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|2
ignition = off|F|2

* **i**
* Chuyển đổi: 2 -> 3
* Thuộc tính: lumbar ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2

Test Case Value|P|Post-state
-|-|-
lumbar ^ ignition = off|T|infeasible
ignition = off|T|infeasible
lumbar ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|2
ignition = off|F|2

* **j**
* Chuyển đổi: 2 -> 3
* Thuộc tính: seatBack ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2

Test Case Value|P|Post-state
-|-|-
seatBack ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBack ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|2
ignition = off|F|2

* **k**
* Chuyển đổi: 3 -> 1
* Thuộc tính: Button1 ^ (Gear = Park v ignition = off)
* Giá trị cho trước: Gear = Park, Button1, ignition=on, sideMirrors

Test Case Value|P|Post-state
-|-|-
Button1 ^ (Gear != Park ^ ignition = on)|T|infeasible
Button2 ^ (Gear != Park ^ ignition = on)|T|infeasible
Button1 ^ (Gear != Park ^ ignition = on)|F|3
Button2 ^ (Gear != Park ^ ignition = on)|F|3
Button1 ^ (Gear = Park ^ ignition = on)|T|1
Button1 ^ (Gear != Park ^ ignition = off)|T|1
Button2 ^ (Gear = Park ^ ignition = on)|F|2
Button2 ^ (Gear != Park ^ ignition = on)|F|3
Button1 ^ (Gear = Park ^ ignition = on)|T|1
Button1 ^ (Gear = Park ^ ignition = off)|T|1
Button2 ^ (Gear = Park ^ ignition = on)|F|2
Button2 ^ (Gear = Park ^ ignition = off)|F|2

* **l**
* Chuyển đổi: 3 -> 2
* Thuộc tính: Button2 ^ (Gear = Park v ignition = off)
* Giá trị cho trước: Gear = Park, Button1, ignition=on, sideMirrors

Test Case Value|P|Post-state
-|-|-
Button2 ^ (Gear != Park ^ ignition = on)|T|infeasible
Button1 ^ (Gear != Park ^ ignition = on)|T|infeasible
Button2 ^ (Gear != Park ^ ignition = on)|F|3
Button1 ^ (Gear != Park ^ ignition = on)|F|3
Button2 ^ (Gear = Park ^ ignition = on)|T|2
Button2 ^ (Gear != Park ^ ignition = on)|T|3
Button1 ^ (Gear = Park ^ ignition = on)|F|1
Button1 ^ (Gear != Park ^ ignition = on)|F|3
Button2 ^ (Gear = Park ^ ignition = on)|T|2
Button2 ^ (Gear = Park ^ ignition = off)|T|2
Button1 ^ (Gear = Park ^ ignition = on)|F|1
Button1 ^ (Gear = Park ^ ignition = off)|F|1

* **m**
* Chuyển đổi: 3 -> 4
* Thuộc tính: Reset ^ Button1 ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition=on, sideMirrors

Test Case Value|P|Post-state
-|-|-
Reset ^ Button1 ^ ignition = off|T|infeasible
Button1 ^ ignition = off|T|infeasible
Reset ^ Button1 ^ ignition = off|F|3
Button1 ^ ignition = off|F|1
Reset ^ Button1 ^ ignition = off|T|infeasible
Reset ^ ignition = off|T|infeasible
Reset ^ Button1 ^ ignition = off|F|3
Reset ^ ignition = off|F|3
Button1 ^ ignition = on|T|infeasible
Button1 ^ ignition = off|T|infeasible
Button1 ^ ignition = on|F|1
Button1 ^ ignition = off|F|1

* **n**
* Chuyển đổi: 3 -> 5
* Thuộc tính: Reset ^ Button2 ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition=on, sideMirrors

Test Case Value|P|Post-state
-|-|-
Reset ^ Button2 ^ ignition = off|T|infeasible
Button2 ^ ignition = off|T|infeasible
Reset ^ Button2 ^ ignition = off|F|3
Button2 ^ ignition = off|F|2
Reset ^ Button2 ^ ignition = off|T|infeasible
Reset ^ ignition = off|T|infeasible
Reset ^ Button2 ^ ignition = off|F|3
Reset ^ ignition = off|F|3
Button2 ^ ignition = on|T|infeasible
Button2 ^ ignition = off|T|infeasible
Button2 ^ ignition = on|F|2
Button2 ^ ignition = off|F|2

* **o**
* Chuyển đổi: 4 -> 1
* Thuộc tính: ignition = off
* Giá trị cho trước: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1

Test Case Value|P|Post-state
-|-|-
ignition = off|T|1
ignition = on|F|4

* **p**
* Chuyển đổi: 4 -> 3
* Thuộc tính: sideMirrors ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1

Test Case Value|P|Post-state
-|-|-
sideMirrors ^ ignition = off|T|infeasible
ignition = off|T|infeasible
sideMirrors ^ ignition = off|F|3
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|4
ignition = off|F|1

* **q**
* Chuyển đổi: 4 -> 3
* Thuộc tính: seatBottom ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1

Test Case Value|P|Post-state
-|-|-
seatBottom ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBottom ^ ignition = off|F|3
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|4
seatBottom ^ ignition = off|F|1

* **r**
* Chuyển đổi: 4 -> 3
* Thuộc tính: lumbar ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1

Test Case Value|P|Post-state
-|-|-
lumbar ^ ignition = off|T|infeasible
ignition = off|T|infeasible
lumbar ^ ignition = off|F|3
lumbar ^ ignition = off|F|1
lumbar ^ ignition = on|T|infeasible
ignition = off|T|infeasible
lumbar ^ ignition = on|F|4
lumbar ^ ignition = off|F|1

* **s**
* Chuyển đổi: 4 -> 3
* Thuộc tính: seatBack ^ ignition = on
* Giá trị cho trước: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1

Test Case Value|P|Post-state
-|-|-
seatBack ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBack ^ ignition = off|F|1
ignition = off|F|1
ignition = on|T|infeasible
ignition = off|T|infeasiable
ignition = on|F|4
ignition = off|F|1

* **t**
* Chuyển đổi: 5 -> 2
* Thuộc tính: ignition = off
* Giá trị cho trước: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2

Test Case Value|P|Post-state
-|-|-
ignition = off|T|2
ignition = on|F|5

* **u**
* Chuyển đổi: 5 -> 3
* Thuộc tính: sideMirrors ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2

Test Case Value|P|Post-state
-|-|-
sideMirrors ^ ignition = off|T|infeasible
ignition = off|T|infeasible
sideMirrors ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|5
ignition = off|F|2

* **v**
* Chuyển đổi: 5 -> 3
* Thuộc tính: seatBottom ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2

Test Case Value|P|Post-state
-|-|-
seatBottom ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBottom ^ ignition = off|F|2
ignition = off|F|2
seatBottom ^ ignition = on|T|infeasible
ignition = off|T|infeasible
seatBottom ^ ignition = on|F|5
seatBottom ^ ignition = off|F|2

* **w**
* Chuyển đổi: 5 -> 3
* Thuộc tính: lumbar ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2

Test Case Value|P|Post-state
-|-|-
lumbar ^ ignition = off|T|infeasible
ignition = off|T|infeasible
lumbar ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|5
ignition = off|F|2

* **x**
* Chuyển đổi: 5 -> 3
* Thuộc tính: seatBack ^ ignition = on
* Giá trị cho trước: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2

Test Case Value|P|Post-state
-|-|-
seatBack ^ ignition = off|T|infeasible
ignition = off|T|infeasible
seatBack ^ ignition = off|F|2
ignition = off|F|2
ignition = on|T|infeasible
ignition = off|T|infeasible
ignition = on|F|5
ignition = off|F|2
