6) 
    - Để kiểm thử một bài mà chúng ta không gặp lỗi, chúng ta có thể gọi phương thức computePrime với tham số nhỏ hơn hoặc bằng 0  , vd : computePrime (0).
    - Để ca kiểm thử của ta có gặp lỗi nhưng không lây nhiễm  , ta gọi phương thức với một tham sô , vd : computePrime (3) .
    - Để ca kiểm thử của ta có lây nhiễm nhưng không lan truyền , chúng ta gọi phương thức với tham số là 19 , vd : computePrime (19) .
    - Để ca kiểm thử của ta tiết lộ ra đang có lỗi trong code với nguời dùng , chúng ta làm giống vơi trường hợp thứ 3 nhưng gọi thêm phương thức toString().