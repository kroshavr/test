public class Main {
    public static void main(String[] args) {
        novanova();
    }
    public static int [] novanova () {
        int [] nova = {12, 26, 48, 78, 98, 22, 11, 13, 75, 36};
        for (int i = 0; i < nova.length; i++) {
            if (nova[i] % 2 == 0) {
                nova[i] = nova[i] +1;
            }
            System.out.println(nova[i]);
        }
        return new int[] {nova[2], nova[3], nova[4], nova[5], nova[6]};
    }
}