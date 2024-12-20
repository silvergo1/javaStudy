# 배열

### 배열에 참조값 대입
```java
Student[] students = new Student[2];
```
- 배열에서 참조값은 대입하지 않으면 참조값이 없다는 의미의 `null`값으로 초기화 된다

:star: 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다 :star:

:exclamation: 주의 <br>
변수에는 인스턴스 자체가 들어있는 것이 아님 <br>
인스턴스의 위치를 가리키는 참조값이 들어있을 뿐 <br>
따라서 대입`(=)`시에 인스턴스가 복사되는 것이 아니라 참조값만 복사됨

### 배열에 들어있는 객체 사용
배열에 들어있는 객체를 사용하려면 먼저 배열에 접근하고, 그 다음에 객체에 접근하면 됨

### 배열 선언 최적화
```java
Student[] students = new Student[]{student1, student2};
```
```java
Student[] students = {student1, student2};
```

### for문 최적화
for문 도입
```java
for(int i = 0; i < students.length; i++) {
    System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
}
```
for문 - 반복 요소를 변수에 담아서 처리
```java
for(int i = 0; i < students.length; i++) {
    Student s = students[i];
    System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
}
```
향상된 for문(Enhanced For Loop)
```java
for(Student s : students) {
    System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
}
```