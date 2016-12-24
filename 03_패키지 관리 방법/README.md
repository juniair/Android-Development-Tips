
# 패키지 작성 방법

----------
##### java에서 어떠한 클래스를 사용하기 위해서는 패키지 `import`하여 사용한다.
```{.java}
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	}
}
```
#####  이처럼 패키지로 클래스들은 라이브러리 처럼 관리를 하기 때문에 해당 클래스가 어떤 클래스인지 쉽게 알수 있다. 안드로이드 개발시에도 같은 맥락으로 보면되다. 자신이 만든 클래스가 어떤 클래스 인지 정리를 하면 나중에 코드를 수정하거나 재사용시 찾기가 편해진다. 이 문서는 패키지를 어떻게 작성하면 좋은지에 대해서 설명하려고 한다.

 > - 패키지 하나에 관련 있는 클래스와 인터페이스로 묶는다.
 > - 관련이 있다는 것은 클래스명의 의미가 비슷한 것끼리를 의미 한다.
 > - 패키지 이름은 해당 클래스명에서 공통적으로 사용하는 단어로 하면 된다.
 > - 만약 패키지의 또 다른 하위 패키지를 만들때는 묶어놓은 클래스에서 비슷한 것끼지 묶어 만들고 해당 패키지 명은 공통적인 기능으로 한다.
 > - 모여 있지 않는 클래스들은 자신의 규칙에 맞게 패키지 이름을 만들고 패키지 이름은 공통적인 기능
 > > 예시 
 >  `activity` : `MainActivity`, `LoginActivity` 클래스와 같이 `activity`와 관련된 클래스와 인터페이스가 모여 있는 패키지
 >  `adapter` : `MemberAdapter`, `ModelAdapter` 클래스와 같이 `adapter`와 관련된 클래스와 인터페이스가 모여 있는 패키지
 >  `app` : 앱 전체적인 흐름에 사용 되는 클래스들의 패키지
 >  `app.utils` : `app` 패키지에 있는 클래스들 중에서 어떠한 처리를 위해 만든 클래스들의 패키지
 
##### 나는 다음과 같이 패키지를 나누었다.
![패키지명](https://github.com/juniair/Android-Development-Tips/blob/master/03_%ED%8C%A8%ED%82%A4%EC%A7%80%20%EA%B4%80%EB%A6%AC%20%EB%B0%A9%EB%B2%95/sceenshot/package.PNG)
