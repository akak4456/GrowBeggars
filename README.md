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

## 설계상 결함 및 논쟁점
 - Constants.java 에 item 상수 정보, mob 상수 정보 등을 담는데 이는 상수 정보가 변경이 되면 재컴파일을 해야 함을 의미합니다. 이것은 상당히 번거로운 것으로 사실 텍스트 파일 등을 이용해서 그걸 읽어들이는 형태로 하는것이 더 맞습니다.
 - Controller 에 필요한 input(Scanner 클래스의 일종), output(System.out 의 일종) 을 일부러 분리하였습니다. 이는 test 패키지 안에 있는 것을 보면 이해할 수 있으며 기존의 Scanner 를 이용한 입력을 하면 자동화 테스트가 제대로 진행이 되지 않기 때문입니다.
 - ManageBeggar.java 를 보면 다음의 코드를 볼 수 있습니다.
``` java
public ArrayList<AutoMoneyMachine> getMachines() {
		return beggar.getMachines();
}
```
이는 나중에 보안 문제, 상태 무결성 등에 영향을 미칠 수 있는 요소입니다. 왜냐하면 AutoMoneyMachine 같은 경우 그 객체 내의 필드를 바꿀 수 있기 때문입니다. 그래서 악의적인 사용자가 이 리스트를 얻어서 AutoMoneyMachine 을 임의로 변경할 수도 있습니다. 이는 명백히 의도한 사안이 아니며 확인을 해봐야겠지만 아마 저 getMachines() 함수에서 AutoMoneyMachine 은 읽기용으로만 쓰여야 할 것입니다. 따라서 방어적 복사를 수행하는 작업이 필요해보입니다.
