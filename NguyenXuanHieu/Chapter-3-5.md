# The following JUnit test method for the ```sort()``` method has a non-syntactic flaw. Find the flaw and describe it in terms of the RIPR model. Be as precise, specific, and concise as you can. For full credit, you must use the terminology introduced in the book. In the test method, names is an instance of an object that stores strings and has methods ```add()```, ```sort()```, and ```getFirst()```, which do exactly what you would expect from their names. You can assume that the object names has been properly instantiated and the ```add()``` and ```sort()``` methods have already been tested and work correctly.

- Dựa vào hàm ```testSort``` đã được cho sẵn thì ta thấy được hàm này chỉ kiểm tra được phần từ 
đầu tiên của trạng thái cuối cùng --> không thể chứng minh rằng names đã được sắp xếp đúng thứ tự

