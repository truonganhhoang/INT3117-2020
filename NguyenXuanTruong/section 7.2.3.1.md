## Graph I

a, 
Hình vẽ nằm ở đường link dưới
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Đường dẫn DU cho đồ thị đã cho:
[1,2,8], [1,2,3,5,6], [4,3,5,6], [4,3,5,7,2,8], [4,3,5,6,7,2,8]

c,
t1 = [1,2,8]
t2 = [1,2,3,5,7,2,8]
t3 = [1,2,3,5,6,7,2,8] 
t4 = [1,2,3,4,3,5,7,2,8]
t5 = [1,2,3,4,3,4,3,5,6,7,2,8]
t6 = [1,2,3,4,3,5,7,2,3,5,6,7,2,8]

| Test path | DU-paths covered                          |
|----------:|-------------------------------------------|
| t1        | [1,2,8]                                   |
| t2        | [1,2,8]                                   |
| t3        | [1,2,8], [1,2,3,5,6]                      |
| t4        | [4,3,5,7,2,8]                             |
| t5        | [4,3,5,6], [4,3,5,6,7,2,8]                |
| t6        | [4,3,5,6], [4,3,5,7,2,8], [4,3,5,6,7,2,8] |

d,
{t3, t5} sẽ đủ để bao phủ All-Defs.

e,
{t1, t3, t5} sẽ đủ để bao phủ All-Uses.

f,
{t1,t3,t4,t5} sẽ đủ để bao phủ All-Du-Paths Coverage.

## Graph II

a,
Hình ảnh ở link bên dưới
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Đường dẫn DU cho đồ thị đã cho
[1,2,6], [1,2,3], [3,5,2,3], [3,5,2,6], [3,4,5,2,3], [3,4,5,2,6]

c,
t1 = [1,2,6]
t2 = [1,2,3,4,5,2,3,5,2,6]
t3 = [1,2,3,5,2,3,4,5,2,6] 
t4 = [1,2,3,5,2,6]


| Test path | DU-paths covered                          |
|----------:|-------------------------------------------|
| t1        | [1,2,6]                                   |
| t2        | [1,2,3], [3,4,5,2,3], [3,5,2,6]           |
| t3        | [1,2,3], [3,5,2,3], [3,4,5,2,6]           |
| t4        | [1,2,3], [3,5,2,6]                        |

d,
{t4} đủ để bao phủ All-Defs 

e,
{t1,t2} đủ để bao phủ All-Uses 

f,
{t1, t2, t3} đủ để bao phủ All-Du-Paths 

## Graph III

a,
Hình ảnh ở link bên dưới:
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Đường dẫn DU cho đồ thị đã cho
[1,2,6], [1,2,3], [1,2,3,5], [4,5], [4,5,2,3], [4,5,2,6] 

c,
t1 = [1,2,3,5,2,6]
t2 = [1,2,3,4,5,2,6]

| Test path | DU-paths covered            |
|----------:|-----------------------------|
| t1        | [1,2,3], [1,2,3,5], [1,2,6] |
| t2        | [1,2,3], [4,5], [4,5,2,6]   |

d,
{t1} đủ để bao phủ All-Defs.

e,
{t1,t2, [1,2,6],[1,2,3,4,5,2,3,5,2,6]} đủ để bao phủ All-Uses coverage.

f,
{t1,t2, [1,2,6],[1,2,3,4,5,2,3,5,2,6]} đủ để bao phủ All-DU-Paths Coverage.

## Graph IV

a,
Hình vẽ ở link bên dưới
https://docs.google.com/document/d/1d4TiszqbNo938-ALZtQzR4tgGStyAjdii2wmANW4dhM/edit

b,
Đường dẫn DU cho đồ thị đã cho
[1,2,6], [1,2,3,5], [1,2,3,4,5], [5,2,6], [5,2,3,5], [5,2,3,4,5]

c,
t1 = [1,2,6]
t2 = [1,2,3,4,5,2,3,5,2,6]
t3 = [1,2,3,5,2,3,4,5,2,6] 

| Test path | DU-paths covered                           |
|----------:|--------------------------------------------|
| t1        | [1,2,6]                                    |
| t2        | [1,2,3,4,5], [5,2,3,5], [5,2,6]            |
| t3        | [1,2,3,5], [5,2,3,4,5], [5,2,6]            |

d,
{t2} đủ để bao phủ All-Defs.

e,
{t1, t2} đủ để bao phủ All-Uses.

f,
{t1, t2, t3} đủ để bao phủ All-DU-Paths.