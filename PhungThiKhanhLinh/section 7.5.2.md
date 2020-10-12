```java
partOfDay : {Wake, Sleep}
temp : {Low, High}
// Initially "Wake" at "Low" temperature
// Effects: Advance to next part of day
public void advance();
// Effects: Make current temp higher, if possible
public void up();
// Effects: Make current temp lower, if possible
public void down();
```

a,
Có tổng cộng 4 trạng thái:
- A: (Wake, Low)  
- B: (Wake, High)  
- C: (Sleep, Low)  
- D: (Sleep, High)

b,
Có tất cả 12 trạng thái:
- advance(): A -> C
- advance(): B -> D
- advance(): C -> A
- advance(): D -> B
- up() : A -> B
- up() : B -> B
- up() : C -> D
- up() : D -> D
- down() : A -> A
- down() : B -> A
- down() : C -> C
- down() : D -> C

c,
- A
- down() - edge 9 to state A
- advance() - edge 1 to state C
- down() - edge 11 to state C
- up() - edge 7 to state D
- up() - edge 8 to state D
- advance() - edge 4 to state B
- up() - edge 6 to state B
- down() - edge 10 to state A
- up() - edge 5 to state B
- advance() - edge 2 to state D
- down() - edge 12 to state C
- advance() - edge 3 to state A