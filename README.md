# GrowBeggars

거지 키우기 게임입니다. MVC 기반 아키텍처 설계를 도입하였습니다. 구걸, 각설이 타령 등을 통해 돈을 벌수 있습니다. 몬스터를 잡아서 경험치를 얻을 수도 있습니다.

## 패키지 구조
 - constants : 게임에 필요한 상수들을 담았습니다.
 - controller : 게임의 데이터를 관리하는 manage 와 게임의 입출력을 담당하는 view 사이의 적절한 중계를 담당합니다.
    - input : game 의 input 을 담당합니다.
    - output : game 의 output 을 담당합니다.
 - manage : 게임의 model 데이터를 관리하는 역할을 합니다.
 - model : 게임의 데이터 자체를 나타냅니다.
 - test : 게임에 대한 자동화 테스트를 담당합니다.
 - view : 게임의 입출력을 담당합니다.
 - GrowBeggars : dependency injection 등을 담당하여 게임을 초기화 하는 역할을 합니다.
