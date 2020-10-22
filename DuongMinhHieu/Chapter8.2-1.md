# Use predicates (i) through (iv) to answer the following questions.
i. f = ab!c + !ab!c.
ii. f = !a!b!c!d + abcd.
iii. f = ab + a!bc + !a!bc.
iv. f = !a!c!d + !cd + bcd.
(a) Draw the Karnaugh maps for f and !f.
(b) Find the nonredundant prime implicant representation for f and !f.
(c) Give a test set that satisfies Implicant Coverage (IC) for f.
(d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
(e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.
(f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.
(g) Give a test set that is guaranteed to detect all faults in Figure 8.2.

# Trả lời:
* i. f = ab!c + !ab!c.
(!f tương đương f ngang)
(a) Biểu đồ Karnaugh cho f:
| c\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 0 | 0 | 1 | 1 | 0 |
| 1 | 0 | 0 | 0 | 0 |

Biểu đồ Karnaugh cho !f:
| c\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 0 | 1 | 0 | 0 | 1 |
| 1 | 1 | 1 | 1 | 1 |

(b) Hàm ý chính không thừa (hàm ý chính tối giản) cho f: f = b!c.
Hàm ý chính tối giản cho !f: !f = !b + c.

(c) Tập kiểm thử thỏa mãn bao phủ hàm ý: {xTF, xFT} bao phủ hết hàm ý của f và !f với x là giá trị bất kì của a (vì a không liên quan, do đó chọn T hoặc F).

(d) Tập kiểm thử thỏa mãn MUTP cho f: Ta có điểm đúng độc nhất cho hạng thức b!c là {1, 0} do đó các ca kiểm thử sẽ là {xTF} với x là giá trị bất kì của a.

(e) Tập kiểm thử thỏa mãn CUTPNFP: {xTF, xFF, xTT}.

(f) Tập kiểm thử thỏa mãn MNFP: {xFF, xTT}.

(g) Tập kiểm thử chắc chắn phát hiện ra tất cả lỗi trong 8.2: Ta áp dụng MUMCUT, nghĩa là dùng 3 bao phủ đã sử dụng và ra được tập kiểm thử: {xTF, xFF, xTT}.

* ii. f = !a!b!c!d + abcd.
(a) Biểu đồ Karnaugh cho f:
| cd\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 00 | 1 | 0 | 0 | 0 |
| 01 | 0 | 0 | 0 | 0 |
| 10 | 0 | 0 | 0 | 0 |
| 11 | 0 | 0 | 1 | 0 |

Biểu đồ Karnaugh cho !f:
| cd\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 00 | 0 | 1 | 1 | 1 |
| 01 | 1 | 1 | 1 | 1 |
| 10 | 1 | 1 | 1 | 1 |
| 11 | 1 | 1 | 0 | 1 |

(b) Hàm ý chính tối giản cho f: f = !a!b!c!d + abcd.
Hàm ý chính tối giản cho !f = a!b + b!c + c!d + !ad.

(c) Tập kiểm thử thỏa mãn bao phủ hàm ý: {FFFF, TTTT, TFTF, FTFT}.

(d) Tập kiểm thử thỏa mãn MUTP cho f: {FFFF, TTTT}.

(e) Tập kiểm thử thỏa mãn CUTPNFP: {FFFF, TTTT, TFFF, FTFF, FFTF, FFFT, FTTT, TFTT, TTFT, TTTF}.

(f) Tập kiểm thử thỏa mãn MNFP: {TFFF, FTFF, FFTF, FFFT, FTTT, TFTT, TTFT, TTTF}.

(g) Tập kiểm thử chắc chắn phát hiện ra tất cả lỗi trong 8.2: {FFFF, TTTT, TFFF, FTFF, FFTF, FFFT, FTTT, TFTT, TTFT, TTTF}.

* iii. f = ab + a!bc + !a!bc.
(a) Biểu đồ Karnaugh cho f:
| c\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 0 | 0 | 0 | 1 | 0 |
| 1 | 0 | 1 | 1 | 0 |

Biểu đồ Karnaugh cho !f:
| c\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 0 | 1 | 1 | 0 | 1 |
| 1 | 1 | 0 | 0 | 1 |

(b) Hàm ý chính không thừa (hàm ý chính tối giản) cho f: f = ab + bc.
Hàm ý chính tối giản cho !f: !f = !b + !a!c.

(c) Tập kiểm thử thỏa mãn bao phủ hàm ý: {TTF, FFT, FTF, FTT}.

(d) Tập kiểm thử thỏa mãn MUTP cho f: {TTF, FTT}.

(e) Tập kiểm thử thỏa mãn CUTPNFP: {TTF, FTT, FTF, TFF, FFT}.

(f) Tập kiểm thử thỏa mãn MNFP: {FTF, TFT, FFT, TFF}.

(g) Tập kiểm thử chắc chắn phát hiện ra tất cả lỗi trong 8.2: {TTF, FTT, TFF, FFT, FTF}.

* iv. f = !a!c!d + !cd + bcd.
(a) Biểu đồ Karnaugh cho f:
| cd\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 00 | 1 | 1 | 1 | 0 |
| 01 | 1 | 1 | 1 | 1 |
| 10 | 1 | 1 | 1 | 1 |
| 11 | 1 | 1 | 1 | 0 |

Biểu đồ Karnaugh cho !f:
| cd\ab | 00 | 01 | 11 | 10 |
|------|----|----|----|----|
| 00 | 0 | 0 | 0 | 1 |
| 01 | 0 | 0 | 0 | 0 |
| 10 | 0 | 0 | 0 | 0 |
| 11 | 0 | 0 | 0 | 1 |

(b) Hàm ý chính tối giản cho f: f = !cd + !a + b.
Hàm ý chính tối giản cho !f = a!bcd.

(c) Tập kiểm thử thỏa mãn bao phủ hàm ý: {FTTT, xxTF}.

(d) Tập kiểm thử thỏa mãn MUTP cho f: {TFFT, FFFF, FFTT, TTFF, TTTT}.

(e) Tập kiểm thử thỏa mãn CUTPNFP: {TFFT, TFTT, TFFF, FFFF, TTFF}.

(f) Tập kiểm thử thỏa mãn MNFP: {TFTT, TFFF}.

(g) Tập kiểm thử chắc chắn phát hiện ra tất cả lỗi trong 8.2: {TFFT, FFFF, FFTT, TTFF, TTTT, TFFF, TFTT}.
