# 카드 놓기

## 문제
상근이는 카드 n(4 ≤ n ≤ 10)장을 바닥에 나란히 놓고 놀고있다. 각 카드에는 1이상 99이하의 정수가 적혀져 있다. <br>
상근이는 이 카드 중에서 k(2 ≤ k ≤ 4)장을 선택하고, 가로로 나란히 정수를 만들기로 했다.  <br>
상근이가 만들 수 있는 정수는 모두 몇 가지일까?

예를 들어, 카드가 5장 있고, 카드에 쓰여 있는 수가 1, 2, 3, 13, 21라고 하자. <br>

여기서 3장을 선택해서 정수를 만들려고 한다. 2, 1, 13을 순서대로 나열하면 정수 2113을 만들 수 있다. <br>
또, 21, 1, 3을 순서대로 나열하면 2113을 만들 수 있다. <br>
이렇게 한 정수를 만드는 조합이 여러 가지 일 수 있다.


n장의 카드에 적힌 숫자가 주어졌을 때, 그 중에서 k개를 선택해서 만들 수 있는 정수의 개수를 구하는 프로그램을 작성하시오.

---
## 입력
첫째 줄에 n이, 둘째 줄에 k가 주어진다. 셋째 줄부터 n개 줄에는 카드에 적혀있는 수가 주어진다.

---
## 출력
첫째 줄에 상근이가 만들 수 있는 정수의 개수를 출력한다.

---
### 예제 입출력 1
4 <br>
2 <br>
1 <br>
2 <br>
12 <br>
1 <br>

7 <br>


### 예제 입출력 2
6 <br>
3 <br>
72 <br>
2 <br>
12 <br>
7 <br>
2 <br>
1 <br>

68

---
### 힌트
예제 1의 경우 상근이는 11, 12, 21, 112, 121, 122, 212를 만들 수 있다.

---
### 풀이
- [1, 2, 3] 중 2개의 카드를 선택한다.

- 재귀 호출 : 반복문의 visited 검사로 바로 재귀 호출이 안 될 수 있다. (ex. 13, 21)

- 리턴 : 카드 조합이 추가되는 시점이다.

- Backtrack : visited 값을 false 로 변경시킨다.

| Step | Index | Visited            | CurrentCombination | Action          |
|------|-------|--------------------|--------------------|-----------------|
| 1    | 0     | [True, False, False] | 1                  | 재귀 호출       |
| 2    | 1     | [True, True, False]  | 12                 | 재귀 호출       |
| 3    | 2     | [True, True, False]  | 12                 | 리턴           |
| 4    | 1     | [True, False, False] | 1                  | Backtrack       |
| 5    | 2     | [True, False, True]  | 13                 | 재귀 호출       |
| 6    | 2     | [True, False, True]  | 13                 | 리턴           |
| 7    | 2     | [True, False, False] | 1                  | Backtrack       |
| 8    | 1     | [False, True, False] | 2                  | 재귀 호출       |
| 9    | 0     | [True, True, False]  | 21                 | 재귀 호출       |
| 10   | 2     | [True, True, False]  | 21                 | 리턴           |
| 11   | 0     | [False, True, False] | 2                  | Backtrack       |
| 12   | 2     | [False, True, True]  | 23                 | 재귀 호출       |
| 13   | 2     | [False, True, True]  | 23                 | 리턴           |
| 14   | 2     | [False, True, False] | 2                  | Backtrack       |
| 15   | 2     | [False, False, True] | 3                  | 재귀 호출       |
| 16   | 0     | [True, False, True]  | 31                 | 재귀 호출       |
| 17   | 2     | [True, False, True]  | 31                 | 리턴           |
| 18   | 0     | [False, False, True] | 3                  | Backtrack       |
| 19   | 1     | [False, True, True]  | 32                 | 재귀 호출       |
| 20   | 2     | [False, True, True]  | 32                 | 리턴           |
| 21   | 1     | [False, False, True] | 3                  | Backtrack       |

