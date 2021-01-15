package Third;

public class Exercise8 {
    public static void main(String[] args) {
        // 1 ~ 30 까지의 숫자 중 2 혹은 3의 배수는 더하고 5의 배수는 뺀다.
        // 혼동의 여지를 방지하기 위해
        // 10 처럼 2의 배수 이면서 5의 배수가 되는 경우엔
        // 빼기도 하고 더하기도 하므로 결론적으로 0
        int sum = 0;

        // Q: 도대체 언제 0 을 설정해야 하는가요 ?
        // A: 컴퓨터 초기값으로 0을 설정하지 않는다.
        //    기본적으로 컴퓨터는 초기 변수를 0으로 설정하지 않기 때문에
        //    0으로 초기화 하지 않은 값은 알 수 없는 이상한 값을 가지고 있다.
        //    값을 누산하는 변수가 된다면
        //    잘못도니 연산을 수행하지 않도록 0으로 초기화 해야 한다.

        // ex) 현재 내가 가지고 있는 박스 A
        //     현재 A는 빈 박스
        //     친구네 집 박스는 B
        //     현재 B에는 2개가 들어 있음
        //     B의 내용물을 A로 옮긴다 하면 자연스럽게 0 + 2 로 2가 된다.
        //     그러나 컴퓨터에 이를 명확하게 0으로 초기화 해주지 않으면
        //     ???(알 수 없는 미지의 값) + 2의 형식으로 진행된다.
        //

        for (int i = 1; i < 31; i++) {
            // 더하기 파트
            if (i % 2 == 0 || i % 3 == 0) {
                sum += i;
                System.out.println("더하는 값 = " + i);
            }

            // 빼기 파트
            if (i % 5 == 0) {
                sum -= i;
                System.out.println("빼는 값 = " + i);
            }
        }
        System.out.println("결과 = " + sum);
    }
}