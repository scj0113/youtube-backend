# youtube-backend

youtube clone project

## JPA(Java Persistence API)

- 자바 언어로 DB에 명령을 내리는 도구
- 데이터를 객체 지향적으로 관리

### Entity(엔티티)

- 자바 객체를 DB가 이해할 수 있도록 만드는 역할
- 이를 기반으로 테이블 생성이 되기도 함
- @Entity : 이 어노테이션이 붙은 클래스를 기반으로 DB 테이블 생성 가능 (테이블이 존재하지 않을 시)
- @Id : 엔티티의 대표 값 (Primary Key)
- @GeneratedValue : 대표값을 자동으로 생성 (시퀀스와 관련)
- @Column : 엔티티의 대표값 이외의 값들

### Repository(레포지토리)
