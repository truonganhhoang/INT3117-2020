Khi ghi đè phương thức **equals()**, lập trình viên cũng được yêu cầu ghi đè phương thức **hashCode()**; nếu không các máy client không thể lưu trữ các đối tượng này trong một cấu trúc bộ sưu tập như *HashSet*.
	(a) Miêu tả vấn đề của *Point* với *HashSet*
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Set<Point> s = new HashSet<Point>();
		s.add(p1);
		boolean b = s.contains(p2);
	Tuy có khả năng là b đúng, xác suất cao hơn là 2 đối tượng *Point* được cho vào các nhóm khác nhau nên b sẽ sai

	(b) Mối quan hệ toán học của *equal()* và *hashCode()*
	2 đối tượng chỉ có thể bằng nhau (thông qua **equal**) nếu chúng có cùng hash code
	2 đối tượng khác nhau vẫn có thể có cùng hash code

	(c) Viết một kiểm thử JUnit cho thấy *Point* cho hợp với lý thuyết trên
		@Test public void hashConsistentWithEquals() {
			Point p1 = new Point(1,2);
			Point p2 = new Point(1,2);
			assertTrue("Hash codes must match", p1.hashCode() == p2.hashCode());
		}
	
	(d) Chỉnh lớp *Point* để sửa lỗi
		@Override public int hashCode() {
			int result = 17;
			result = 31 * result + x;
			result = 31 * result + y;
			return result;
		}

	(e) Viết lại kiểm thử JUnit cho phù hợp. Đánh giá với *DataPoints* phù hợp
		@Theory public void hashConsistentWithEqualsTheory(Object o1, Object o2) {
			assumeTrue(o1 != null);
			assumeTrue(o2 != null);
			assumeTrue(o1.equals(o2));
			assertTrue("Hash codes must match", o1.hashCode() == o2.hashCode());
		}
		@DataPoints public static Object[] objects = {
			new Point(1,2), new Point(1,2), new Point(1,3), "ant", null
		};
	Lý thuyết này được đánh giá dựa trên tích chéo của bộ năm giá trị trong cấu trúc DataPoints với chính nó. Trong số 25 giá trị này, 5 giá trị không vượt qua điều kiện tiên quyết đầu tiên. Trong số 20 còn lại, 4 giá trị không vượt qua điều kiện tiên quyết thứ hai. Trong số 16 còn lại, 6 giá trị vượt qua điều kiện tiên quyết thứ ba. Tất cả 6 điều này đều thỏa mãn hậu điều kiện.