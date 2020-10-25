# Answer the following questions for the method `twoPred()`:

* (a) List test inputs for `twoPred()` that achieve Restricted Active Clause Coverage (RACC).
* (b) List test inputs for `twoPred()` that achieve Restricted Inactive Clause Coverage (RICC).


# Trả lời
* Gọi mệnh đề x+y == 10: true là w.
Từ đó ta có vị từ A = z & w; vị từ B = !z | !w.

* (a) Ta có tập kiểm thử thỏa mãn RACC như sau: {TT, FT, TF}.

* (b) Ta có tập kiểm thử thỏa mãn RICC như sau: {TF, FF, FT}.