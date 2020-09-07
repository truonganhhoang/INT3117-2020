## Question 2: What is the difference between software fault and software failure?

Software failure occurs when the software does not do what the user expects to see. It happens when the criteria of software is not fit with what the user wants. for example, if the user want to build an messenger app and the program is an video call app so it is failure even the app can run successfully or not

Software fault, on the other hand, is a hidden programming error.

For example, the code below describe a function to check if input number is even or not: 
```Javascript
if(num % 2 === 0){
console.log(even);
}else{
console.log(not even);
}
```

When it comes to logic, it is right because it checks if variable num divides for 2 and the surplus is 0 so it returns even, otherwise, it is not even. But the code can not be compiled and run successfully because variable num has not declared before, it is might be run but cause error under hood of the program, so it is a software fault

A software fault becomes a software failure only when the exact computation conditions are met, and the faulty portion of the code is executed on the CPU. This can occur during normal usage. Or, when the software is ported to a different hardware platform. Or, when the software is ported to a different compiler. Or, when the software gets extended
