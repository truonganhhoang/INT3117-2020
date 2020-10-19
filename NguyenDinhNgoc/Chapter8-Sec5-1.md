Ghế nhớ FSM có năm trạng thái và 24 chuyển tiếp. Đối với mỗi quá trình chuyển đổi, chúng tôi cung cấp các giá trị chuyển tiếp, vị từ, tiền tố và các phép gán chân trị cần thiết để đáp ứng tiêu chí.

a,

 Chuyển tiếp: 1 → 2
Vị ngữ:: Button2 ∧ (Gear = Park ∨ ignition = off )
Tiền tố: giá trị: Gear = Park, Button1
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ |Button2 ∧ Gear = Park|T|2|
|                |Button1 ∧ Gear = Park|F| 1|

b, 

Chuyển tiếp: 1 → 3
Vị ngữ:: sideMirrors ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button1
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ |sideMirrors ∧ ignition = on|T|3|
|                |sideMirrors ∧ ignition = of|F| 1|

c,

Chuyển tiếp: 1 → 3
Vị ngữ:: sideMirrors ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button1
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ |seatBottom ∧ ignition = on|T|3|
|                |seatBottom ∧ ignition = off|F| 1|

d, 

Chuyển tiếp: 1 → 3
Vị ngữ::  lumbar ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button1
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ| lumbar ∧ ignition = on|T|3|
|                |lumbar ∧ ignition = off|F| 1|

e, 

Chuyển tiếp: 1 → 3
Vị ngữ: seatBack ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button1
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ| seatBack ∧ ignition = on|T|3|
|                |seatBack ∧ ignition = off|F| 1|

f, 

Chuyển tiếp: 2 → 1
Vị ngữ: Button1 ∧ (Gear = Park ∨ ignition = off )
Tiền tố: giá trị: Gear = Park, Button2
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ|Button1 ∧ Gear = Park|T|1|
|                |Button2 ∧ Gear = Park|F| 2|

g, 

Chuyển tiếp: 2 → 3
Vị ngữ:: sideMirrors ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button2
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ |sideMirrors ∧ ignition = on|T|3|
|                |sideMirrors ∧ ignition = off|F| 2|

h, 

Chuyển tiếp: 2 → 3
Vị ngữ:: sideMirrors ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button2
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ |seatBottom ∧ ignition = on|T|3|
|                |seatBottom ∧ ignition = off|F| 2|

i, 

Chuyển tiếp: 2 → 3
Vị ngữ::  lumbar ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button2
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ| lumbar ∧ ignition = on|T|3|
|                |lumbar ∧ ignition = off|F| 2|

j, 

Chuyển tiếp: 2 → 3
Vị ngữ: seatBack ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button2
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ| seatBack ∧ ignition = on|T|3|
|                |seatBack ∧ ignition = off|F| 2|

k, 

Chuyển tiếp: 3 → 1
Vị ngữ: Button1 ∧ (Gear = Park ∨ ignition = off )
Tiền tố: giá trị: Gear = Park, Button1, ignition=on, sideMirrors
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ|Button1 ∧ Gear = Park|T|1|
|                |Button2 ∧ Gear = Park|F| 2|

l, 

Chuyển tiếp: 3 → 2
Vị ngữ: Button2 ∧ (Gear = Park ∨ ignition = off )
Tiền tố: giá trị: Gear = Park, Button1, ignition=on, sideMirrors
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ|Button1 ∧ Gear = Park|T|1|
|                |Button2 ∧ Gear = Park|F| 2|

m, 

Chuyển tiếp: 3 → 4
Vị ngữ: Reset ∧ Button1 ∧ ignition = on
Tiền tố: giá trị: Gear = Park, Button1, ignition=on, sideMirrors
|Tiêu chuẩn độ phủ|Giá trị ca kiểm thử |P|Đầu ra mong muốn|
|-----------------|-------------------|--|----------------|
|Xác định độ phủ|Reset ∧ Button1 ∧ ignition = on|T|4|
|                |Reset ∧ Button1 ∧ ignition = off|F| 3|


