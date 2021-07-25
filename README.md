# myBoard

### 목표
* 게시판 REST API 서비스 제작.
* Spring Boot와 MySQL을 이용.
* RESTful API에 대한 이해와 Spring 제품군에서 Spring Boot의 활용능력에 대한 이해를 확인.

### 요구사항
* Spring Boot와 MySQL을 사용
* MVC 모델로 구현 (view는 없으니, controller와 model만 고려)
* 입력, 수정, 조회, 삭제 기능을 위해 INSERT, UPDATE, SELECT, DELETE 4가지로 구현.
* DB 스키마는 자유롭게 설계
* 응답결과는 json 포맷으로.

### 산출물
* 요구사항을 만족하는 소스, 실행방법(README)
* DB스키마(ERD or SQL)
* API 호출 예시와 기대 결과 예시 (API 설계 문서)

### API List
* 게시물 생성	        POST	/api/board/doc
* 게시물 수정	        PUT	    /api/board/{docId}
* 게시물 조회	        GET	    /api/board/{docId}
* 게시물 상태 변경	    PUT	    /api/board/{docId}/change
* 게시물 삭제	        DELETE	/api/board/{docId}
> 구체적인 내용은 별도 문서 참조 

### Table
* 게시판 관리	MYB_BOARD
> 구체적인 내용은 별도 문서 참조

### DB Info
* 버전: mysql8.0
* Persistence Framework: Mybatis

### 추가 라이브러리
* 롬복(lombok)
    * 코드를 작성할 때 꼭 필요하지만 기계적으로 작성해야 하는 부분을 자동화해주는 라이브러리
    * ex) 클래스의 Getter, Setter, toString을 Annotation 선언으로 단순화할 수 있다.


### 설치 방법
1. MySQL 8.0이 설치되어 있어야 함.
2. database와 table 설정은 resources->sql 디렉토리에 포함된 파일을 이용.
3. application.yml에서 테스트할 MySQL의 주소 및 포트 변경.
4. Maven Install  
5. 포함된 target 디렉토리에서 다음 명령어 입력하여 실행.
   
      `java -jar myBoard-1.0-SNAPSHOT.jar`
6. Postman등 Rest Test Client를 이용하여 API 테스트 진행.
