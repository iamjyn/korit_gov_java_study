package _31_StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        final int lengths = 200000;

        // String 시간
        long startTime1 = System.currentTimeMillis(); // 시작

        String str = "";
        for (int i = 0; i < lengths; i++) {
            str = str + "*";
        }

        long endTime1 = System.currentTimeMillis(); // 끝
        long duration = endTime1 - startTime1;
        System.out.println("String 시간: " + duration);


        // StringBuffer 시간
        long startTime2 = System.currentTimeMillis(); // 시작

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lengths; i++) {
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis(); // 끝
        long duration2 = endTime2 - startTime2;
        System.out.println("StringBuffer 시간: " + duration2);


        // StringBuilder 시간
        long startTime3 = System.currentTimeMillis(); // 시작

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < lengths; i++) {
            sb2.append("*");
        }

        long endTime3 = System.currentTimeMillis(); // 끝
        long duration3 = endTime3 - startTime3;
        System.out.println("StringBuilder 시간: " + duration3);
    }
}
