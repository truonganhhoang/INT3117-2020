# Translate the following finite state machine into an SMV machine.
TF -> FT -> FF -> TT -> TT.

# Trả lời:
* SMV machine:
```java
MODULE main
#define false 0
#define true 1
VAR
	x, y: boolean;
ASSIGN
	init(x) := true;
	init(y) := false;

	next(x) := case
	!x & y: false;
	x: x;
	!x & !y: true;
	!x: true;
	esac;

	next(y) := case
	x & y: true;
	y: false;
	!x & y: true;
	esac;