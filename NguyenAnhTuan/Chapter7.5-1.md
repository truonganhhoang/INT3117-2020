# 1.

## (a)

- 4 giá trị cho mỗi nguyên tố là :[ null, null ], [ obj, null ], [ null, obj ] and [ obj, obj ] [ obj, null ] and [ null, obj ] khác nhau ở mức độ đại diện.

## (b)

- Số trạng thái = nguyên tố * độ lớn * trước * sau = 4 * 3 * 2 * 2 = 48.

## (c)

- Trong 48 trạng thái, chỉ có 6 là có thể tiếp cận.

## (f)

Queue q = new Queue(); Object obj = new Object(); q.enqueue(obj); q.enqueue(obj); q.dequeue(); q.enqueue(obj); q.dequeue(); q.dequeue(); q.enqueue(obj); q.dequeue();