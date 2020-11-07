# Chuyển máy trạng thái thành máy SMV
```java
MODULE main
#define false 0
#define true 1
VAR
	x, y : boolean;
ASSIGN
	init (x) := true;
	init (y) := true;

	next (x) := case
	x & y : false;
	x : true;
	!x & y : false;
	!x & !y : true
	true : x;
	esac;

	next (y) := case
	!x & y : false
	y : true
	!y : false
	true : y;
	esac;
```