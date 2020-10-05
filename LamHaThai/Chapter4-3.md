Travis CI có thể báo cáo độ bao phủ mã nguồn của ca kiểm thử bằng cách thêm cài đặt sau vào ```.travis.yml``

```yml
script:
  - coverage run tests.py
```