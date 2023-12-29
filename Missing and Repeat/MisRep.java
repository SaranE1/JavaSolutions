public class MisRep {
    public static void main(String[] args) {
        int[] arr = new int[] { 7, 5, 2, 1, 4, 3, 2 };
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = 0;
        }
        for (int i : arr) {
            if (out[i - 1] == 0)
                out[i - 1] = 1;
            else
                out[i - 1] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (out[i] == 2)
                System.out.println("Repeating element : " + (i + 1));
            if (out[i] == 0)
                System.out.println("Missing Number : " + (i + 1));
        }
    }
}