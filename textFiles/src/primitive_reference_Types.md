# 기본형과 참조형

- 기본형 (Primitive Type) : `int`, `long`, `double`, `boolean` 처럼 변수에 사용할 값을 넣을 수 있는 데이터 타입
- 참조형 (Reference Type) : `Student studen1`, `int[] students` 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입. **참조형은 객체 또는 배열에 사용**

### 기본형 vs 참조형 - 기본
+ **기본형**
  + 숫자 `10`, `20`과 같이 실제 사용하는 값을 변수에 담을 수 있음
  + 해당 값을 바로 사용 할 수 있음
+ **참조형**
  + 실제 사용하는 값을 변수에 담는 것이 아님
  + 이름 그대로 실제 객체의 위치(참조, 주소)를 저장
  + 참조형에는 객체와 배열이 있음
    + **객체** : `.`(dot)을 통해서 메모리 상에 생성된 객체를 찾아가야 사용할 수 있음
    + **배열** : `[]`를 통해서 메모리 상에 생성된 배열을 찾아가야 사용할 수 있음

### 기본형 vs 참조형 - 계산
+ **기본형**
  + 들어있는 값을 그래도 계산에 사용할 수 있음
  + 숫자 같은 것 들은 바로 계산 할 수 있음
```java
int a = 10, b = 20;
int sum = a + b;
```
+ **참조형**
  + 들어있는 참조값을 그래도 사용할 수 없음
  + 주소지만 가지고는 할 수 있는게 없음
  + 주소지에 가야 실체가 있음
```java
Student s1 = new Student();
Student s2 = new Student();
s1 + s2 //오류 발생
```
```java
Student s1 = new Student();
s1.grade = 100;
Student s2 = new Student();
s2.grade = 90;
int sum = s1.grade + s2.grade; //연산 가능
```
### 쉽게 이해하는 팁
기본형을 제외한 나머지는 모두 참조형
+ 기본형
  + 소문자로 시작
  + `int`, `long`, `double`, `boolean` 모두 소문자로 시작
  + 기본형은 자바가 기본으로 제공하는 데이터 타입
  + 기본형은 개발자가 새로 정의할 수 없다
  + 개발자는 참조형인 클래스만 직접 정의할 수 있음
+ 클래스
  + 대문자로 시작
  + `Student`
  + 클래스는 모두 참조형

### 참고 - String
자바에서 `String`은 특별함 <br>
`String` == 클래스. 따라서 참조형 <br>
그런데 기본형처럼 문자 값을 바로 대입 할 수 있음 <br>
문자는 매우 자주 다루기 때문에 자바에서 특별하게 편의 기능을 제공 <br>