## [Ex09] 사각형 2

### 1. 목표
* 지정한 수 만큼의이 높이(N)를 가지는 사각형을 `*`을 이용해 그린다.
* 빈 공간이 있는 경우 내부에 사격형을 추가로 그린다.


### 2. 실행예시

* N=3

```
***
* *
***
```

* N=5

```
*****
*   *
* * *
*   *
*****
```

* N=7

```
*******
*     *
* *** *
* * * *
* *** *
*     *
*******
```

* N=10

```
**********
*        *
* ****** *
* *    * *
* * ** * *
* * ** * *
* *    * *
* ****** *
*        *
**********
```


### 3. 구현
* `Main.java`의 `printStar` 함수 안에 작성