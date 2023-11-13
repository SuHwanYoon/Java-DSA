package codingchallenges;

public class ReversInteger {
    public static void main(String[] args) {
        ReversInteger reversInteger = new ReversInteger();
        int result = reversInteger.reverse(54321);
        System.out.println(result);
    }

    public int reverse(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;

            // 루프가 끝나기 전에 오버플로우 확인
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }

            input = input / 10;
        }

        // 반환 값은 int 형이므로 long에서 int로 캐스트
        return (int) reversed;
    }

}


