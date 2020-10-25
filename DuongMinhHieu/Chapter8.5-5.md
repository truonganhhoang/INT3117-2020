# Consider the following deterministic finite state machine:
| Current State | Condition | Next State |
|---------------|-----------|------------|
| Idle | a v b | Active |
| Active | a ^ b | Idle |
| Active | !b | WindDown |
| WindDown | a | Idle |

* (a) Draw the finite state machine.

* (b) This machine does not specify which conditions cause a state to transition back to itself. However, these conditions can be derived from the existing conditions. Derive the conditions under which each state will transition back to itself.

* (c) Find CACC tests for each transition from the Active state (including the transition from Active to Active).

# Trả lời:
* (a) Link đồ thị: <https://github.com/duongminhhieu16/CodeKiemThu>.

* (b)
| Current State | Condition | Next State |
|---------------|-----------|------------|
| Idle | a v b | Active |
| Idle | !a ^ !b | Idle |
| Active |a ^ b| Idle |
| Active | !b | Windown |
| Active | !a ^ b | Active |
| Windown | a | Idle |
| Windown | !a | Windown |

* (c):
- Chuyển cảnh hoạt động -> Idle: thuộc tính = a ^ b, (a, b) = (T, T),(F, T) và (T, F).
- Hoạt cảnh hoạt động -> Windown: thuộc tính = !b, (a, b) = (x, T) và (x, F).
- Chuyển cảnh hoạt động -> Active: thuộc tính = !a ^ b, (a, b) = (F, T), (T, T), và (F, F).