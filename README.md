# 디자인 패턴 모음

이 레포는 패턴별로 예제 코드와 문서를 정리합니다. 문서는 `docs/` 아래에 있으며, 아래 인덱스에서 바로 이동할 수 있습니다.

예제 코드는 가능하면 문제 상황(적용 전)과 해결(적용 후)을 함께 제공합니다. `problem/`와 `resolve/` 구조를 따라 비교가 쉽도록 구성합니다.

## 문서 인덱스

- 구조 패턴
   - [어댑터 (Adapter)](<docs/어댑터(Adapter).md>)
   - [브릿지 (Bridge)](<docs/브릿지(Bridge).md>)
   - [데코레이터 (Decorator)](<docs/데코레이터(Decorator).md>)
   - [플라이웨이트 (Flyweight)](<docs/플라이웨이트(Flyweight).md>)
   - [프록시 (Proxy)](<docs/프록시(Proxy).md>)
   - [퍼사드 (Facade)](<docs/퍼사드(Facade).md>)
- 생성 패턴
   - [추상 팩토리 (Abstract Factory)](<docs/추상팩토리(AbstractFactory).md>)
   - [빌더 (Builder)](<docs/빌더(Builder).md>)
   - [팩토리 메소드 (Factory Method)](<docs/팩토리메소드(FactoryMethod).md>)
   - [싱글턴 (Singleton)](<docs/싱글턴(Singleton).md>)
- 행위 패턴
   - [방문자 (Visitor)](<docs/방문자(Visitor).md>)
   - [중재자 (Mediator)](<docs/중재자(Mediator).md>)
   - [옵져버 (Observer)](<docs/옵져버(Observer).md>)
   - [전략 (Strategy)](<docs/전략(Strategy).md>)
   - [템플릿 메소드 (Template Method)](<docs/템플릿메소드(TeamplateMethod).md>)
   - [상태 (State)](<docs/상태(State).md>)


## 개발자가 필수로 알아야 하는 디자인 패턴

### ⭐ 핵심 패턴 (필수)
- **싱글턴 (Singleton)** - 전역 상태 관리
- **빌더 (Builder)** - 복잡한 객체 생성
- **팩토리 메소드 (Factory Method)** - 객체 생성 추상화
- **옵져버 (Observer)** - 이벤트 기반 통신
- **전략 (Strategy)** - 알고리즘 교체
- **어댑터 (Adapter)** - 인터페이스 호환성

### ⚠️ 주의해서 사용할 패턴
- **방문자 (Visitor)** - trade-off가 큼: 새로운 기능 추가는 쉽지만, 새로운 concrete class 추가 시 모든 visitor에 메소드를 추가해야 함
- **추상 팩토리 (Abstract Factory)** - 과도한 추상화로 인한 복잡성 증가 위험

### 📚 상황별 선택 패턴  
- **데코레이터 (Decorator)** - 객체에 동적으로 기능 추가
- **중재자 (Mediator)** - 복잡한 객체 간 통신
- **템플릿 메소드 (Template Method)** - 공통 알고리즘 뼈대
- **상태 (State)** - 상태별 행위 변경
- **프록시 (Proxy)** - 지연 로딩, 접근 제어
- **퍼사드 (Facade)** - 복잡한 서브시스템 단순화
- **브릿지 (Bridge)** - 추상화와 구현 분리
- **플라이웨이트 (Flyweight)** - 메모리 최적화

필요한 패턴을 더 추가하거나 정리 포맷을 바꾸고 싶으시면 알려주세요.
