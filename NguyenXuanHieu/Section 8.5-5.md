# Section 8.5-5

# Consider the following deterministic finite state machine:

a, Draw the finite state machine.

- Đồ thị vẽ ở thư mục Assets/Graph 8.5-5.png

b, This machine does not specify which conditions cause a state to
transition back to itself. However, these conditions can be
derived from the existing conditions. Derive the conditions
under which each state will transition back to itself.

| | | |
|-|-|-|
|__Current State__|__Condition__|__Next State__|
|Idle|a tuyển b|Active|
|Idle|phủ a hội phủ b|Idle|
|Active|a hội b|Idle|
|Active|phủ b|Windown|
|Active|phủ a hội b|Active|
|Windown|a|Idle|
|Windown|phủ a|Windown|

c, Find CACC tests for each transition from the Active state
(including the transition from Active to Active).

- Chuyển cảnh hoạt động --> Idle: thuộc tính = a hội b, (a, b) = (T, T),(F, T) và (T, F)
- Hoạt cảnh hoạt động --> Windown: thuộc tính = phủ b, (a, b) = (x, T) và (x, F)
- Chuyển cảnh hoạt động --> Active: thuộc tính = phủ a hội b, (a, b) = (F, T), (T, T), và (F, F)