### Delete the explicit ```throw``` of ```NullPointerException``` in the ```Min``` program (Figure 3.2). Verify that the JUnit test for a list with a single *null* element now fails.

Vì ```NullPointerException``` là lỗi ngoại lệ xảy ra khi tham chiếu tới đối tượng nhưng nó lại không có vị trí nào trên bộ nhớ (*null*) nên khi xóa cú pháp ```throw``` của ngoại lệ này thì nếu bộ kiểm thử của JUnit có chứa một phần tử *null* thì nó sẽ bị lỗi.
