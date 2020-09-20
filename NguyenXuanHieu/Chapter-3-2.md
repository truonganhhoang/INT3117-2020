# Give a one-to-two paragraph explanation for how the inheritance hierarchy can affect controllability and observability.

- Kế thừa có thể là những khiến đâò vào (input) và đầu ra (output) gặp khó khăn bởi vì khi bạn kế thừa thì bạn chỉ hiểu phần nổi của tảng băng chìm, đó là những thư viện mà bạn kế thừa chú bạn thực sự không biết bên sâu bên trong chúng hoạt động như thế nào. 
Điều đó có nghĩa rằng bạn không biết thực sự điều gì xảy ra khi các bộ test hoạt động. 
Đó chính là điều gây cản trở sự quan sát và sự kiểm soát của bạn đối với 1 ứng dụng mà bạn đang xây dựng hoặc kiểm thử nó