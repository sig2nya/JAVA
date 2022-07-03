Spring Security
===============
* 초기 pom.xml
```java
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

* StudentController
```java
@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private static final List<Student> STUDENTS = Arrays.asList(
        new Student(1, "James Bond"),
        new Student(2, "Maria Jones"),
        new Student(3, "Anna")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exists"));
    }
}
```

* Student 객체
```java
public class Student {
    private final Integer sutdentId;
    private final String studentName;

    public Student(Integer sutdentId, String studentName) {
        this.sutdentId = sutdentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return sutdentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
```

* 해당 URL로 Request</br>
  <img width="367" alt="스크린샷 2022-07-03 16 31 07" src="https://user-images.githubusercontent.com/70207093/177029878-fd222d2e-501a-4356-bf07-dc0e9b235f9a.png">

* Spring Security Dependency 추가
```java
  <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
  </dependency>
```

* Application 구동 후, 다음과 같이 LogIn 화면 확인 가능</br>
  <img width="335" alt="스크린샷 2022-07-03 16 33 27" src="https://user-images.githubusercontent.com/70207093/177029959-824dcb23-2e4b-4d78-a7e3-83a88536a482.png">
