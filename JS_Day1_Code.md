# 05/16_JS Day01 Code

- 2022-05-16 Day25



https://github-readme-stats.vercel.app/api/pin/?username=noranbear&repo=TIL

```stat catds
 [![Anurag's github stats](https://github-readme-stats.vercel.app/api?username=username)](https://github.com/anuraghazra/github-readme-stats)
```

## 프로젝트 생성

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

t 메뉴와 센터를 같이 움직이는 webpage 만들기

