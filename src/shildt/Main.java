package shildt;

/**
 * Created by Dendi on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isSimple(i)){
                System.out.printf("%d \t",i);
            }
        }

}

    private static boolean isSimple(int i) {
        for (int j = 2; j <= i/j; j++) {
            if (i%j==0) return false;
        }
        return true;

    }
    }
