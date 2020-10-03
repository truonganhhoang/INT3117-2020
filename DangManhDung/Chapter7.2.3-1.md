Cho 4 đồ thị sau

![image](https://user-images.githubusercontent.com/48431650/94986617-55521300-058a-11eb-9dc4-d679500cbb4d.png)

(a) Vẽ đồ thị
* Graph I

![image](https://user-images.githubusercontent.com/48431650/94986488-6d756280-0589-11eb-9b61-065c11d4bf04.png)

* Graph II

![image](https://user-images.githubusercontent.com/48431650/94986530-bf1ded00-0589-11eb-8496-c64efead7e32.png)

* Graph III

![image](https://user-images.githubusercontent.com/48431650/94986576-2045c080-058a-11eb-93e7-f926c2ba6290.png)

* Graph IV

![image](https://user-images.githubusercontent.com/48431650/94986661-a7933400-058a-11eb-8434-5f082a25932b.png)


(b) Liệt kê tất cả các du-path liên quan đến x

* Graph I:

        i	[1,2,8]
        ii	[1,2,3,5,6]
        iii	[4,3,5,6]
        iv	[4,3,5,7,2,8]
        v	[4,3,5,6,7,2,8]

* Graph II:

        i	[1,2,3]
        ii	[1,2,6]
        iii	[3,4,5,2,3]
        iv	[3,5,2,3]
        v	[3,4,5,2,6]
        vi	[3,5,2,6]

* Graph III:

        i	[1,2,3]
        ii	[1,2,3,5]
        iii	[1,2,6]
        iv	[4,5,2,3]
        v	[4,5]
        vi	[4,5,2,6]

* Graph IV:

        i	[1,2,3,5]
        ii	[1,2,3,4,5]
        iii	[1,2,6]
        iv	[5,2,3,5]
        v	[5,2,3,4,5]
        vi	[5,2,6]

(c) Xác định du-path nào mà các đường đi kiểm thử tour được.

* Graph I

Test | Tour | Side-trip
-|----- | -----
t1|i| 
t2| |i
t3|ii|i
t4|iv| 
t5|iii, v| 
t6| |iii, iv, v

* Graph II

Test | Tour | Side-trip
-|----- | -----
t1|i| 
t2| |i
t3|ii|i
t4|iv| 

* Graph III

Test | Tour | Side-trip
-|----- | -----
t1|i, ii|iii
t2|i, iv,vi| 