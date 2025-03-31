# 객체 지향 프로그래밍 강의 정리

## 📖 목차
- [📌 섹션 2. 클래스와 데이터](#섹션-2-클래스와-데이터)
- [📌 섹션 3. 기본형과 참조형](#섹션-3-기본형과-참조형)
- [📌 섹션 4. 객체 지향 프로그래밍](#섹션-4-객체-지향-프로그래밍)
- [📌 섹션 5. 생성자](#섹션-5-생성자)
- [📌 섹션 6. 패키지](#섹션-6-패키지)
- [📌 섹션 7. 접근제어자](#섹션-7-접근-제어자)
- [📌 섹션 8.  자바 메모리 구조와 static](#섹션-8-자바-메모리-구조와-static)
- [📌 섹션 9. Final](#섹션-9-Final)
- [📌 섹션 10. 상속](#섹션-10-상속)
- [📌 섹션 11. 다형성 1](#섹션-11-다형성-1)

---

## 섹션 2. 클래스와 데이터

### 클래스, 객체, 인스턴스
- **클래스(Class)**: 객체를 생성하기 위한 설계도
- **객체(Object)**: 클래스에서 정의한 속성과 기능을 가진 실체 (각 객체는 독립적인 상태를 가짐)
- **인스턴스(Instance)**: 특정 클래스로부터 생성된 객체 (객체가 어떤 클래스에 속해 있는지를 강조할 때 사용)

### 클래스와 객체 사용
- 클래스로부터 객체를 생성하여 사용
- `new` 키워드를 사용하여 객체 생성
- 속성(변수)과 기능(메서드)은 `.`(점)으로 접근

### 객체 vs 인스턴스
| 구분  | 설명 |
|------|------|
| **객체(Object)** | 클래스로부터 만들어진 실체 |
| **인스턴스(Instance)** | 특정 클래스에서 생성된 객체를 강조할 때 사용 |

### 자바의 변수 대입과 참조
- **자바에서 변수 대입 시 항상 값이 복사됨**
- **참조형 변수**는 객체의 참조값(주소)을 저장하며, 대입 시 참조값만 복사됨

---

## 섹션 3. 기본형과 참조형

### 기본형(Primitive) vs 참조형(Reference)
| 구분  | 저장 방식 |
|------|------|
| **기본형** | 값을 직접 저장 |
| **참조형** | 객체가 저장된 메모리 주소(참조값)를 저장 |

### 변수의 값 전달 방식
- **자바는 변수를 대입할 때 항상 값을 복사하여 전달**
  - 기본형 → 실제 값을 복사
  - 참조형 → 참조값(메모리 주소)만 복사

### 메서드 호출과 값 전달
- **기본형**: 값이 복사되어 전달 → 메서드 내부에서 변경해도 원본 영향 없음
- **참조형**: 참조값이 복사되어 전달 → 객체의 속성을 변경하면 원본 객체도 변경됨

### 변수 초기화
- **지역 변수**: 직접 초기화 필요
- **멤버 변수(필드)**: 자동으로 초기화됨

### null과 NullPointerException
- **null**: 값이 없음을 나타내는 키워드 (참조형 변수에서만 사용 가능)
- **GC(가비지 컬렉션)**: 참조되지 않는 객체를 자동으로 제거
- **NullPointerException**: 참조값이 없는(null) 변수를 사용하려고 할 때 발생

---

## 섹션 4. 객체 지향 프로그래밍

### 절차 지향 vs 객체 지향
| 구분  | 특징 |
|------|------|
| **절차 지향** | 실행 순서를 중심으로 프로그래밍 (데이터와 기능이 분리됨) |
| **객체 지향** | 객체를 중심으로 프로그래밍 (데이터와 기능을 하나로 묶음) |

### 객체 지향의 핵심 개념
- **캡슐화(Encapsulation)**: 데이터(속성)와 기능(메서드)을 하나로 묶고, 필요한 기능만 외부에 제공
- **객체의 역할**: 자신의 메서드를 통해 내부 데이터를 관리

### 객체란?
- 현실 세계의 사물이나 개념을 **속성(데이터)과 기능(행동)** 으로 추상화한 것
- **예제: 자동차 객체**
  - **속성**: 색상, 브랜드, 속도
  - **기능**: 가속, 감속, 방향 전환

---

## 섹션 5. 생성자

### 생성자가 필요한 이유
- 객체를 생성하는 시점에 특정 작업을 수행하려면 **생성자** 사용
- **객체 생성 후 초기값 설정이 반복되는 경우**, 메서드로 반복 제거 가능

### this 키워드
- **this**: 자기 자신의 인스턴스를 가리킴
- **멤버 변수와 매개변수의 이름이 같을 때 구분 방법**
  - 기본적으로 **매개변수가 우선순위**를 가짐
  - **멤버 변수 접근 시 `this.` 사용** → `this`는 인스턴스 자신의 참조값

### 기본 생성자
- **매개변수가 없는 생성자**
- **클래스에 생성자가 없으면 자바가 자동으로 기본 생성자를 추가**
- **생성자가 하나라도 존재하면 기본 생성자는 자동 추가되지 않음**

> **기본 생성자를 자동으로 추가하는 이유?**
> - 생성자가 필요하지 않은 경우에도 매번 개발자가 기본 생성자를 정의해야 하는 번거로움을 줄이기 위해

---

## 섹션 6. 패키지

### 패키지 시작
- 많은 클래스가 등장하면서 **관련 있는 기능들을 그룹화**하여 관리하는 데 유용
- 다른 패키지에서 클래스를 가져올 때 **경로를 작성하여 가져옴**
  - 예시: `pack.a.User`

### 패키지 - import
- 경로를 일일이 작성하는 불편함을 해결하기 위해 **`import`** 사용
- **패키지 선언**: 코드의 첫 줄에 `package` 사용
- **클래스 가져오기**: 그 다음 줄부터 `import` 사용
- **`*` 키워드**: 해당 패키지 내 모든 클래스를 가져올 수 있음
  ```java
  import pack.a.*;  // pack.a 패키지 내 모든 클래스 사용 가능
  ```

### 클래스 이름 중복 처리
- 패키지 덕분에 같은 이름의 클래스가 있어도 패키지 이름으로 구분하여 사용 가능

### 패키지 규칙
- 패키지의 이름과 위치는 폴더 위치와 같아야 함 (필수)
- 패키지 이름은 모두 소문자 (관례)

### 패키지 활용
- 패키지를 구성할 때 서로 관련된 클래스는 하나의 패키지로 모으고, 관련이 적은 클래스는 다른 패키지로 분리하는 것이 좋음

---

## 섹션 7. 접근 제어자

### 접근 제어자 이해
- 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용 또는 제한할 수 있음
- **private** 접근 제어자는 모든 외부 호출을 차단
  - `private`이 붙은 경우, 해당 클래스 내부에서만 호출 가능

### 접근 제어자 종류
접근 제어자는 다음과 같은 4가지 종류가 있음

| 종류      | 설명                                                         |
|-----------|--------------------------------------------------------------|
| **private**   | 모든 외부 호출 차단                                         |
| **default**   | 같은 패키지 안에서 호출 허용                               |
| **protected** | 같은 패키지에서 호출 허용, 패키지가 달라도 상속 관계에서 호출 허용 |
| **public**    | 모든 외부 호출 허용                                        |

### 접근 제어자 사용
- **클래스 레벨**: 클래스 레벨의 접근 제어자는 `public`과 `default`만 사용 가능
  - `public` 클래스는 반드시 파일명과 이름이 같아야 하며, 하나의 자바 파일에 `public`은 하나만 사용 가능
  - 하나의 자바 파일에 `default` 접근 제어자를 사용하는 클래스는 무한정 생성할 수 있음

### 캡슐화
- 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서 접근을 제한하는 것

#### 캡슐화의 원칙
- **데이터를 숨겨라**: 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터 변경이 가능해져 캡슐화가 깨집니다. 따라서 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해 접근해야 함
- **기능을 숨겨라**: 객체의 기능 중 외부에서 사용하지 않고 내부에서만 사용하는 기능들은 모두 감추는 것이 좋음

### 정리
- 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화

---

## 섹션 8. 자바 메모리 구조와 static

### 자바 메모리 구조
- **메서드 영역**: 클래스 정보를 보관하며, 프로그램 실행에 필요한 공통 데이터를 관리
  - 클래스 정보(실행 코드, 필드, 메서드 등)와 `static` 변수들을 보관
  - 런타임 상수 풀: 공통 리터럴을 저장

- **스택 영역**: 프로그램 실행 시 생성되는 영역으로, 메서드를 호출할 때마다 쌓임
  - 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보를 포함
  - 메서드가 종료되면 해당 스택 프레임이 제거

- **힙 영역**: 객체(인스턴스)와 배열이 생성되는 영역
  - 가비지 컬렉션(GC)이 이루어지는 주요 영역으로, 더 이상 참조되지 않는 객체는 제거됨

### 스택과 큐 자료 구조
- **스택**: LIFO(Last In First Out)
- **큐**: FIFO(First In First Out)

### 스택 영역
- 자바는 스택 영역을 사용하여 메서드 호출과 지역 변수를 관리
- 메서드를 계속 호출하면 스택 프레임이 쌓이며, 지역 변수는 스택 영역에서 관리
- 스택 프레임이 모두 제거되면 프로그램도 종료

### 스택 영역과 힙 영역
- 지역 변수는 스택 영역에서, 객체(인스턴스)는 힙 영역에서 관리
- 메서드 영역은 `static` 키워드로 관리하는 변수를 포함

### static 변수
- **정의**: 멤버 변수에 `static`을 붙이면 정적 변수 또는 클래스 변수로 분류
- **관리**: `static` 변수는 메서드 영역의 `static` 영역에서 관리되며, 인스턴스 영역에서는 관리되지 않음

### 변수와 생명주기
- **지역 변수**: 스택 영역에 보관되며, 메서드 종료 시 제거됨. 생존 주기가 짧음
- **인스턴스 변수**: 힙 영역을 사용하며, GC가 발생하기 전까지 생존. 생존 주기가 길음
- **클래스 변수**: 메서드 영역의 `static` 영역에 보관되며, JVM 로딩 시 생성되어 종료될 때까지 생존. 생존 주기가 가장 김

### static 접근 방법
- **인스턴스를 통한 접근**: 권장하지 않음
- **클래스를 통한 접근**: 권장함

### static 메서드
- **정의**: 메서드 앞에 `static`을 붙이면 정적 메서드(클래스 메서드)로 분류
- **장점**: 객체 생성 없이 클래스에 있는 메서드를 바로 호출할 수 있음
- **사용법**: 정적 메서드는 `static`이 붙은 정적 변수나 정적 메서드만 사용 가능하며, 인스턴스 변수나 인스턴스 메서드는 사용할 수 없음

### 용어 정리
- **멤버 메서드의 종류**:
  - 인스턴스 메서드: `static` 없음
  - 클래스 메서드: `static` 있음 (정적 메서드)
- **import static**: 가능
- **main() 메서드**: 정적 메서드로, `static`만 호출 가능

---
## 섹션 9. Final

### final 변수와 상수
- `final` 키워드를 사용하면 **변수의 값을 변경할 수 없음**
- **초기화 방법**
  - **생성자**: 객체 생성 시 한 번만 초기화 가능
  - **필드**: 모든 인스턴스가 같은 값을 공유 → **메모리 낭비 발생**
    - 해결 방법: `static final` 사용

### static final
- **`static` + `final` 조합**
- **공통적인 값**을 효율적으로 저장하고 재사용
- 중복 선언 방지 & **메모리 사용 최적화**

```java
public class Example {
    static final double PI = 3.14159;  // 모든 인스턴스가 동일한 값을 공유
}
```

#### 상수 (`constant`)
- 변하지 않고 **항상 일정한 값**을 가지는 변수
- `static final`을 사용하여 선언

```java
public static final int MAX_VALUE = 100;
```

---

### final 변수와 참조 

#### final의 역할
- `final`은 **변수의 값을 변경하지 못하게 제한**
- 하지만 참조형 변수의 경우 **참조값 변경만 제한**, 내부 값은 변경 가능

#### 기본형 vs 참조형 변수
| 변수 유형 | `final` 적용 시 변경 가능 여부 |
|-----------|----------------|
| **기본형 변수** | 값 자체 변경 불가 |
| **참조형 변수** | 참조값 변경 불가, 객체 내부 값은 변경 가능 |

```java
final int number = 10;
number = 20;  // 오류! 값 변경 불가

final Person person = new Person();
person = new Person();  // 오류! 참조값 변경 불가
person.setName("John");  // 가능! 객체 내부 값 변경 가능
```

--- 
## 섹션 10. 상속

### 상속

- 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용
- `extends` 키워드 사용 (단일 상속만 가능)

### 상속과 메모리 구조

- 상속받은 자식 클래스를 생성하면 **부모 클래스까지 포함된 인스턴스 생성**
- 외부에서는 하나의 인스턴스처럼 보이지만 내부에서는 **부모와 자식이 모두 생성되고 공간이 구분됨**
- **객체 호출 시, 호출자의 타입을 기준으로 대상 타입을 결정**
- 현재 타입에서 기능을 찾지 못하면 **상위 부모 타입에서 기능을 찾아 실행**

### 상속과 기능 추가

- 중복을 줄이고, 편리하게 기능 확장 (`extend`)

### 상속과 메서드 오버라이딩

#### 메서드 오버라이딩

- 부모에게서 상속받은 기능을 **자식 클래스가 재정의하는 것**
- `@Override` 애너테이션을 사용하여 **상위 클래스의 메서드를 오버라이딩**

#### 오버로딩 vs 오버라이딩

| 개념 | 설명 |
|------|------|
| **메서드 오버로딩** | 같은 이름의 메서드를 **파라미터가 다르게 여러 개 정의** |
| **메서드 오버라이딩** | 하위 클래스에서 **상위 클래스의 메서드를 재정의** |

#### 메서드 오버라이딩 조건

- 메서드 이름이 같아야 함
- **메서드의 파라미터 타입, 순서, 개수**가 같아야 함
- 반환 타입이 같아야 함
- 상위 클래스 메서드보다 **더 제한적인 접근 제어자 사용 불가**
- 상위 클래스의 메서드보다 **더 많은 체크 예외 선언 불가**
- `static`, `final`, `private` 키워드가 붙은 메서드는 오버라이딩 불가
- **생성자는 오버라이딩할 수 없음**

### 상속과 접근 제어

- 상속 시 **부모 클래스의 접근 제어자**에 따라 자식 클래스의 접근 가능 여부가 결정됨
- `public` → 모든 클래스에서 접근 가능
- `protected` → 같은 패키지 또는 자식 클래스에서 접근 가능
- `default` (아무것도 지정하지 않음) → 같은 패키지 내에서만 접근 가능
- `private` → 상속 관계에서도 접근 불가 (오직 해당 클래스 내부에서만 접근 가능)

### `super` - 부모 참조

- 부모와 자식 클래스에서 **필드명이나 메서드명이 같을 경우** 자식 클래스에서 직접 접근 불가
- 이때 `super` 키워드를 사용하면 **부모의 필드나 메서드에 접근 가능**

```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";
    
    void printNames() {
        System.out.println(name);       // Child
        System.out.println(super.name); // Parent
    }
}
```

### `super` - 생성자 호출

- **상속 관계에서는 부모 클래스의 생성자가 반드시 호출되어야 함**
- 자식 클래스의 생성자에서 **기본적으로 부모 클래스의 기본 생성자가 자동 호출됨**
- 명시적으로 부모 클래스의 특정 생성자를 호출하고 싶다면 `super()` 사용

```java
class Parent {
    Parent(String message) {
        System.out.println("부모 생성자: " + message);
    }
}

class Child extends Parent {
    Child() {
        super("Hello from Child"); // 부모 생성자 호출
        System.out.println("자식 생성자");
    }
}
```

- **규칙**: 자식 클래스의 생성자에서 `super()` 호출은 반드시 첫 줄에 작성해야 함

---

# 섹션 11. 다형성 1

## 다형성 시작
**다형성(Polymorphism)**이란?
- "다양한 형태"라는 의미로, **하나의 객체가 여러 타입으로 참조될 수 있는 능력**을 의미

### 다형성을 이해하는 핵심 개념
1. **다형적 참조**
  - 부모 타입 변수는 모든 자식 타입 객체를 참조할 수 있음.
2. **메서드 오버라이딩(Method Overriding)**
  - 자식 클래스에서 부모 클래스의 메서드를 재정의하여 실행 시점에 동적 바인딩

---

## 다형성과 캐스팅
객체의 타입을 변환하는 **캐스팅(Casting)** 개념을 이해함.

### 업캐스팅(Upcasting)
- 자식 타입 → 부모 타입으로 변환 (자동 변환)
- **예시**
  ```java
  Parent p = new Child(); // 업캐스팅
  ```

### 다운캐스팅(Downcasting)
- 부모 타입 → 자식 타입으로 변환 (명시적 변환 필요)
- **예시**
  ```java
  Child c = (Child) p; // 다운캐스팅
  ```

---

## 캐스팅의 종류
### 일시적 다운캐스팅
- 특정 조건에서만 잠깐 다운캐스팅을 수행하는 경우.

### 업캐스팅
- 자식 객체를 부모 타입으로 변환하는 과정.

---

## 다운캐스팅과 주의점
다운캐스팅은 잘못 사용하면 **심각한 런타임 오류**를 유발할 수 있음

### 업캐스팅이 안전하고 다운캐스팅이 위험한 이유
1. **객체를 생성하면 부모 타입 인스턴스는 항상 함께 생성됨**
2. **업캐스팅은 이미 존재하는 부모 타입이므로 안전**
  - 메모리에 부모 타입의 인스턴스가 존재하므로 변환이 가능하고 생략도 가능
3. **다운캐스팅은 존재하지 않는 자식 타입으로 변환될 위험**
  - 객체를 생성해도 자식 타입은 별도로 생성되지 않음.
  - 존재하지 않는 필드나 메서드에 접근하면 **런타임 오류 발생**

### 컴파일 오류 vs 런타임 오류
| 오류 종류 | 발생 시점 | 예시 |
|-----------|----------|------|
| **컴파일 오류** | 코드 작성 단계 | 문법 오류, 선언되지 않은 변수 사용 |
| **런타임 오류** | 프로그램 실행 중 | `ClassCastException`, `NullPointerException` |

---

## instanceof
**참조하는 객체의 실제 타입을 확인하는 연산자**

```java
if (obj instanceof Child) {
    Child c = (Child) obj; // 안전한 다운캐스팅
}
```

- 다운캐스팅 전에 `instanceof`로 타입을 확인하면 런타임 오류를 방지할 수 있음.

---

## 다형성과 메서드 오버라이딩
- **오버라이딩된 메서드가 항상 우선적으로 실행** (동적 바인딩).
- 부모 클래스 타입으로 호출하더라도, **실제 객체 타입의 메서드가 실행**.

---




📌 _이 문서는 [김영한의 실전 자바 기본편](https://www.inflearn.com/course/%EA%B9%80%EC%98%81%ED%95%9C%EC%9D%98-%EC%8B%A4%EC%A0%84-%EC%9E%90%EB%B0%94-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard) 강의를 정리한 내용입니다._
