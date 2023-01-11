public class Main {
    public static void main(String[] args) {
        int [] nova = {12, 26, 48, 78, 98, 22, 11, 13, 75, 36};
        novanova(nova);
    }

    public static int [] novanova (int [] nova) {
        int a = 0;
        for (int i = 0; i < nova.length; i++) {
            if (nova[i] % 2 == 0) {
                nova[i] = nova[i] +1;
            }
            System.out.println(nova[i]);
        }
        for (int i = 2; i < 7; i++) {
            a = nova[i];
        }
            return new int[] {a};
    }
}