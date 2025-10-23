package CodingTest;

public class Test01 {
    public static String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = rsp.toCharArray();
        for (char c : charArray) {
            if (c == '2') {
                sb.append('0');
            } else if (c == '0') {
                sb.append('5');
            } else {
                sb.append('2');
            }
        }
        return sb.toString();
    }

    public static int solution(String[] babbling) {
        String[] cooing = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String bab : babbling) {
            bab = bab.replace("aya", "");
            bab = bab.replace("ye", "");
            bab = bab.replace("woo", "");
            bab = bab.replace("ma", "");
            if (bab.isEmpty()) {
                answer++;
            }
        }

//        for (String bab : babbling) {
//            for (String coo : cooing) {
//                bab = bab.replace(coo, "뿡");
//            }
//            if (bab.replaceAll("뿡", "").equals("")) {
//                answer++;
//            }
//        }
        return answer;
    }


    public static void main(String[] args) {
        // 1) 대소문자 바꿔서 출력하기
        // 입력: aBcDeFg => 출력: AbCdEfG
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();
//
//        char[] charArray = a.toCharArray();
//        char[] charUpper = a.toUpperCase().toCharArray();
//        char[] charLower = a.toLowerCase().toCharArray();
//        char[] answer = new char[charArray.length];
//
//        for (int i = 0; i < charArray.length; i++) {
//            if (charArray[i] != charUpper[i]) {
//                answer[i] = charUpper[i];
//            } else {
//                answer[i] = charLower[i];
//            }
//        }
//
//        String str = String.valueOf(answer);
//        System.out.println(str);

        // 2) 옹알이
        /*머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
        조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을
        최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
        문자열 배열 babbling이 매개변수로 주어질 때,
        머쓱이의 조카가 발음할 수 있는 단어의 개수를
        return하도록 solution 함수를 완성해주세요.*/
        String[] coo = {"ayaye", "yee", "wooye", "maa"};
        System.out.println(solution(coo));

//        System.out.println(solution("2052"));
    }
};
