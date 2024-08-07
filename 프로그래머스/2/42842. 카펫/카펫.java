class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            // 전체 사각형 타일 개수
            int sum = brown+yellow;

            for (int i=3; i<=Math.sqrt(sum); i++) {
                if (sum % i == 0) { // 현재 i가 전체 사각형 개수의 약수인 경우
                    int x = i; // 가로
                    int y = sum / i; // 세로
                    if ((x - 2) * (y - 2) == yellow) { // 노란색 타일의 개수 = 내부 타일 = (가로 길이 - 2) * (세로 길이 - 2)로 계산
                        answer[0] = Math.max(x,y); answer[1] = Math.min(x,y);
                    }
                }
            }
            return answer;
        }
    }