# 디자인 패턴 모음

이 레포는 패턴별로 예제 코드와 문서를 정리합니다. 문서는 `docs/` 아래에 있으며, 아래 인덱스에서 바로 이동할 수 있습니다.

예제 코드는 가능하면 문제 상황(적용 전)과 해결(적용 후)을 함께 제공합니다. `problem/`와 `resolve/` 구조를 따라 비교가 쉽도록 구성합니다.

## 문서 인덱스

- 구조 패턴
   - [퍼사드 (Facade)](<docs/퍼사드(Facade).md>)
- 생성 패턴
   - [싱글턴 (Singleton)](<docs/싱글턴(Singleton).md>)
- 행위 패턴
   - [전략 (Strategy)](<docs/전략(Strategy).md>)
   - [템플릿 메소드 (Template Method)](<docs/템플릿메소드(TeamplateMethod).md>)
   - [상태 (State)](<docs/상태(State).md>)

## 코드 루트
- 소스 루트: `src`
  - 파사드 예제: `src/structural/facade/...`
    - 문제(problem): `src/structural/facade/problem/...`
    - 해결(resolve): `src/structural/facade/resolve/...`
  - 전략 예제: `src/behavioral/strategy/...`
    - 문제(problem): `src/behavioral/strategy/problem/...`
    - 해결(resolve): `src/behavioral/strategy/resolve/...`
  - 템플릿 메소드 예제: `src/behavioral/templateMethod/...`
    - 문제(problem): `src/behavioral/templateMethod/problem/...`
    - 해결(resolve): `src/behavioral/templateMethod/resolve/...`
  - 상태 예제: `src/behavioral/state/...`
    - 문제(problem): `src/behavioral/state/problem/...`
    - 해결(resolve): `src/behavioral/state/resolve/...`
  - 싱글턴 예제: `src/creational/singleton/...`
    - 문제(problem): `src/creational/singleton/problem/...`
    - 해결(resolve): `src/creational/singleton/resolve/...`

필요한 패턴을 더 추가하거나 정리 포맷을 바꾸고 싶으시면 알려주세요.
