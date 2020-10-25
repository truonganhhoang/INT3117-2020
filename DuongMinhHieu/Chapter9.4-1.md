# Translate the following SMV machine into a finite state machine.
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

# Trả lời:
* Link đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu>.