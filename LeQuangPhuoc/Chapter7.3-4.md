| Test Number   |   Test        | 
| ------------- |:-------------:| 
|       t1      |  (ab, ab, 0)  |    
|       t2      |  (ab, a, 0)   |   
|       t3      |  (ab, ac, -1) |     
|       t4      |  (ab, c, -1)  |     
|       t5      |  (a, bc, -1)  |    
|       t6      |  (abc, bc, 1) |     
|       t7      |  (ab, b, 1)   |   
|       t8      |  (abc, ba, -1)|    
|       t4      |  (ab, c, -1)  |     
|       t2      |  (ab, a, 0)   |     

a) Tập kiểm thử tối thiểu thỏa mãn bao phủ all defs:
    {t1}
 
b) Tập kiểm thử tối thiểu thỏa mãn bao phủ all uses:
    {t1, t4, t5, t6}
    
c) Tập kiểm thử tối thiểu thỏa mãn bao phủ all du-paths:
    {t1, t2, t3, t4, t5, t6, t7, t8}
