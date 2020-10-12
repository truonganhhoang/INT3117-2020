# Chapter 7.2.2-6

## Answer questions a–c for the graph in Figure 7.2.
![image](./Assets/Figure7.2.png)

`(a)` **List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.**

-   Bảo phủ đỉnh: `[1] [4] [5] [2] [6] [3] [7] [8] [9] [10]`
-   Bảo phủ cạnh `[1,4] [1,5] [2,5] [2,6] [3,6] [3,7] [4,8] [5,8] [5,9] [6,9] [6,10] [7,10]`
-   Bảo phủ chính `[2,5,8] [2,5,9] [1,5,9] [1,4,8] [1,5,8] [2,6,9] [3,6,10] [3,7,10] [3,6,9] [2,6,10]`

`(b)` **List test paths that achieve Node Coverage but not Edge Coverage on the graph.** <br/>
`[1,4,8]`<br/>
`[1,5,9]`<br/>
`[1,5,8]`<br/>
`[2,5,9]`<br/>
`[2,6,10]`<br/>
`[2,6,9]`<br/>
`[2,5,8]`<br/>
`[3,6,10]`<br/>
`[3,7,10]`<br/>

`(c)` **List test paths that achieve Edge Coverage but not Prime Path Coverage on the graph.**

`[1,4,8]`<br/>
`[1,5,9]`<br/>
`[1,5,8]`<br/>
`[2,5,9]`<br/>
`[2,6,10]`<br/>
`[2,6,9]`<br/>
`[2,5,8]`<br/>
`[3,4,10]`<br/>
`[3,6,10]`<br/>
`[3,7,10]`<br/>
