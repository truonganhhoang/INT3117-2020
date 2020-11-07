**Áp dụng tiêu chuẩn phủ PC**

(a) Chuyển biến: 1 -> 2.
Vị từ: `Button2` & (`Gear` = `Park` | `ignition` = `off` ).
Tiền tố: `Gear` = `Park`, `Button1`.

 Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
------------------|---|-----------------|
`Button2` & `Gear` = `Park` | T | 2 |
`Button1` & `Gear` = `Park` | F | 1 |

(b) Chuyển biến: 1 -> 3.
Vị từ: `sideMirrors` & `ignition` = on.
Tiền tố: `Gear` = `Park`, `Button1`.

 Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
|`sideMirrors` & `ignition = on` | T | 3 |
|`sideMirrors` & `ignition = off` | F | 1 |

(c) Trạng thái trước: 1 -> 3.
Vị từ: `seatBottom` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBottom` & `ignition` = `on` | T | 3 |
`seatBottom` & `ignition` = `off` | F | 1 |

(d) Trạng thái trước: 1 -> 3.
Vị từ: `lumbar` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`lumbar` & `ignition` = `on` | T | 3 |
`lumbar` & `ignition` = `off` | F | 1 |

(e) Trạng thái trước: 1 -> 3.
Vị từ: `seatBack` & ignition = on.
Tiền tố: `Gear` = `Park`, `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBack` & `ignition` = `on` | T | 3 |
`seatBack` & `ignition` = `off` | F | 1 |

(f) Trạng thái trước: 2 -> 1.
Vị từ: `Button1` & (`Gear` = `Park` | `ignition` = `off`).
Tiền tố: `Gear` = `Park`, `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`Button1` & `Gear` = `Park` | T | 1 |
`Button2` & `Gear` = `Park` | F | 2 |

(g) Trạng thái trước: 2 -> 3.
Vị từ: `sideMirrors` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
 `sideMirrors` & `ignition` = `on` | T | 3 |
`sideMirrors` & `ignition` = `off` | F | 2 |

(h) Trạng thái trước: 2 -> 3.
Vị từ: `seatBottom` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBottom` & `ignition` = `on` | T | 3 |
`seatBottom` & `ignition` = `off` | F  | 2 |

(i) Trạng thái trước: 2 -> 3.
Vị từ: `lumbar` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`lumbar` & `ignition` = `on` | T | 3 |
`lumbar` & `ignition` = `off` | F | 2 |

(j) Trạng thái trước: 2 -> 3.
Vị từ: `seatBack` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBack` & `ignition` = `on` | T | 3
`seatBack` & `ignition` = `off` | F | 2

(k) Trạng thái trước: 3 -> 1.
Vị từ: `Button1` & (`Gear` = `Park` | `ignition` = `off`).
Tiền tố: `Gear` = `Park`, `Button1`, `ignition`=`on`, `sideMirrors`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`Button1` & `Gear` = `Park` | T | 1 |
`Button2` & `Gear` = `Park` | F | 2 |

(l) Trạng thái trước: 3 -> 2.
Vị từ: `Button2` & (`Gear` = `Park` | `ignition` = `off`).
Tiền tố: `Gear` = `Park`, `Button1`, `ignition`=`on`, `sideMirrors`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`Button2` & `Gear` = `Park` | T | 2 |
`Button1` & `Gear` = `Park` | F | 1 |

(m) Trạng thái trước: 3 -> 4.
Vị từ: `Reset` & `Button1` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition`=`on`, `sideMirrors`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`Reset` & `Button1` & `ignition` = `on` | T | 4 |
`Reset` & `Button1` & `ignition` = `off` | F | 3 |

(n) Trạng thái trước: 3 -> 5.
Vị từ: `Reset` & `Button2` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition`=`on`, `sideMirrors`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`Reset` & `Button2` & `ignition` = `on` | T | 5 |
`Reset` & `Button2` & `ignition` = `off` | F | 3 |

(o) Trạng thái trước: 4 -> 1.
Vị từ: `ignition` = `off`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`ignition` = `off` | T | 1 |
`ignition` = `on` | F | 4 |

(p) Trạng thái trước: 4 -> 3.
Vị từ: `sideMirrors` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`sideMirrors` & `ignition` = on | T | 3 |
`sideMirrors` & `ignition` = off | F | 1 |

(q) Trạng thái trước: 4 -> 3.
Vị từ: `seatBottom` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBottom` & `ignition` = `on` | T | 3 |
`seatBottom` & `ignition` = `off` | F | 1 |

(r) Trạng thái trước: 4 -> 3.
Vị từ: `lumbar` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`lumbar` & `ignition` = `on` | T | 3 |
`lumbar` & `ignition` = `off` | F | 1 |

(s) Trạng thái trước: 4 -> 3.
Vị từ: `seatBack` & `ignition` = on.
Tiền tố: `Gear` = `Park`, `Button1`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button1`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBack` & `ignition` = `on` | T | 3 |
`seatBack` & `ignition` = `off` | F | 1 |

(t) Trạng thái trước: 5 -> 2.
Vị từ: `ignition` = `off`.
Tiền tố: `Gear` = `Park`, `Button2`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`ignition` = `off` | T | 2 |
`ignition` = `on` | F | 5 |

(u) Trạng thái trước 5 -> 3.
Vị từ: `sideMirrors` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`sideMirrors` & `ignition` = `on` | T | 3 |
`sideMirrors` & `ignition` = `off` | F | 2 |

(v) Trạng thái trước: 5 -> 3.
Vị từ: `seatBottom` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBottom` & `ignition` = `on` | T | 3 |
`seatBottom` & `ignition` = `off` | F | 2 |

(w) Trạng thái trước: 5 -> 3.
Vị từ: `lumbar` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`lumbar` & `ignition` = `on` | T | 3 |
`lumbar` & `ignition` = `off` | F | 2 |

(x) Trạng thái trước: 5 -> 3.
Vị từ: `seatBack` & `ignition` = `on`.
Tiền tố: `Gear` = `Park`, `Button2`, `ignition` = `on`, `sideMirrors`, `Reset` and `Button2`.

Giá trị ca kiểm thử | P | Giá trị đầu ra mong đợi |
|------------------|---|-----------------|
`seatBack` & `ignition` = `on` | T | 3 |
`seatBack` & `ignition` = `off` | F | 2 |