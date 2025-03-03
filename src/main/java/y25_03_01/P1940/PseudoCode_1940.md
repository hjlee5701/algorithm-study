- N = 재료의 개수 N
- M = 2개의 재료를 더한 값 M
- num[N] = 재료들의 고유 번호

- for (N만큼 반벅)
  - num[] 배열 정수로 초기화 하기

- num[] 오름차순 정렬

- count = 0
- start = 1
- end = N-1

- while (start != endIdx)
  - if (num[start] + num[end] == M)
    - count ++
    - start ++
    - end --
  - else if (num[start] + num[end] < M)
    - start++
  - else (num[start] + num[end] > M)
    - end--

- count 출력
