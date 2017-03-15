
# 안드로이드 스튜디오 기본 설정

----------


 * Logcat 설정
  * 안드로이드 개발시 버그가 발생하면 해당 경로에 보통 `Log.d()`를 코드에 추가하여 `logcat`을 통하여 값을 확인한다. 그러나 `logcat`에는 많은 정보가 나오기 때문에 필터링을 통해 확인하지만 출력되는 글자 색이 같기 때문에 내가 `Log.d()`로 확인한 값이 한눈에 들어 오지 않는다. 그래서 각각의 로그마다 색상을 다르게 주는 방법에 대해 알려주려고 한다.
  * `[File] > [Settings] > [Editor] > [Color & Fonts] > [Android Logcat]`으로 간다. 이곳에서 각 로그마다 `Forground`색상을 체크하여 변경을 한다.  체크가 안된다면 체크박스 하단에 `Use inherited attributes`의 체크를 풀면 된다. 각 로그마다 추천하는 색상은 다음과 같다.( 본 색상은 테마가 Dracula의 경우 이다.)
 
  * 로그별 추천하는 색상
> Debug : 6897BB  
> Info : 6A8759   
> Warn : BBB529   
> Warn : BBB529   
> Error : FF6B68   
> Assert : 9876AA

  * 다음 화면은 Logcat이 설정된다.
![Log 화면](https://github.com/juniair/Android-Development-Tips/juniair/master/screenshot/logcat.PNG)

 *  **자동으로 `import`하는 방법** 

  * 작업을 하다보면 다른 패키지에 있는 클래스를 사용할때 클래스 선언후 `[Alt] + [Enter]`를 입력해야  해당 클래스가 있는 패키지가 `import`된다. 이런 불편한 점 역시 해결하는 방법이 있다.
  * `[File] > [Settings] > [Editor] > [General] > [Auto Import]`에 들어가서 `Optimize imports on the fly`와 `Add unambiguous imports on the fly`를 체크 해주면 자동으로 패키지를 추가하고 해당 패키지를 사용을 안하면 자동으로 추가한 `import`를 지운다. 
  * ![](https://github.com/juniair/Android-Development-Tips/juniair/master/screenshot/autoimport.PNG)
