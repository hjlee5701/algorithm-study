- N 을 입력 받는다.
- StringTokenizer st 선언 : N개의 수를 입력받는다.

- int[] nums 선언
- for(N만큼 반북)
  - st.nextToken 값을 정수 배열에 추가한다.
- nums 정렬

- 정수 idx 를 N 으로 초기화
- 정수 count 를 0으로 초기화

- while(k를 0~N까지)
  - 변수 초기화 (시작 포인터 start, 마지막 포인터 end, 찾고자 하는 값 mayGood) 
  - while (start < end)
    - if (nums[start] + nums[end] == 찾는 값)
      - 두 포인터가 k가 아닐 때, count++ 후 반복문 멈추기
      - 두 포인터가 k 인 경우, 포인터 값 변경 (+1, -1)
    - else if (nums[start] + nums[end] < 찾는 값)
      - 시작 포인터 ++
    - else
      - 마지막 포인터 --

- count 출력