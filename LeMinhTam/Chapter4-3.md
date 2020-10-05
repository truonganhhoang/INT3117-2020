# 3. Cài đặt mở rộng bài tập trước để máy chủ tích hợp liên tục có thể sử dụng các công cụ bổ sung như phạm vi bao phủ mã nguồn hoặc lý giải tĩnh.

- Ta có thể sử dụng cài đặt plugin `JaCoCo` (project `Maven`) tạo báo cáo về độ bao phủ mã nguồn trong quá trình xây dựng. Để lưu báo cáo đó dưới dạng cấu phần bản dựng, ta sử dụng bước `store_artifacts`.
- Tích hợp `JaCoCo` vào project, ta có file `config` như sau:
```config
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.1</version>
    <executions>
        <execution>
            <id>agent-for-ut</id>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```
- Khi đó file `maven.yml` của ta cần cài đặt thêm như sau:
```yml
version: 2.0

jobs:
  test:
    steps:
      - checkout
      - run: ./mvnw test verify
      - store_artifacts:
          path: target/site/jacoco/index.html

workflows:
  version: 2

  test-with-store-artifacts:
    jobs:
      - test
```
