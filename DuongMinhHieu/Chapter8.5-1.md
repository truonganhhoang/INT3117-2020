# For the Memory Seat finite state machine, complete the test sets for the predicate coverage criterion (PC) by satisfying the predicates, ensuring reachability, and computing the expected output.

# Trả lời:
(a) Transition: 1 -> 2.
Vị từ: Button2 & (Gear = Park | ignition = off ).
Prefix: giá trị: Gear = Park, Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Button2 & Gear = Park | T | 2 |
| / | Button1 & Gear = Park | F | 1 |

(b) Transition: 1 -> 3.
Vị từ: sideMirrors & ignition = on.
Prefix: giá trị: Gear = Park, Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | sideMirrors & ignition = on | T | 3 |
| / | sideMirrors & ignition = off | F | 1 |

(c) Pre-state: 1 -> 3.
Vị từ: seatBottom & ignition = on.
Prefix: giá trị: Gear = Park, Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBottom & ignition = on | T | 3 |
| / | seatBottom & ignition = off | F | 1 |

(d) Pre-state: 1 -> 3.
Vị từ: lumbar & ignition = on.
Prefix: giá trị: Gear = Park, Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | lumbar & ignition = on | T | 3 |
| / | lumbar & ignition = off | F | 1 |

(e) Pre-state: 1 -> 3.
Vị từ: seatBack & ignition = on.
Prefix: giá trị: Gear = Park, Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBack & ignition = on | T | 3 |
| / | seatBack & ignition = off | F | 1 |

(f) Pre-state: 2 -> 1.
Vị từ: Button1 & (Gear = Park | ignition = off).
Prefix: giá trị: Gear = Park, Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Button1 & Gear = Park | T | 1 |
| / | Button2 & Gear = Park | F | 2 |

(g) Pre-state: 2 -> 3.
Vị từ: sideMirrors & ignition = on.
Prefix: giá trị: Gear = Park, Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | sideMirrors & ignition = on | T | 3 |
| / | sideMirrors & ignition = off | F | 2 |

(h) Pre-state: 2 -> 3.
Vị từ: seatBottom & ignition = on.
Prefix: giá trị: Gear = Park, Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBottom & ignition = on | T | 3 |
| / | seatBottom & ignition = off | F  | 2 |

(i) Pre-state: 2 -> 3.
Vị từ: lumbar & ignition = on.
Prefix: giá trị: Gear = Park, Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | lumbar & ignition = on | T | 3 |
| / | lumbar & ignition = off | F | 2 |

(j) Pre-state: 2 -> 3.
Vị từ: seatBack & ignition = on.
Prefix: giá trị: Gear = Park, Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
Bao phủ vị từ seatBack & ignition = on T 3
seatBack & ignition = off F 2

(k) Pre-state: 3 -> 1.
Vị từ: Button1 & (Gear = Park | ignition = off).
Prefix giá trị: Gear = Park, Button1, ignition=on, sideMirrors.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Button1 & Gear = Park | T | 1 |
| / | Button2 & Gear = Park | F | 2 |

(l) Pre-state: 3 -> 2.
Vị từ: Button2 & (Gear = Park | ignition = off).
Prefix: giá trị: Gear = Park, Button1, ignition=on, sideMirrors.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Button2 & Gear = Park | T | 2 |
| / | Button1 & Gear = Park | F | 1 |

(m) Pre-state: 3 -> 4.
Vị từ: Reset & Button1 & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition=on, sideMirrors.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Reset & Button1 & ignition = on | T | 4 |
| / | Reset & Button1 & ignition = off | F | 3 |

(n) Pre-state: 3 -> 5.
Vị từ: Reset & Button2 & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition=on, sideMirrors.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | Reset & Button2 & ignition = on | T | 5 |
| / | Reset & Button2 & ignition = off | F | 3 |

(o) Pre-state: 4 -> 1.
Vị từ: ignition = off.
Prefix: giá trị: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | ignition = off | T | 1 |
| / | ignition = on | F | 4 |

(p) Pre-state: 4 -> 3.
Vị từ: sideMirrors & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | sideMirrors & ignition = on | T | 3 |
| / | sideMirrors & ignition = off | F | 1 |

(q) Pre-state: 4 -> 3.
Vị từ: seatBottom & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBottom & ignition = on | T | 3 |
| / | seatBottom & ignition = off | F | 1 |

(r) Pre-state: 4 -> 3.
Vị từ: lumbar & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | lumbar & ignition = on | T | 3 |
| / | lumbar & ignition = off | F | 1 |

(s) Pre-state: 4 -> 3.
Predicate: seatBack & ignition = on.
Prefix: giá trị: Gear = Park, Button1, ignition = on, sideMirrors, Reset and Button1.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBack & ignition = on | T | 3 |
| / | seatBack & ignition = off | F | 1 |

(t) Pre-state: 5 -> 2.
Vị từ: ignition = off.
Prefix: giá trị: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|)
| Bao phủ vị từ | ignition = off | T | 2 |
| / | ignition = on | F | 5 |

(u) Pre-state: 5 -> 3.
Vị từ: sideMirrors & ignition = on.
Prefix: giá trị: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | sideMirrors & ignition = on | T | 3 |
| / | sideMirrors & ignition = off | F | 2 |

(v) Pre-state: 5 -> 3.
Vị từ: seatBottom & ignition = on.
Prefix: giá trị: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBottom & ignition = on | T | 3 |
| / | seatBottom & ignition = off | F | 2 |

(w) Pre-state: 5 -> 3.
Vị từ: lumbar & ignition = on.
Prefix: giá trị: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | lumbar & ignition = on | T | 3 |
| / | lumbar & ignition = off | F | 2 |

(x) Pre-state: 5 -> 3.
Vị từ: seatBack & ignition = on.
Prefix: giá trị: Gear = Park, Button2, ignition = on, sideMirrors, Reset and Button2.
| Coverage Criteria | Test Case Values | P | Expected Output |
|-------------------|------------------|---|-----------------|
| Bao phủ vị từ | seatBack & ignition = on | T | 3 |
| / | seatBack & ignition = off | F | 2 |