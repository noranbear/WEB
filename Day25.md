# Day25

- 2022-05-16
- 교재 받기 (카페) - 기본적으론 이 교재 참고, + 응용적인 것은 개인적으로 받은 교재 2개 사용
- JavaScript day1

----

## 서버세팅

- 프로젝트 day05 생성 

  - thymeleaf dependency 추가

    >  tomcat, json, web 관련은 생성 단계에서 추가 할 수 없기에 pom.xml에 직접적으로 추가한 것.

  - appliaction 마지막 두 줄 지우기

    - jsp 아닌 thymeleaf를 사용할 것이기 때문에

  - java 폴더 밑에 controller 패키지 및 controller 생성

    - 패키지 이름 com.multi 부터 시작해야함
    - 프로젝트 생성할 때 그렇게 path를 생성해놨기 때문

- Controller class

  - main method 생성

- tamplate 폴더

  - main.html 생성
    - 이건 html이 아니다. 
    - "/"을 서버에 보내면 main.html이 올라오고 여기서 html을 생성해서 브라우저로 보낸다.
    - thymeleaf 태그 넣기

  > 생성할 때 자동으로 선택된 폴더에 넣을 수 있는 방법 찾기

  - 다른 html 파일들 복붙

    - controller도 화면 나오게 연결

    

---

- left 메뉴와 센터를 같이 움직이는 webpage 만들기



---

- 교과서

  - HTML5의 필요성

    - HTML4의 한계 극복
    - 다이나믹 화면 반영 - 실시간 데이터 반영

  - HTML5 신규 기능

    - WEB Storage

      - *브라우저에 데이터베이스가 있다
        - 화면에 있는 내용을 브라우저에 저장을 해서 잠시 가져올 수 있다.

    - 드래그 앤 드롭

    - 지오로케이션

      - 웹에서 지도가 나옴

      - 웹부라우저가 현재 나의 위치를 알 수 있다

        - 네트워크 게이트웨이 위치를 알고 있는 것. ex) 위워크 건물을 알고 있는 것.

          or

          GPS

    - 캔버스 2D

      - 게임을 이제 브라우저로 할 수 있다 (그래픽)
      - 웹 워커
      - 인덱스트 DB

    - Server Sent Events

      - 새로고침 안해도 웹 브라우저 화면에 데이터 자동 업데이트

    - 웹 소켓

  - HTML5 세가지 구성

  - CSS - CSS 3.0 - P 75

    - N Screen
    - 반응형 웹

  - JS - P82

    - 스크립트 언어 - 자바랑 다름
    - 브라우저에서만 동작

  - What is JavaScript

    - ECMAScript
    - 2005년 AJAX
    - 향후 jQuery로 진화 2006년- 네이버는 안 씀

  - 필요성

    - CSS 변경
    - 이벤트 처리
    - 웹 페이지의 모든 프로그램 부분

  - 구조  및 Sytax

    - 위치 선언

      - <head></head> 사이

      - 문서안 - js01.html

      - External JavaScript

    - 자바 스크립트 실행 흐름

      - 위부터 아래로
      - alert가 일어나면 확인 누를 때까지 멈춰있음.

    - **window.onload - js01.html

    - 웹사이트 devTool에서 에러메시지와 라인을 확인 가능.

    - 특정 영역에 스트링 값 출력 - js01.html

    - 콘솔 log 출력 - js01.html

      - **console.log
      - devtools > console에 출력됨.
      - 연산값을 콘솔에다 찍어가며 확인하고 화면에 최종값만 찍을 수 있음

  - Identifiers - p95

    - java와 같음

  - data type 7개 - js02

    - Undefined
    - 숫자 (number)
    - 문자 (String)
    - Boolean
    - 배열 (array)
    - 객체 (obj)
      - JSON
    - 함수

    > html, css, js가 다 모여 웹 클라이언트가 구현된다.

  - 함수

    - typeof: 변수의 타입을 가져온다.
    - Number(): number 타입으로 바꿈
    - parseInt(): 정수형으로 변경
    - parseFloat(): 실수형으로 변경
    - ==> 숫자가 아닐 경우 NaN 리턴 (not a number)

    > 화면에서 입력한 모든 값은 String 이다.

    - Number 함수
      - toString(): number를 String으로 변경
      - toFixed(): 특정 수까지 반올림하여 문자화
      - toPrecision(): 특정 수에서 반올림하여 문자화
    - Math class - js03.html
      - js도 자바처럼 기본적으로 주는 게 있다.
    - *Stirng functions - p 101 - js03.html

    > JS는 코드가 길어서 jQuery가 나옴
    >
    > js는 컴파일 언어가 아니어서 실행 후 에러 확인 가능 - devTool > console에서

    - array function
      - array.Length - js04.html
    - 함수 - js05.html
      - javaScript 리턴 타입 존재x
      - 항상 함수는 위에서 선언하고 밑에서 사용하자.
      - 자바와 다르게 argument 타입도 존재x
        - 모든 변수의 타입이 var이기 때문에 (var 생략됨 - 근데 var 쓰면 에러남 ㅋㅋㅋ)
      - ***함수의  스페셜 경우 -js05.html
        1. 함수 리턴
        2. 함수 argument
    - 계산기 - js06.html



- WS
  - js07.thml
  - 계산기 구현
    - 바로바로 계산되고 최종 결과값 나오기
    - 버튼