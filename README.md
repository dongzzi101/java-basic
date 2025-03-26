# 객체 지향 프로그래밍 강의 정리

## 📖 목차
- [📌 섹션 2. 클래스와 데이터](#섹션-2-클래스와-데이터)
- [📌 섹션 3. 기본형과 참조형](#섹션-3-기본형과-참조형)
- [📌 섹션 4. 객체 지향 프로그래밍](#섹션-4-객체-지향-프로그래밍)
- [📌 섹션 5. 생성자](#섹션-5-생성자)
- [📌 섹션 6. 패키지](#섹션-6-패키지)
- [📌 섹션 7. 접근제어자](#섹션-7-접근-제어자)

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



📌 _이 문서는 [김영한의 실전 자바 기본편](https://www.inflearn.com/course/%EA%B9%80%EC%98%81%ED%95%9C%EC%9D%98-%EC%8B%A4%EC%A0%84-%EC%9E%90%EB%B0%94-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard) 강의를 정리한 내용입니다._
