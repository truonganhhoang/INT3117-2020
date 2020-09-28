**CircleCI có thể tích hợp thêm chứng năng báo cáo độ bao phủ mã nguồn của ca kiểm thử (code coverage) bằng cách thêm cài đặt sau vào ```config.yml```:**
```yml
- run:
    name: "Run Jest and Collect Coverage Reports"
    command: jest --collectCoverage=true
- store_artifacts:
    path: coverage
```