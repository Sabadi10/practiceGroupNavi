public class ConsecutiveNumbers {

    public static void main(String[] args) {
        codilityCode(95);
    }

    public static void codilityCode(int N) {
        for (int i = 1; i <= N; i++) {
            StringBuilder lar = new StringBuilder();

            if (i % 2 == 0) {
                lar.append("Codility");
            }
            if (i % 3 == 0) {
                lar.append("Test");
            }
            if (i % 5 == 0) {
                lar.append("Coders");
            }

            if (lar.length() > 0) {
                System.out.println(lar);
            } else {
                System.out.println(i);
            }
        }
    }
}


// 
