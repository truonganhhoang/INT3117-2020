# 2. Thiết lập máy chủ tích hợp liên tục ở chế độ chứa cả mã nguồn và kiểm thử. Chạy thử
- Cài đặt thư mục github: [Calc - chương trình tính toán giữa 2 số](https://github.com/simejisan/ST-C4)
- Cài đặt máy chủ tích hợp liên tục phù hợp với dự án đang xây dựng là Maven, công cụ `Java with Maven`
- Tệp `maven.yml`:
```yml
name: Java CI with Maven

on:
  push:
    branches: [ master ]
  pull_request:
    branches: [ master ]

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 1.8
      uses: actions/setup-java@v1
      with:
        java-version: 1.8           
    - name: Build with Maven 		# Tiếp theo là build
      run: mvn package  #Chạy lệnh build
    - name: Test with Maven  # Chạy test 
      run: mvn test && mvn package
    - name: Build Jar file
      run: mkdir staging && cp target/*.jar staging  # Đưa file jar vào artifact Github
    - uses: actions/upload-artifact@v1
      with:
        name: Package
        path: staging
```
- CI server tự động cập nhật chạy mã nguồn và file kiểm thử
- Cập nhật thông tin trên mục `Action`