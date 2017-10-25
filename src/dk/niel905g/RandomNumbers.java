package dk.niel905g;
/* Del af opgave 12.15 */
public class RandomNumbers {
    public static String randomNumbers(int size) {
        size = 120;
        String s = "";
        for (int i = 0; i < size; i++) {
            s += " " + (int) (Math.random() * 100);
        }

        return s;
    }
}
